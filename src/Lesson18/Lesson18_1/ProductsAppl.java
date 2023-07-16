package Lesson18.Lesson18_1;


//В классе ProductsAppl создать в методе main создать массив, в котором хранятся как минимум по одному объекту для каждого продукта.
// Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов в магазине.

public class ProductsAppl {
    public static void main(String[] args) {
        Product product1 = new Product(5,"Product",56487856L) ;
        Food food1 = new Food(10,"Foot",782311197L,true);
        MeatFood meat1 = new MeatFood(20,"Meat",123456798L,false,"Beef");
        MilkFood milk1 = new MilkFood(15,"Milk",987654312L,true,"Cow",3.8);
        MilkFood milk2 = new MilkFood(13,"Milk",987654312L,false,"Cow",3.8);

        Product[] array  = new Product[5];
        array[0] = product1;
        array[1] = food1;
        array[2] = meat1;
        array[3] = milk1;
        array[4] = milk2;

        printArray( array);
        System.out.println();

        double totalSum = sumOfTotalPrice( array) ;
        System.out.println("Total sum of all products: = "  + totalSum );
        System.out.println();
        expiredFoods(array);
        
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    //вывод на печать всех массивов
    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

//  метод сложения цены всех стоимостей продуктов
    public static double sumOfTotalPrice(Product[] products) {//из массива  Product[]
        double totalPrice = 0.0;
        for (Product food : products) {      //для массива  Product, создаем переменную food и перебераем все из products
            totalPrice += food.getPrice();   // переменная food содержит все от products) через точку выбираем метод который нам нужен, например"food.getPrice()"
        }
        return totalPrice;
    }
    public static void  expiredFoods(Product[] products) {
        System.out.println("Expired Foods:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Food && ((Food) products[i]).isIdOufOfDate()) {
                System.out.println(products[i]);
            }
        }
    }

}

