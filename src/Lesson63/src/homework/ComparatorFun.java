package Lesson63.src.homework;

import java.util.*;

public class ComparatorFun {
    public static void main(String[] args) {

        Person person1 = new Person("Rambo",37);
        Person person2 = new Person("Yam ",52);
        Person person3 = new Person("Jemmy",25);
        Person person4 = new Person("Bobby",35);
        Person person5 = new Person("Andy",40);

        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
        Comparator<Person> compositeComparator = nameComparator.thenComparing(ageComparator);// Применяем метод thenComparing() для создания композитного компаратора
//В этом примере мы сначала создаем компаратор для сортировки по имени (nameComparator),
// а затем создаем компаратор для сортировки по возрасту (ageComparator).
// Затем мы используем метод thenComparing() для создания композитного компаратора (compositeComparator),
// который сначала сравнивает по имени и затем по возрасту. Это позволяет нам сортировать объекты сначала по имени и,
// в случае совпадения имени, по возрасту.

        Collections.sort(list,compositeComparator);

//       Comparator<Person> comparator = new Comparator<Person>() {
//           @Override
//           public int compare(Person o1, Person o2) {
//    //           return Integer.compare(o1.getAge(), o2.getAge());//сортировать для типа integer
//               return o1.getName().compareTo(o2.getName());//сортировать по типу String
//           }
//       };

//       Collections.sort(list,nameComparator);//сравнивает по comparator -      Collections.sort(list,comparator);


        for (Person person : list) {
            System.out.println(person.getName() +" - "+person.getAge()+" years old!");
        }


    }
   static class Person   {
        private String name;
        private int age;

        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }

        public String  getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

       @Override
       public String toString() {
           return "Person{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   '}';
       }



       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           Person person = (Person) o;
           return Objects.equals(name, person.name);
       }

       @Override
       public int hashCode() {
           return Objects.hash(name);
       }



   }
}
