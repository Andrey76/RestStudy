package com.bus.Controller;

import com.bus.model.GroupToDo;
import com.bus.Service.ServiceImpl.GroupToDoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupToDoController {

    private GroupToDoService groupToDoService;

    @RequestMapping(value = "/getGroupToDo/{id}", produces="application/json", method = RequestMethod.GET)
    public ResponseEntity GroupToDo(  @PathVariable("id") String id) {
        Integer id1 = Integer.valueOf(id);
        GroupToDo business = groupToDoService.getGroupToDo(id1);
        return ResponseEntity.ok().body(business);
    }
}
