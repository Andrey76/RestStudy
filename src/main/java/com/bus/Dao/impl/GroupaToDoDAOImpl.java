package com.bus.Dao.impl;

import com.bus.Dao.api.GroupToDoDAO;
import com.bus.model.GroupToDo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Transactional
@Repository
public class GroupaToDoDAOImpl implements GroupToDoDAO {
    @PersistenceContext
    private EntityManager entityManager;
    List<GroupToDo> groupToDos = null;
    GroupToDo groupToDo = new GroupToDo();

    @Override
    public GroupToDo getGroupToDoById(int id) {

        return entityManager.find(GroupToDo.class, id);
    }

    @Override
    public void addGroupToDo(GroupToDo groupToDo) {
    entityManager.persist(groupToDo);
    }

    @Override
    public void deleteGroupToDo(int groupToDoId) {
    entityManager.remove(getGroupToDoById(groupToDoId));
    }

    @Override
    public void updateGroupToDo(GroupToDo groupToDo) {
        GroupToDo groupToDo1 = getGroupToDoById(groupToDo.getGroup_id());
        groupToDo1.setNameOfToDo(groupToDo.getNameOfToDo());
        entityManager.flush();

    }


    @Override
    public List<GroupToDo> getAllGroupToDo() {
        String hql = "FROM GroupToDo as atcl ORDER BY atcl.group_id";
        List<GroupToDo> list = entityManager.createQuery(hql).getResultList();
        return list;
    }
}