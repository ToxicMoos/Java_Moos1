package All_Examples.Generics;

import java.util.Objects;

public class Generics {
    public static void main(String[] args) {
        Point<Integer> pt = new Point<Integer>(2,3);//создаем объект pt(ссылка на объект)  Point<Integer> типа  Integer
        Point<Integer> pt1 = new Point< >(4,5);//создаем объект pt1(ссылка на объект)  Point<> типа  Integer- pt1 и pt2 это одно и тоже,  второй раз её Integer>   можно не
        Point<String> ptStr = new Point<String>("Hello","World");
        Point<Double> ptDoub = new Point<Double>(17.03,23.11);
        Point<Float> ptFloat = new Point<>(1f,2f);
        Point<Boolean>ptBoolean = new Point<>(true,false);
        Game<Integer,String> gameIS =new Game<>(1978,"Olga");
//        pt.x =5;
//        pt1.y =6;
//        ptStr.x ="Helllo";
//        ptDoub.x = 23.78 ;
//        System.out.println(pt.x);
//        System.out.println(ptStr.x);
//        System.out.println(ptDoub.x);
        System.out.println(ptBoolean.getX());
        System.out.println(pt.getX()+" | "+ptStr.x);
        for (Object x: ptStr.getArrXY()) {
            System.out.println(x);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Оля " + gameIS.getName());



        }
    }
      class Point<T >{   //Т=type; создаем класс Point типа "generic"
        //fields

        public T x,y ;

        //constructor
        public Point(T x, T y) {
            this.x = x;
            this.y = y;
        }
        //getters




        public T getX() {
            return x;
        }

        public T getY() {
            return y;
        }
        //создаем getter массив
//        public T[] getArrXY(){  //так сделать не получится
//            return T[]{x,y};
//        }
        public Object[] getArrXY(){ //нужно вместо "T[] " создать "Object[]"
            return new Object[] {x,y}; //и вернуть new "Object[]"
        }

    }
      class  Game<T,V> {  //Т=type; создаем класс Point типа "generic" или через запятую V=type
        //fields
        public T id;
        public  V name;
        //constructor


        public Game(T id, V name) {
            this.id = id;
            this.name = name;
        }
        //getters

        public T getId() {
            return id;
        }

        public V getName() {
            return name;
        }
    }

