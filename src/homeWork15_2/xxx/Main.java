package homeWork15_2.xxx;
import  homeWork15_2.xxx.model.Book;

//Создать класс Book в пакете xxx.book.model.
// В этом классе определить поля: private long isbn; private String title; private String author; private int yearOfPublishing;
// Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей при отсутствии автора.
// Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры, исходя из логики и необходимости.
// Создать метод public void display() для печати в консоль информации о книге.
public class Main {
    public static void main(String[] args) {
        //создание обьекта из класса Book
        Book book1 = new Book(978042506-8274," Death world ","  Harry Harrison  ",1960);
        Book book2 = new Book(978581126-1147," Last of the Magician "," James Fenimore Cooper",1826);

        // получаем  имя автора через метод getter
        System.out.println("get data via getter method");
        System.out.println("Author "+book1.getAuthor());

        //изменение имя Title через метод setter
        book1.setAuthor("");

    //информация о книге
        book1.display2();
        System.out.println();
        book2.display1();


    }
}
