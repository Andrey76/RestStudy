package Dao.impl;

import Dao.api.ToDoDAO;
import Model.ToDo;
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
    //Session session = sessionFactory.openSession();

    @Override
    public ToDo addToDo(ToDo toDo) {
        return null;
    }

    @Override
    public ToDo deleteToDo(ToDo toDo) {
        return null;
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        return null;
    }

    @Override
    public ToDo getToDo(int id) {

        return entityManager.find(ToDo.class, id);
    }

    public List<ToDo> getToDo() {
        String hql = "FROM Model.ToDo as atcl ORDER BY atcl.id";
        return (List<ToDo>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public List<ToDo> getAllToDo() {
        String hql = "FROM Model.ToDo as atcl ORDER BY atcl.id";
        return (List<ToDo>) entityManager.createQuery(hql).getResultList();
    }

}
