package Homework01;

public class BagOfChips extends Product {
    
    private double weight;
    private String taste;

    public String getTaste() {
        return taste;
    }

    public BagOfChips(String brand, String name, double price, double weight, String taste) {
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Пачка чипсов: %s %s, вес: %.2f, вкус: %s, цена - %.2f", brand, name, weight, taste, price);
    }
}
