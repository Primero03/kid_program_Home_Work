package Domen;

public class HotDrink extends Product {
    private double volume;
    private int temp;

    public HotDrink(String name, int price, double volume, int temp) {
        super(name, price);
        this.volume = volume;
        this.temp = temp;
    }

    public HotDrink(String name, int price, double volume) {
        this(name, price, volume, 93);
        if (volume < 1.0) {
            this.price = 70;
        }
        if (volume > 1.0) {
            this.price = 130;
        }
        if (volume > 1.5) {
            this.price = 170;
        }

    }

    public HotDrink(double volume) {
        this("Coffe", 999, volume);

    }

    public HotDrink() {
        this(1.5);

    }

    public double getleVolume() {
        return volume;
    }

    public void seVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " volume: " + this.volume + " Temperature: " + this.temp;
    }
}
