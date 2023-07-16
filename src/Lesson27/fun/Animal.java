package Lesson27.fun;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void myVoice();
    public void sleep(){
        System.out.println("Zz");
    }
}
