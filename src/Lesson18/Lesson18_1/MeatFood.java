package Lesson18.Lesson18_1;

// класс MeatFood расширяющий класс Food с полем private String meatType;, которое хранит тип мяса, из которого изготовлен продукт.
public class MeatFood extends Food{// класс MeatFood extends(наследует ) от Food
    private String meatType;

    public MeatFood(double price, String name, long barCode, boolean idOufOfDate, String meatType) {
        super(price, name, barCode, idOufOfDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "Price = " +getPrice()+", Name = "+getName()+", BarCode = "+getBarCode()+", idOufOfDate = "+isIdOufOfDate()+", Meat Type = "+meatType ;
    }

}
