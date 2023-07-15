package homeWork18.Lesson18_1;

//  класс Food расширяющий класс Product с полем private boolean isOutOfDate;, которое отвечает за годность продукта.

public class Food extends Product{ // класс  Food extends(наследует ) от Product
    private boolean idOufOfDate;

    public Food(double price, String name, long barCode, boolean idOufOfDate) {
        super(price, name, barCode);
        this.idOufOfDate = idOufOfDate;
    }

    public boolean isIdOufOfDate() {
        return idOufOfDate;
    }

    public void setIdOufOfDate(boolean idOufOfDate) {
        this.idOufOfDate = idOufOfDate;
    }

    @Override
    public String toString() {                 // метод toString() возвращает строку, содержащую имя класса
        return "Price = " +getPrice()+", Name = "+getName()+", BarCode = "+getBarCode()+", idOufOfDate = "+ idOufOfDate;
    }
}
