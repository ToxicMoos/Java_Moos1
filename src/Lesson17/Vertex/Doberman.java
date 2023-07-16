package Lesson17.Vertex;

public class Doberman extends Dog{
    public Doberman() {
    }
    @Override
    public void voice(){
        super.voice();
        System.out.println("Woof from Doberman class! ");
    }
}
