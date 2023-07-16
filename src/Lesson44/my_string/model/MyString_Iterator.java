package Lesson44.my_string.model;

import java.util.Iterator;

public class MyString_Iterator implements Iterator<Character> {
    //fields
    private StringBuilder str;
    private int size;
    private int currentPosition;

    //constructor
    public MyString_Iterator(StringBuilder str){
        this.str=str;
        size = str.length();
       // currentPosition = 0;

    }

    //метод 1 - проверяет, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        
        return currentPosition < size;//логическое выражение ,которая отражает логику наличия
    }

    //метод 2 - возвращает элемент
    @Override
    public Character next() {
        Character curCharacter = str.charAt(currentPosition);
        currentPosition++;
        return curCharacter;
    }

    public void remove(){
        str.deleteCharAt(--currentPosition);
        size--;
    }



}
