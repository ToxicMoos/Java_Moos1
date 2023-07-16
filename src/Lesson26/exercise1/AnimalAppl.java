package Lesson26.exercise1;

public class AnimalAppl {
    public static void main(String[] args) {
        Cat cat = new Cat() {
            @Override
            public void sleep() {
                super.sleep();
            }

            @Override
            public void makeSound() {
                super.makeSound();
            }
        };
         Pig pig = new Pig() {
             @Override
             public void sleep() {
                 super.sleep();
             }

             @Override
             public void makeSound() {
                 super.makeSound();
             }
         };
         cat.makeSound();
         cat.sleep();
         pig.makeSound();
         pig.sleep();

    }
}
