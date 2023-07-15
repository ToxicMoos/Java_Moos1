package homeWork15_1.age;


public class CubeAppl {

        public static void main(String[] args) {
            // Создаем экземпляры класса Cube
            Cube cube1 = new Cube(3);
            Cube cube2 = new Cube(3);
            Cube cube3 = new Cube(3);

            // Вызываем методы класса Cube для каждого экземпляра
            double perimeter1 = cube1.calculatePerimeter();
            double area1 = cube1.calculateArea();
            double volume1 = cube1.calculateVolume();

            double perimeter2 = cube2.calculatePerimeter();
            double area2 = cube2.calculateArea();
            double volume2 = cube2.calculateVolume();

            double perimeter3 = cube3.calculatePerimeter();
            double area3 = cube3.calculateArea();
            double volume3 = cube3.calculateVolume();

            // Выводим результаты расчетов
            System.out.println("Cube 1: Perimeter = " + perimeter1 + ", Area = " + area1 + ", Volume = " + volume1);
            System.out.println("Cube 2: Perimeter = " + perimeter2 + ", Area = " + area2 + ", Volume = " + volume2);
            System.out.println("Cube 3: Perimeter = " + perimeter3 + ", Area = " + area3 + ", Volume = " + volume3);
        }
    }

