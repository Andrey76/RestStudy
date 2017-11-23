package Dao.impl;

import Dao.api.ToDoDAO;
import Model.ToDo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ToDoDAOImpl implements ToDoDAO {
    @Autowired
    private SessionFactory sessionFactory;
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
    public ToDo getToDo(ToDo toDo) {
        return null;
    }
}
