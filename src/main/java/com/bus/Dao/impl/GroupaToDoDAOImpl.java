package com.bus.Dao.impl;

import com.bus.Dao.api.GroupToDoDAO;
import com.bus.model.GroupToDo;
import com.bus.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class GroupaToDoDAOImpl implements GroupToDoDAO {

    List<GroupToDo> groupToDos = null;
    GroupToDo groupToDo = new GroupToDo();

    @Override
    public GroupToDo getGroupToDo(int id) {
        return null;
    }

    @Override
    public void addGroupToDo(ToDo toDo) {

    }

    @Override
    public void deleteGroupToDo(int GroupToDoId) {

    }

    @Override
    public void updateGroupToDo(ToDo toDo) {

    }


    @Override
    public List<ToDo> getAllToDo() {
        return null;
    }

//    public List<ToDo> list() {
//        Session session = sessionFactory.getCurrentSession();
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery<ToDo> cq = cb.createQuery(ToDo.class);
//        Root<ToDo> root = cq.from(ToDo.class);
//        cq.select(root);
//        Query<ToDo> query = session.createQuery(cq);
//        return query.getResultList();
//    }
}