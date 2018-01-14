package com.bus.Service;

import com.bus.Dao.api.GroupToDoDAO;
import com.bus.Service.ServiceImpl.GroupToDoService;
import com.bus.model.GroupToDo;
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

        return groupToDoDAO.getGroupToDoById(id);
    }

    @Override
    public GroupToDo addGroupToDo(GroupToDo groupToDo) {
    groupToDoDAO.addGroupToDo(groupToDo);
    return groupToDo;
    }

    @Override
    public void deleteGroupToDo(int groupToDoId) {
        groupToDoDAO.deleteGroupToDo(groupToDoId);
    }

    @Override
    public void updateGroupToDo(GroupToDo groupToDo) {
        groupToDoDAO.updateGroupToDo(groupToDo);

    }

    @Override
    public List<GroupToDo> getAllGroupToDo() {
      // groupToDoDAO.getAllGroupToDo();
        return groupToDoDAO.getAllGroupToDo();
    }
}
