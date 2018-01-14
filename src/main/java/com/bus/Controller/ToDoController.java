package com.bus.Controller;

import com.bus.Service.ServiceImpl.ToDoService;
import com.bus.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping(value = "/todo/{id}", produces = "application/json")
    public ResponseEntity<ToDo> getToDo(@PathVariable("id") int id) {
        ToDo toDo1 = toDoService.getToDo(id);
        return new ResponseEntity<ToDo>(toDo1, HttpStatus.OK);
    }

    @GetMapping(value = "/todos", produces = "application/json")
    public ResponseEntity<List<ToDo>> getAllToDo() {
        List<ToDo> list = toDoService.getAllToDo();
        if (list.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<ToDo>>(list, HttpStatus.OK);
}

    @PostMapping(path="/add")
    public ResponseEntity<Void> create(@RequestBody ToDo toDo) {
            ToDo toDo1 = toDoService.addToDo(toDo);
        try {
            return ResponseEntity.created(new URI("/add/"+ toDo1.getId())).build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
    @PutMapping(value = "/updatet", produces = "application/json")
    public ResponseEntity<ToDo> update(@RequestBody ToDo toDo){
        toDoService.updateToDo(toDo);
        return new ResponseEntity<ToDo>(toDo, HttpStatus.OK);
    }
    @DeleteMapping("todo/{id}")
    public ResponseEntity<Void> deleteTodo (@PathVariable("id") int id){
        toDoService.deleteToDo(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}



