package homeWork15_1.cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3.0);
        Cube cube2 = new Cube(3.0);
        Cube cube3 = new Cube(3.0);

        double perimeter1 = cube1.perimeter(cube1.side);
        double area1 = cube1.area(cube1.side);
        double volume1 = cube1.volume(cube1.side);

        double perimeter2 = cube2.perimeter(cube2.side);
        double area2 = cube2.area(cube2.side);
        double volume2 = cube2.volume(cube2.side);

        double perimeter3 = cube3.perimeter(cube3.side);
        double area3 = cube3.area(cube3.side);
        double volume3 = cube3.volume(cube3.side);

        System.out.println("Cube 1 - Perimeter: " + perimeter1 + ", Area: " + area1 + ", Volume: " + volume1);
        System.out.println("Cube 2 - Perimeter: " + perimeter2 + ", Area: " + area2 + ", Volume: " + volume2);
        System.out.println("Cube 3 - Perimeter: " + perimeter3 + ", Area: " + area3 + ", Volume: " + volume3);
    }
}


