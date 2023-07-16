package Lesson44.my_string;
import java.util.Iterator;
import  Lesson44.my_string.model.MyString_Iterator;

public class myStringAppl   {
    public static void main(String[] args) {
        MyString myString = new MyString("Two beer, or not two beer");//объект нового класса MyString
        System.out.println(myString);

        Iterator<Character> iterator = myString.iterator();

        while(iterator.hasNext()){
            char ch = iterator.next();
            if (ch == 'e'){
                 iterator.remove();
            }
        }
        System.out.println(myString);

//        myString.addChar('!');
//        System.out.println(myString);
//        myString.removeChar('r');
//        System.out.println(myString);
//        //напечатать всё большими буквами
//
//        StringBuilder builder = null ; //в переменной builder переложили содержание myString с помощью get
//
//        System.out.println("-------"+builder);
//        for (int i = 0; i < builder.length(); i++) {
//            char c = builder.charAt(i);
//            c = Character.toUpperCase(c);
//            System.out.print(c);
//        }
//
//            //другой программист
//        System.out.println("-----------------------------");
//        System.out.println(builder);
//
//            builder.setLength(5);
//            System.out.println(builder);
//            System.out.println(myString);
        iterator = myString.iterator();
        while (iterator.hasNext()){
            char c = iterator.next();
            System.out.print(Character.toUpperCase(c));

        }


    }
}

