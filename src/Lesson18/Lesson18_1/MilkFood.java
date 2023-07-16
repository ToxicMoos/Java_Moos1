package Lesson18.Lesson18_1;

// класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;, которые хранят тип молока и жирность продукта соответственно.
public class MilkFood extends Food { // класс MilkFood extends(наследует ) от Food
    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, boolean idOufOfDate, String milkType, double fat) {
        super(price, name, barCode, idOufOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Price = " +getPrice()+", Name = "+getName()+", BarCode = "+getBarCode()+", idOufOfDate = "+isIdOufOfDate()+", Milk Type = "+milkType+", Fat = "+ fat ;
    }
}
