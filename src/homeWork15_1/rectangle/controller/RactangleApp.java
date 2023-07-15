package homeWork15_1.rectangle.controller;
import  homeWork15_1.rectangle.controller.model.Rectangle;

public class RactangleApp {
    public static void main(String[] args) {

        //создаем обьект типа rectangle
        Rectangle rectangle1 = new Rectangle(10,25);
        System.out.println(rectangle1.peimeter(10,25));
        double s =rectangle1.square(10,25);
        System.out.println("Square is: "+s);

    }

}
