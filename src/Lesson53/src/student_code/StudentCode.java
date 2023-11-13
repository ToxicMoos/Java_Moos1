package Lesson53.src.student_code;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentCode {
    public static void main(String[] args) {
        int capacity = 16;
        ArrayList<LinkedList<String>> buckets = new ArrayList<>(capacity);
        for (int i = 0; i < 16; i++) {
            buckets.add(new LinkedList<String>());
        }

        String str1 = "one";
        int hash1 = str1.hashCode();
        int indexOfBuckets1 = hash1 % capacity;
        System.out.println(str1 +" hashcode = "+ hash1 + " bucket number = hashCode % 16 = "+(hash1 % capacity));

        String str2 = "two";
        int hash2 = str2.hashCode();
        int indexOfBuckets2 = hash2 % capacity;
        System.out.println(str2 +" hashcode = "+ hash2 + " bucket number = hashCode % 16 = "+(hash2 % capacity));

        String str3 = "three";
        int hash3 = str3.hashCode();
        int indexOfBuckets3 = hash3 % capacity;
        System.out.println(str3 +" hashcode = "+ hash3 + " bucket number = hashCode % 16 = "+(hash3 % capacity));

        String str4 = "four";
        int hash4 = str4.hashCode();
        int indexOfBuckets4 = hash4 % capacity;
        System.out.println(str4 + " hashcode = " + hash4 + " bucket number = hashCode % 16 =  "+(hash4 % capacity));

        String str5 = "five";
        int hash5 = str5.hashCode();
        int indexOfBuckets5 = hash5 % capacity;
        System.out.println(str5 + " hashcode = " + hash5 + " bucket number = hashCode % 16 =  "+(hash5 % capacity));
    if (!buckets.get(indexOfBuckets1).contains(str1))  //если в данной корзине,в данном линкед листе нет такого объекта, только в этом случае я туда его добавлю
        buckets.get(indexOfBuckets1).add(str1);// = LinkedList<String> list1 = buckets.get(indexOfBuckets1); list.add(str1)

        if (!buckets.get(indexOfBuckets2).contains(str2))
            buckets.get(indexOfBuckets2).add(str2);// = LinkedList<String> list2 = buckets.get(indexOfBuckets2); list.add(str2)

        if (!buckets.get(indexOfBuckets3).contains(str3))
        buckets.get(indexOfBuckets3).add(str3);// = LinkedList<String> list3 = buckets.get(indexOfBuckets3); list.add(str3)

        if (!buckets.get(indexOfBuckets4).contains(str4))
        buckets.get(indexOfBuckets4).add(str4);// = LinkedList<String> list4 = buckets.get(indexOfBuckets3); list.add(str4)

        for (LinkedList<String> bucket : buckets) {
            System.out.println(bucket);
        }

    }
}
