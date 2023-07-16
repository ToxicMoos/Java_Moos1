package Lesson17.pets;

public class Dog extends Pets {


    public Dog(String type, String breed, String name, int age, double weight, String accommodations) {
        super(type, breed, name, age, weight, accommodations);
    }


    public void voiceDog(){
      System.out.println(" " +type+" "+name+" says - Woof Woof!");
  }
    public void runDog(){
      System.out.println(" " +type+" "+name+" goes for a walk outside!");
  }
}
