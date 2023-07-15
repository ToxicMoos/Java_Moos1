package homeWork17.pets;

public class Pets {

    public String type;
    public String breed;
    public String name;
    public int age;
    public double weight;
    public String accommodations;

    public Pets(String type, String breed, String name, int age, double weight, String accommodations) {
        this.type = type;
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.accommodations = accommodations;
    }

    public void eat (){
        System.out.println(" " +type+" "+ name+" eat ");
    }
    public void sleep(){
        System.out.println(" " +type+" "+ name+" sleep");
    }

    public void info(){
        System.out.println("animal type is: " + type);
        System.out.println("Breed is: "+breed);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+" years old");
        System.out.println("weight is: "+weight+" kg");
        System.out.println("Where does the animal live? "+accommodations);

    }

}

