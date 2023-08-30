package Domen;

public class Bottle extends Product {

    private double bottleVolume;

    public Bottle(String name, int price, double bottleVolume) {
        super(name, price);
        this.bottleVolume = bottleVolume;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString()
    {
        return super.toString()+" volume: "+this.bottleVolume;
    }
    
    
}
