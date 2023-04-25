package Homework01;

public class BottleOfMilk extends Product {

    private double volume;
    private double fat;

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("Пакет молока: %s %s, объем: %.2f, жирность: %.2f, цена - %.2f", brand, name, volume, fat, price);
    }
}
