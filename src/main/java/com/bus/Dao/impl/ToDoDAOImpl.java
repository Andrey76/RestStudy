package com.bus.Dao.impl;

import com.bus.Dao.api.ToDoDAO;
import com.bus.model.ToDo;
import org.springframework.context.annotation.Lazy;
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
    @Lazy
    @Override
    public List<ToDo> getAllToDo() {
//        String hql = "FROM ToDo as t INNER JOIN t.groupTodo as gt";
      String hql = "FROM ToDo as atcl ORDER BY atcl.id";
        List<ToDo> list = entityManager.createQuery(hql).getResultList();
        return list;
    }

}

