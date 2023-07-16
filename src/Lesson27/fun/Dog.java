package Lesson27.fun;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void myVoice() {
        System.out.println("Dog bark woof woof");
    }
}
