package Lesson42.practice.toDo_v2.dao;
import Lesson42.practice.toDo_v2.model.Task;

import java.io.*;

public class ToDoListImpl implements ToDoList {
// TODO - add file name for tasks
    final String OUTPUT = "task.txt";
    final String INPUT = "task.txt";

    private Task[] tasks;
    private int capacity;
    private int quantity;

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
        this.quantity = 0;
    }

    public boolean addTask(Task task) {
        if (task != null) {
            tasks[quantity] = task;
            quantity++;
            return true;
        }
        return false;
    }

    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task removedTask = tasks[i];
                for (int j = i; j < quantity - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }
                tasks[quantity - 1] = null;
                quantity--;
                // устанавливаем новые индексы c 0 и подряд
                for (int j = 0; j < quantity; j++) {
                    tasks[j].setId(j);
                }
                return removedTask;
            }
        }
        return null;
    }

    @Override
    public Task findTask(int id) {
        // find by id
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task findedTask = tasks[i];
                return findedTask;
            }
        }
        return null;
    }

    @Override
    public void printTasks() {
        // for loop, print tasks
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public void readTask() throws IOException {
        //TODO -add method readTask()
        //задачи надо считать тоже в цикле по строкам
        //стороку надо превратить в объект task: номер строки -это : "id",а то что стоит после ":" - это содержание задачи
        BufferedReader bufReader = new BufferedReader(new FileReader(INPUT));
        String str;
        int countTasks = 0;
        while ((str = bufReader.readLine()) != null){
            int index =str.indexOf(':'); //нашли индекс символа ":"
            String t = str.substring(index + 1,str.length());//выкусили из строки текст после" : "
            Task task = new Task(t);//создали новый объект класса task
            tasks[countTasks] = task;//поместили эту задачу в массив
            countTasks++;//увеличили счётчик на 1
            quantity++;

        }
        }




    //TODO - add method saveTasks()
    @Override
    public void saveTasks() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT));//// Создание объекта BufferedWriter для записи данных в файл.new FileWriter(OUTPUT) создает объект FileWriter для файла с именем, указанным в переменной OUTPUT. Этот файл будет использоваться для сохранения данных.
        for (int i = 0; i < quantity; i++) {
            String str = String.valueOf(tasks[i]);// Получение i-го элемента из массива tasks и преобразование его в строку.
            bufferedWriter.write(str + "\n");
        }
        bufferedWriter.flush();//толчок к исполнению. Все буферизованные данные записываются в файл. Этот шаг гарантирует, что данные действительно будут записаны на диск.

    }
}







