package com.bus.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "groupToDo")
public class GroupToDo implements Serializable {
    @OneToMany(targetEntity = ToDo.class, mappedBy = "groupTodo",
           cascade = CascadeType.ALL)
      @JsonIgnoreProperties("groupTodo")
//    @JsonBackReference
    private Set<ToDo> listOfBusiness = new HashSet<ToDo>();
    @Id
    @GeneratedValue
    @Column(name = "group_id")
    private int group_id;
    @Column(name = "nameOfToDo")
    private String nameOfToDo;
    public GroupToDo() {
    }

    public GroupToDo(int id, String nameOfToDo) {
        this.group_id = id;
        this.nameOfToDo = nameOfToDo;
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

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int id) {
        this.group_id = id;
    }

    public String getNameOfToDo() {
        return nameOfToDo;
    }

    public void setNameOfToDo(String nameOfToDo) {
        this.nameOfToDo = nameOfToDo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupToDo groupToDo = (GroupToDo) o;
        return group_id == groupToDo.group_id &&
                Objects.equals(listOfBusiness, groupToDo.listOfBusiness) &&
                Objects.equals(nameOfToDo, groupToDo.nameOfToDo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(listOfBusiness, group_id, nameOfToDo);
    }

    @Override
    public String toString() {
        return "GroupToDo{" +
                "listOfBusiness=" + listOfBusiness +
                ", group_id=" + group_id +
                ", nameOfToDo='" + nameOfToDo + '\'' +
                '}';
    }
}
