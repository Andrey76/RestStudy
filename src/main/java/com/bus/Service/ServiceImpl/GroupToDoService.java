package com.bus.Service.ServiceImpl;

import com.bus.model.GroupToDo;

import java.util.List;

public interface GroupToDoService {
    GroupToDo getGroupToDo(int id);
    public GroupToDo addGroupToDo(GroupToDo groupToDo);
    public void deleteGroupToDo(int GroupToDoId);
    public void updateGroupToDo(GroupToDo groupToDo);
    public List<GroupToDo> getAllGroupToDo();
}
