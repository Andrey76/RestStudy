package com.bus.Dao.api;

import com.bus.model.GroupToDo;

import java.util.List;

public interface GroupToDoDAO {
    GroupToDo getGroupToDoById(int id);
    public void addGroupToDo(GroupToDo groupToDo);
    public void deleteGroupToDo(int GroupToDoId);
    public void updateGroupToDo(GroupToDo groupToDo);
    public List<GroupToDo> getAllGroupToDo();
//    boolean GroupToDoExists();
}