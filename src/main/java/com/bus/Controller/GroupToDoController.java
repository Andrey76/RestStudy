package com.bus.Controller;

import com.bus.Service.ServiceImpl.GroupToDoService;
import com.bus.model.GroupToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class GroupToDoController {

    @Autowired
    private GroupToDoService groupToDoService;

    @GetMapping(value = "/getGroupToDo/{id}", produces="application/json")
    public ResponseEntity getGroupToDo(  @PathVariable("id") int id) {
        Integer id1 = Integer.valueOf(id);
        GroupToDo business = groupToDoService.getGroupToDo(id);
        return ResponseEntity.ok().body(business);
    }
@GetMapping (value = "/getallgr", produces = "application/json")
    public ResponseEntity<List<GroupToDo>> getAllGroupToDo(){
        List<GroupToDo> list = groupToDoService.getAllGroupToDo();
        if (list.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<GroupToDo>>(list, HttpStatus.OK);
    }
    @DeleteMapping (value = "delgr/{id}",  produces = "application/json")
    public ResponseEntity<Void> deleteGrToDo( @PathVariable("id") int id){
            groupToDoService.deleteGroupToDo(id);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    @PostMapping(value = "/creategr")
    public ResponseEntity<GroupToDo> createGroup (@RequestBody GroupToDo groupToDo){
        GroupToDo groupToDo1 = groupToDoService.addGroupToDo(groupToDo);
        try {
            return ResponseEntity.created(new URI("/add/"+groupToDo.getGroup_id())).build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
    @PutMapping(value = "/updategr")
    public ResponseEntity<GroupToDo> updateGroup(@RequestBody GroupToDo groupToDo){
        groupToDoService.updateGroupToDo(groupToDo);
        return new ResponseEntity<GroupToDo>(groupToDo, HttpStatus.OK);
    }
}
