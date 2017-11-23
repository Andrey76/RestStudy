package Dao.impl;

import Dao.api.GroupToDoDAO;
import Model.GroupToDo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GroupaToDoDAOImpl implements GroupToDoDAO{
    @Autowired
    private SessionFactory sessionFactory;
    List<GroupToDo> groupToDos = null;
    GroupToDo groupToDo = new GroupToDo();
    @Override
    public GroupToDo getGroupToDo(int id) {
        return sessionFactory.getCurrentSession().get(GroupToDo.class, id);
    }

    @Override
    public GroupToDo getGroupToDo() {
        return null;
    }

//    @Override
//    public List<ToDo> list() {
//        Session session = sessionFactory.getCurrentSession();
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery<ToDo> cq = cb.createQuery(ToDo.class);
//        Root<ToDo> root = cq.from(ToDo.class);
//        cq.select(root);
//        Query<ToDo> query = session.createQuery(cq);
//        return query.getResultList();
//    }
}
