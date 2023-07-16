package Lesson40.homeWork40.toDo40.model;

import java.util.Objects;

public class Task40 implements Comparable<Task40>{
    //fields
    private int id;
    private String task;
    //constructor

    public Task40(int id, String task) {
        this.id = id;
        this.task = task;
    }
    //getters & setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    //toString

    @Override
    public String toString() {
        return "Task40{" + "id=" + id + ", task='" + task +  '}';
    }
    //Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task40 task40 = (Task40) o;
        return id == task40.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //compareTo
    @Override
    public int compareTo(Task40 obj) {// естественная сортировка по id, от меньшего к большему
        return this.id - obj.id;
    }


}
