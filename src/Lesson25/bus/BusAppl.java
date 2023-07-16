package Lesson25.bus;

public class BusAppl {
    public static void main(String[] args) {
//создание объекта
     Bus bus1 = new Bus(" 123 ",100,30,80);
     Bus bus2 = new Bus(" 345 ",150,40,90);
     Bus bus3 = new Bus(" 567 ",200,50,100);
//вызов объекта
      bus1.go();
      bus1.speedUp(30);
      bus1.speedDown(40);
      bus1.stop();
        System.out.println();
      bus2.go();
      bus2.speedUp(30);
      bus2.speedDown(40);
      bus2.stop();




    }


}
