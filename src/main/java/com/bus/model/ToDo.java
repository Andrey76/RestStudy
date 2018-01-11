package com.bus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "todo")
public class ToDo implements Serializable {
    private static final long serialVersionUID = 12L;
    @Column(name = "business")
    private String business;
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(columnDefinition = "group_todo_group_to_do_id")
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

    @JsonIgnore
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return id == toDo.id &&
                Objects.equals(business, toDo.business) &&
                Objects.equals(groupTodo, toDo.groupTodo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(business, id, groupTodo);
    }
}
