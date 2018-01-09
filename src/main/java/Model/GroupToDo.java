package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="groupToDo")
public class GroupToDo implements Serializable {
//    @OneToMany(targetEntity = ToDo.class, mappedBy = "groupTodo")
//    private Set<ToDo> listOfBusiness = new HashSet<ToDo>();
    @Id
    @Column(name = "groupToDo_id")
    @GeneratedValue
    private int id;
    public GroupToDo() {
    }
//    public GroupToDo(int id) {
//        this.id = id;
//    }
//    public GroupToDo(Set<ToDo> listOfBusiness) {
//        this.listOfBusiness = listOfBusiness;
//    }
//
//
//    public Set<ToDo> getListOfBusiness() {
//        return listOfBusiness;
//    }
//
//    public void setListOfBusiness(Set<ToDo> listOfBusiness) {
//        this.listOfBusiness = listOfBusiness;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GroupTodo{" +
//                "listOfBusiness=" + listOfBusiness +
                '}';
    }
}
