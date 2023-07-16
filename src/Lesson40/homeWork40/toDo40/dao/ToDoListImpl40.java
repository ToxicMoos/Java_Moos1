package Lesson40.homeWork40.toDo40.dao;

import Lesson40.homeWork40.toDo40.model.Task40;

public class ToDoListImpl40 implements ToDoList40 {
    // fields
    Task40[] tasks40;
    int capacity40;

    //constructor


    public ToDoListImpl40(int capacity40) {
        this.capacity40 = capacity40;
    }

    @Override
    public boolean addTask(Task40 task40) {
        return false;
    }

    @Override
    public Task40 removeTask40(int id) {
        return null;
    }

    @Override
    public Task40 findTask40(int id) {
        return null;
    }

    @Override
    public void printTask40() {

    }

    @Override
    public int quantity() {
        return 0;
    }
}
