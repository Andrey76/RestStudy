package com.bus.Dao.api;

import com.bus.model.ToDo;

import java.util.List;


public interface ToDoDAO {
    public void addToDo(ToDo toDo);
    public void deleteToDo(int todoId);
    public void updateToDo(ToDo toDo);
    public ToDo getToDo(int id);
    List<ToDo> getAllToDo();
//    boolean toDoExists(String business);
}
