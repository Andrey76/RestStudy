package com.bus.Service;

import com.bus.Dao.api.ToDoDAO;
import com.bus.Service.ServiceImpl.ToDoService;
import com.bus.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoDAO toDoDAO;

    @Override
    public ToDo addToDo(ToDo toDo) {
    toDoDAO.addToDo(toDo);
        return toDo;
    }

    @Override
    public void deleteToDo(int todoId) {
    toDoDAO.deleteToDo(todoId);
    }

    @Override
    public void updateToDo(ToDo toDo) {
    toDoDAO.updateToDo(toDo);
    }

    @Override
    public ToDo getToDo(int id) {
        ToDo obj = toDoDAO.getToDo(id);
        return obj;
    }

    @Override
    public List<ToDo> getAllToDo() {
       List <ToDo> toDoList = toDoDAO.getAllToDo();
        return toDoList;
    }
}
