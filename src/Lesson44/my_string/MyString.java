package Lesson44.my_string;

import Lesson44.my_string.model.MyString_Iterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    //field
    private StringBuilder str;

    //constructor

    public MyString(String str) {
        this.str = new StringBuilder(str);
    }
    //getters and setters
    //убираем доступ к полю элемента класса

//    public StringBuilder getStr() {
//        return str;
//    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    //добавляет символ
    public void addChar(char c) {
        str.append(c);    // append -добавляет символ;
    }

    //удаляет символ
    public void removeChar(char c){
        int index = str.indexOf(Character.toString(c));//преобразовываем Char(Character) в Int в//нашли индекс, на котором стоит "с"
        str.deleteCharAt(index);
    }
    public String toString(){
        return str.toString();
    }
//метод, который возвращает объект типа - Iterator<Character>
    public Iterator<Character> iterator() {
        return new MyString_Iterator(str);
    }
}