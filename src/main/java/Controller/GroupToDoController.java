package Controller;

import Model.GroupToDo;
import Service.GroupToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupToDoController {
    @Autowired
    private GroupToDoService groupToDoService;

    @GetMapping("/getGroupToDo")
    public ResponseEntity GroupToDo (int id) {
        GroupToDo business = groupToDoService.getGroupToDo(id);
        return ResponseEntity.ok().body(business);
    }
}
