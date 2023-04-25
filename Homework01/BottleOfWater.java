package Homework01;

public class BottleOfWater extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Бутылка воды: %s %s, объем: %.2f, цена - %.2f", brand, name, volume, price);
    }

}
