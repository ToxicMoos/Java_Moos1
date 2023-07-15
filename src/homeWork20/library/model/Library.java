package homeWork20.library.model;

import java.util.Random;

public class Library {
    private Book[] books;//массив типа Book, куда попадут все книги в библиотеке
    public int size;//количество книг в библиотеке

    public Library(int capacity){//метод класса который задает размер библиотеки, т.е длину массива Book
        books = new Book[capacity];
    }

    //добавление книги

    public boolean addBook(Book book){
        if((size == books.length) || findBook(book.getIsbn()) != null){
            return false; // не можем добавить книгу,так как нет места или такая книга уже есть

        }
        books[size]=book; //помещаем книгу в массив
        size ++;
        return true;
    }
    //метод поиска книги по isbn
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (books[i].getIsbn() == isbn) {//проверяем совпадение ISBN
                return books[i];//возвращаем элемент массива типа Book
            }
        }
        return null;
    }
    //удаление книги
}





