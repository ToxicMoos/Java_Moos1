package Lesson38.practice38.coffee;

public enum Coffee {
    ESPRESSO_SMALL(3.50,50),ESPRESSO_GRAND(4.0,150), AMERICANO(2.50,200), CAPUCHINO(4.50,300), LATTE(4.80,350);
    private double price;
    private int volume;

//conctructor
    Coffee(double price, int volume) {
        this.price = price;
        this.volume = volume;
    }
    //getters setters


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

