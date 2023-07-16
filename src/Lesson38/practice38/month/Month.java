package Lesson38.practice38.month;

public enum Month {
    //имена константы в java ,всегда пишутся большими буквами
    JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),OKT(31),NOV(30),DEC(31);
    //fields
    private int days;

    //constructor
    private Month(int days){//название класса - enum и конструктора совпадает
      this.days =days;
    }

    //getters setters


    public int getDays() {//метод позволяет узнать количество дней
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //метод увеличивает количество месяцев
    public Month plusMonth(int quantity){//quantity - количество
        int index = ordinal(); //взяли текущий месяц
        index = index + quantity;//увеличили
        Month[] values = values();//определили массив values
        return values[index % values.length];//index поделили с остатком на 12 = values.lengt
    }

    //метод возращает имя месяца по номеру
    public static String getName(int num){//static -позволяет вызвать метод по имени класса
        Month[] values = values();//определили массив values
        return values[(num-1) % values.length].name();//возращаем имя правильного месаца
    }
}
