package Service;

import Dao.api.GroupToDoDAO;
import Model.GroupToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class GroupToDoServiceImpl implements GroupToDoService {

    @Autowired
    private GroupToDoDAO groupToDoDAO;

//    @Override
//    public List<ToDo> list() {
//        return groupToDoDAO.list();
//    }

    @Override
    public GroupToDo getGroupToDo(int id) {
        return groupToDoDAO.getGroupToDo(id);
    }
}
