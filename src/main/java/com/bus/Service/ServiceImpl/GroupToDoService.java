package com.bus.Service.ServiceImpl;

import com.bus.model.GroupToDo;
import com.bus.model.ToDo;

import java.util.List;

public interface GroupToDoService {
    GroupToDo getGroupToDo(int id);
    public void addGroupToDo(GroupToDo groupToDo);
    public void deleteGroupToDo(int GroupToDoId);
    public void updateGroupToDo(GroupToDo groupToDo);
    List<ToDo> getAllToDo();
}
