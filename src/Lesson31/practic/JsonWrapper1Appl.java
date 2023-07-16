package Lesson31.practic;

public class JsonWrapper1Appl {
    public static void main(String[] args) {
        //Generics- параметры для классов и методов
        //{Имя : Sergey; Возраст : 45; ...} - так выглядит Json
        //{value: 45}

        JsonWrapper1 wrapper1 = new JsonWrapper1("10");
        System.out.println(wrapper1);
        System.out.println();
        Integer a = (int) wrapper1.getValue();

    }
}
