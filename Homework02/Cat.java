package Homework02;

public class Cat {

    private String name;
    private int appetite;
    boolean satiety = false;
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void eat(int food) {
        if (food > appetite) {
            satiety = true;
            System.out.printf("Кот %s съел %d еды и теперь он сыт.", name, appetite);
        }
        else {
            System.out.printf("Коту %s недостаточно еды и он не стал есть.", name);
        }
    }

    @Override
    public String toString() {
        return String.format("Кот %s, аппетит - %d, состояние %s", name, appetite, satiety==false ? "голоден" : "сыт");
    }
}
