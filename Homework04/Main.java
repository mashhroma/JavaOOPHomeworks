package Homework04;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Box> boxes = new ArrayList<>();

        for (int i = 0; i < random.nextInt(10, 20); i++) {
            boolean typeOfFruit = random.nextBoolean();
            
            if (typeOfFruit) {
                ArrayList<Apple> apples = new ArrayList<>();
                for (int j = 0; j < random.nextInt(1, 20); j++) {
                    apples.add(new Apple());
                }
                Box<Apple> appleBox = new Box<>(apples);
                boxes.add(appleBox);
            } else {
                ArrayList<Orange> oranges = new ArrayList<>();
                for (int k = 0; k < random.nextInt(1, 20); k++) {
                    oranges.add(new Orange());
                }
                Box<Orange> orangeBox = new Box<>(oranges);
                boxes.add(orangeBox);
            }
        }

       for (Box box : boxes) {
        System.out.println(box);
       }
       System.out.println("\nПример сравнения коробок:");
       System.out.println(boxes.get(0).compareBoxes(boxes.get(1)));

       System.out.println("\nПример добавления фрукта в коробку:");
       boxes.get(0).addFruits(new Orange());
       System.out.println(boxes.get(0));

       System.out.println("\nПример пересыпания фрукта из коробки в коробку:");
       boxes.get(0).moveFruits(2, boxes.get(1));
       System.out.println(boxes.get(0) + "|||" + boxes.get(1));

    }
}
