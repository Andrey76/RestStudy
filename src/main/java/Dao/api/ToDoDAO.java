package Dao.api;

import Model.ToDo;


public interface ToDoDAO {
    public ToDo addToDo(ToDo toDo);
    public ToDo deleteToDo(ToDo toDo);
    public ToDo updateToDo(ToDo toDo);
    public ToDo getToDo(ToDo toDo);
}
