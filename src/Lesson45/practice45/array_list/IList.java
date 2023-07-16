package Lesson45.practice45.array_list;

public interface IList<E> extends Iterable<E>{
    //опишем методы которые нам нужны для работы со списком ,куда могут попасть любые типы данных
    //int, boolean , String и тд. типы на основе классов Car, Pet и т.д


    int size();//отвечает метод за размер "IList"

    default boolean isEmpty(){//позволяет проверить лист, пустой или нет
        return size() == 0;
    }

    void clear();   //удаляет все элементы
    boolean add(E element);//добавляет элемент
    default boolean contains(Object o){    //есть такой элемент в листе или его нет?
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o) {// удаляем объект элемента списка, если нашёл true и т.д
       int index = indexOf(o);
       if (index < 0){//когда объект не нашёлся в списке
           return false;
       }
       remove(index);
       return true;
    }

    boolean add(int index, E element);//вставка на место по индексу
    E get(int index);//получает элемент по индексу
    int indexOf(Object o);//узнать индекс элемента списка
    int lastIndexOf(Object o);//ищем индекс с конца списка, в направление его начала
    E remove(int index);//удаляем по индексу
    E set(int index,E element);//

}