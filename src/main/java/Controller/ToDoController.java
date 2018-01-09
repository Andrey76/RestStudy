package Controller;

import Model.ToDo;
import Service.ServiceImpl.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;
    @RequestMapping(value = "/todo/{id}", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<ToDo> getToDo(@PathVariable("id") int id) {
        ToDo toDo1 = toDoService.getToDo(id);
        return new ResponseEntity<ToDo>(toDo1, HttpStatus.OK);
    }
    @GetMapping("todo1")
    public ResponseEntity<List<ToDo>> getAllToDo() {
        List<ToDo> list = toDoService.getAllToDo();
        return new ResponseEntity<List<ToDo>>(list, HttpStatus.OK);
    }
}




