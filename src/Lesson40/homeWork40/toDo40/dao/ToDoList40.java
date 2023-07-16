package Lesson40.homeWork40.toDo40.dao;

import Lesson40.homeWork40.toDo40.model.Task40;

public interface ToDoList40 {
    //add Task
    boolean addTask(Task40 task40);

    //removeTask40
 Task40 removeTask40(int id);

    //findTask40
 Task40 findTask40(int id);

    // print list of Tasks
    void printTask40();

    // quantity of tasks
    int quantity();



}
