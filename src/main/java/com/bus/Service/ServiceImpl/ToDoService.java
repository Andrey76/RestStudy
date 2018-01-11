package com.bus.Service.ServiceImpl;

import com.bus.model.ToDo;

import java.util.List;

/**
 * Created by andr_ on 23.11.2017.
 */
public interface ToDoService {
    public ToDo addToDo(ToDo toDo);
    public void deleteToDo(int todoId);
    public void updateToDo(ToDo toDo);
    public ToDo getToDo(int id);
    List<ToDo> getAllToDo();
}
