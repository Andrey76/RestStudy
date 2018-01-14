package com.bus.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "groupToDo")
public class GroupToDo implements Serializable {
    @OneToMany( mappedBy = "groupTodo", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("groupTodo")
//        @JsonBackReference
    private Set<ToDo> listOfBusiness = new HashSet<ToDo>();
    @Id
    @GeneratedValue
    @Column(name = "group_id")
    private int group_id;
    @Column(name = "nameOfToDo")
    private String nameOfToDo;
    public GroupToDo() {
    }

    public GroupToDo( String nameOfToDo) {
        this.nameOfToDo = nameOfToDo;
    }
    public GroupToDo(int id, String nameOfToDo, Set<ToDo> listOfBusinesss) {
        this.group_id = id;
        this.nameOfToDo = nameOfToDo;
        this.listOfBusiness = listOfBusinesss;
    }


    public GroupToDo(Set<ToDo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }
//    @JsonIgnore
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
}
