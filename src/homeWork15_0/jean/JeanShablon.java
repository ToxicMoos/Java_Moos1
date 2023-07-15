package homeWork15_0.jean;

public class JeanShablon {

    public String color;
    public int  size;

    public JeanShablon(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public void info(){
        System.out.println("Цвет джинс "+ color );
        System.out.println("Размер джинс "+ size );
    }



}
