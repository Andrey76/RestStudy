package com.bus.Dao.impl;

import com.bus.Dao.api.ToDoDAO;
import com.bus.model.ToDo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class ToDoDAOImpl implements ToDoDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void addToDo(ToDo toDo) {
        entityManager.persist(toDo);
    }

    @Override
    public void deleteToDo(int todoId) {
    entityManager.remove(getToDo(todoId));
    }

    @Override
    public void updateToDo(ToDo toDo) {
    entityManager.merge(toDo);
    }

    @Override
    public ToDo getToDo(int id) {

        return entityManager.find(ToDo.class, id);
    }

    @Override
    public List<ToDo> getAllToDo() {
        String hql = "FROM ToDo as atcl ORDER BY atcl.id";
        return (List<ToDo>) entityManager.createQuery(hql).getResultList();
    }

}
