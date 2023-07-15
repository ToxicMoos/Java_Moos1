package homeWork15_2.xxx.model;
//Создать класс Book в пакете xxx.book.model.
// В этом классе определить поля: private long isbn; private String title; private String author; private int yearOfPublishing;
// Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей при отсутствии автора.
// Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры, исходя из логики и необходимости.
// Создать метод public void display() для печати в консоль информации о книге.

public class Book {
    //// В этом классе определить поля
    private long isbn;        //ISBN (International Standard Book Number) – это международный стандартный номер книги.  Номер ISBN состоит из 13 цифр
    private String title;
    private String author;
    private int yearOfPublishing;

//конструктор для иницализации всех полей
    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

//конструктор для инициализации полей при отсутствии автора


    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    //// Метод display для печати информации о книге

    public void display1(){
        System.out.println("Author - "+author);
        System.out.println("Title of book - " + title );
        System.out.println("Year Of Publishing - " + yearOfPublishing);
        System.out.println("ISBN - " + isbn );

    }

    public void display2(){
        System.out.println("Title of book - " + title + ",Year Of Publishing - " + yearOfPublishing + " ISBN - " + isbn );
    }
}
