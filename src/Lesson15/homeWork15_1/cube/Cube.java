package Lesson15.homeWork15_1.cube;

//Задача 1. Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p, площади s и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

    public class Cube {           //  этот файл - это и есть капсула для класса Cube
                                  // Название файла Класса - всегда с большой Буквы
        public double side;


        public Cube(double side) {
            this.side = side;
        }


        //Периметр: P = 12 * сторона
        //Площадь: S = 6 * сторона^2
        //Объем: V = сторона^3
        public double perimeter(double side) {
            return   12 * side;

        }

        public double area(double side) {
            return 6 * Math.pow(side, 2);

        }

        public double volume(double side) {
            return Math.pow(side, 3);

        }
    }

