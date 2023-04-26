package Homework02;

public class Plate {

    private String name;
    private int food;

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        }
        else {
            getFood();
        }  
    }

    public void putFood(int moreFood) {
        this.food += moreFood;
    }

    public void info() {
        System.out.printf("Тарелка с кормом: %s, количество: %d", name, food);
    }
}
