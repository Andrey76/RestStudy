package Model;

import javax.persistence.*;


@Entity
@Table (name = "toDo")
public class ToDo {
    private String business;
    @Id
    @Column(name = "toDo_id")
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(columnDefinition = "group_id")
    private GroupToDo groupTodo;

    public ToDo() {
    }

    public ToDo(String business) {
        this.business = business;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GroupToDo getGroupTodo() {
        return groupTodo;
    }

    public void setGroupTodo(GroupToDo groupTodo) {
        this.groupTodo = groupTodo;
    }

    @Override
    public String toString() {
        return "Model.ToDo{" +
                "business='" + business + '\'' +
                '}';
    }
}
