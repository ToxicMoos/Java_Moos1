package All_Examples.GenericMethods;

public class GenericMethods {
    public static void main(String[] args) {
        Point1<Double> point1 = new Point1<Double>(5.4, 45.9);
       point1.info();


    }
}
          class Point1<T  >  {   //Т=type; создаем класс Point1 типа "generic"
            //fields
            public T x,y;
            //constructor

            public Point1(T x, T y) {
                this.x = x;
                this.y = y;
            }
            //getters


            //methods
              public void info(){
                  System.out.println("Fun");
              }

}


