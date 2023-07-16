package Lesson27.fun;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void myVoice() {
        System.out.println("Cat says meow");
    }
}
