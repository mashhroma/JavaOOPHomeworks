package Homework04;

public abstract class Fruit {

    private final float weight;
    private final String name;

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, вес %.2f", name, weight);
    }
}
