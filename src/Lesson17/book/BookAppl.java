package Lesson17.book;

public class BookAppl {
    public static void main(String[] args) {
//Создайте класс Dictionary, который расширяет класс Book. Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.

        // Создание нескольких экземпляров класса Dictionary

        Dictionary dict1 = new Dictionary("The Great Gatsby","F. Scott Fitzgerald",1925,9781234567890L,"Roman","Book");
        Dictionary dict2 = new Dictionary("The Lord of the Rings","John Ronald Tolkien",1954,9641234567891L,"Phantasy","AudioBok");

        dict1.display();
        System.out.println();
        dict2.display();
    }

}
