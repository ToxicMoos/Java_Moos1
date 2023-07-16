package Lesson31.practic;

public class JsonWrapper2Appl {
    public static void main(String[] args) {
        JsonWrapper2<String> wrapper2 = new JsonWrapper2<>("hello");
        System.out.println(wrapper2);
        System.out.println();
        String a = wrapper2.getValue();
        System.out.println(a +  100);

        JsonWrapper2<Integer> wrapper21 =new JsonWrapper2<>(50);
        System.out.println(wrapper21);
        int b = wrapper21.getValue();
        System.out.println(b*10);

    }
}
