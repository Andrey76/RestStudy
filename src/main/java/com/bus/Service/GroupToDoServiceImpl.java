package com.bus.Service;

import com.bus.Dao.api.GroupToDoDAO;
import com.bus.Service.ServiceImpl.GroupToDoService;
import com.bus.model.GroupToDo;
import com.bus.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GroupToDoServiceImpl implements GroupToDoService {

    @Autowired
    private GroupToDoDAO groupToDoDAO;


    @Override
    public GroupToDo getGroupToDo(int id) {
        return groupToDoDAO.getGroupToDo(id);
    }

    @Override
    public void addGroupToDo(GroupToDo groupToDo) {

    }

    @Override
    public void deleteGroupToDo(int GroupToDoId) {

    }

    @Override
    public void updateGroupToDo(GroupToDo groupToDo) {

    }

    @Override
    public List<ToDo> getAllToDo() {
        return null;
    }
}
