package com.bus.Dao.api;

import com.bus.model.GroupToDo;
import com.bus.model.ToDo;

import java.util.List;

public interface GroupToDoDAO {
    GroupToDo getGroupToDo(int id);
    public void addGroupToDo(ToDo toDo);
    public void deleteGroupToDo(int GroupToDoId);
    public void updateGroupToDo(ToDo toDo);
    List<ToDo> getAllToDo();
//    boolean GroupToDoExists();
}