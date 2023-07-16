package Lesson38.homeWork38;
//Задача 1. Используя ENUM для организации меню реализовать приложение "Список дел"
//TO DO LIST - список дел
//Меню приложения:
//1 добавить запись
//2 посмотреть все записи
//3 удалить запись (по номеру)
//4 выйти
//Использовать класс Task, который определить самостоятельно.

public enum ToDo_List {
    ADD(" Add a note "),
    VIEW_ALL("View all entries"),
    DELETE("Delete entry (by number"),
    EXIT("Go out");
    public String toDo;

//constructor
    ToDo_List(String toDo) {
        this.toDo = toDo;
    }

//getters and setters
    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }
}
