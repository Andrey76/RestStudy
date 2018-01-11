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

    @RequestMapping(value = "/todo/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<ToDo> getToDo(@PathVariable("id") int id) {
        ToDo toDo1 = toDoService.getToDo(id);
        return new ResponseEntity<ToDo>(toDo1, HttpStatus.OK);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ToDo>> getAllToDo() {
        List<ToDo> list = toDoService.getAllToDo();
        if (list.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<ToDo>>(list, HttpStatus.OK);
}

    @RequestMapping(path="/add",method=RequestMethod.POST)
    public ResponseEntity<Void> create(@RequestBody ToDo toDo) {
            ToDo toDo1 = toDoService.addToDo(toDo);
        try {
            return ResponseEntity.created(new URI("/add/"+ toDo.getId())).build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}



