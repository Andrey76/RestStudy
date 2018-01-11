package com.bus.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "groupToDo")
public class GroupToDo implements Serializable {
    private static final long serialVersionUID = 1222L;
    @OneToMany(targetEntity = ToDo.class, mappedBy = "groupTodo")
    private Set<ToDo> listOfBusiness = new HashSet<ToDo>();
    @Id
    @Column(name = "group_to_do_id")
    @GeneratedValue
    private int id;

    public GroupToDo() {
    }

    public GroupToDo(int id) {
        this.id = id;
    }

    public GroupToDo(Set<ToDo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    public Set<ToDo> getListOfBusiness() {
        return listOfBusiness;
    }

    public void setListOfBusiness(Set<ToDo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GroupTodo{" +
                "listOfBusiness=" + listOfBusiness +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupToDo groupToDo = (GroupToDo) o;
        return id == groupToDo.id &&
                Objects.equals(listOfBusiness, groupToDo.listOfBusiness);
    }

    @Override
    public int hashCode() {

        return Objects.hash(listOfBusiness, id);
    }
}
