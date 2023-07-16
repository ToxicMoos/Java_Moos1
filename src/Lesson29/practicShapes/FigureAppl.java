package Lesson29.practicShapes;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figure = new Shape[6]; //каждый новый класс в Java - это новый ТИП данных

        figure[0] = new Circle(10.0);//используем конструктор
        figure[1] = new Circle(3.0);//используем конструктор
        figure[2] = new Triangle(13,14,15);//используем конструктор
        figure[3] = new Square(10.0);//используем конструктор
        figure[4] = new Rectangle(10.0,5);//используем конструктор
        figure[5] = new Trapezoid(5.0,7.0,3,4,3);

        // решение "в лоб, перебор руками"

//         double s = figure[0].calcArea(figure[0].getLength()) + figure[1].calcArea(figure[1].getLength()) + figure[2].calcArea(5) + figure[3].calcArea(10);
//        System.out.println("S = " + s);
//
//        double p = figure[0].calcPerimetr(10) + figure[1].calcPerimetr(3) + figure[2].calcPerimetr(5) + figure[3].calcPerimetr(10);
//        System.out.println("P = " + p);


        //решение цикла for
//        double s1 = 0;
//        double p1 = 0;
//        for (int i = 0; i < figure.length; i++) {
//            s1=s1+figure[i].calcArea(figure[i].getLength());
//            p1=p1+figure[i].calcPerimetr(figure[i].getLength());
//        }
//        System.out.println("S1 calculated by loop "+s1);
//        System.out.println("P1 calculated by loop "+p1);
////        //решение цикла for-each
////        double s2 = 0;
////        double p2 = 0;
////        for (Shape fux:figure) { //все фигуры из массива Shape , fux название переменной, перебираем из figure
////            s2=s2+fux.calcArea(fux.getLength());
////            p2=p2+fux.calcArea(fux.getLength());
////        }
////        System.out.println("S2 решение цикла for-each "+s2);
////        System.out.println("P2 решение цикла for-each "+p2);
//
//
//
////        Рассчитайте общую площадь кругов из задачи 2.
//        Circle c1 = new Circle(10.0);
//        Circle c2 = new Circle(3.0);
//        double ss = c1.calcArea(10) + c2.calcArea(3.0);
//        System.out.printf("Sum of 2 circles area is " + ss);



        System.out.println("perimeter  "+figure[2].calcPerimeter() );
        System.out.println("area   "+figure[2].calcArea());



    }

}

