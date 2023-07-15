package homeWork17.book;

//Создайте класс Dictionary, который расширяет класс Book. Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.
public class Dictionary extends Book{
    public String genre;
    public String type;

//конструктор принимает супер класс

    public Dictionary(String title, String author, int yearOfPublishing, long isbn, String genre, String type) {
        super(title, author, yearOfPublishing, isbn);
        this.genre = genre;
        this.type = type;
    }
    @Override
    public void display() {
        System.out.println("Genre: " + genre);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("book type: " + type);
        System.out.println();
    }
}






