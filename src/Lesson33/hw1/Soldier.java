package Lesson33.hw1;

 //Создать класса Soldier (name, height, weight, profile). Profile = 1 до 99.
public class Soldier {
//поля класса
    private String name;
    private double height;
    private double weight;
    private int profile;
//constructor

     public Soldier(String name, double height, double weight, int profile) {
         this.name = name;
         this.height = height;
         this.weight = weight;
         this.profile = profile;
     }
 //getters and setters

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public double getWeight() {
         return weight;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     public int getProfile() {
         return profile;
     }

     public void setProfile(int profile) {
         this.profile = profile;
     }
     //toString
     @Override
     public String toString() {
         return "Soldier{" + "name='" + name   + ", height=" + height + ", weight=" + weight + ", profile=" + profile + '}';
     }
     //Equals and hashCode

 }
