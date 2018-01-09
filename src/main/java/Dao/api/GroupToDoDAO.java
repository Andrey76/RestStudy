package Dao.api;

import Model.GroupToDo;

public interface GroupToDoDAO {
    GroupToDo getGroupToDo(int id);

    public GroupToDo getGroupToDo();

//    List<ToDo> list();
}