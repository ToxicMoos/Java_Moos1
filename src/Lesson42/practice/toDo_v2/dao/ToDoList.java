package Lesson42.practice.toDo_v2.dao;

import Lesson42.practice.toDo_v2.model.Task;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ToDoList {

        // add Task
        boolean addTask(Task task);

        // remove Task
        Task removeTask(int id);

        // find Task
        Task findTask(int id);

        // print list of Tasks
        void printTasks();

        // quantity of tasks
        int quantity();

        // read tasks from file
        void readTask() throws IOException;

        // save tasks to file
        void saveTasks() throws IOException;

    }
