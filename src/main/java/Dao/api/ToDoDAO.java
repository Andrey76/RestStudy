package Dao.api;

import Model.ToDo;

import java.util.List;


public interface ToDoDAO {
    public ToDo addToDo(ToDo toDo);
    public ToDo deleteToDo(ToDo toDo);
    public ToDo updateToDo(ToDo toDo);
    public ToDo getToDo(int id);
    public List getToDo();
    List<ToDo> getAllToDo();

}
