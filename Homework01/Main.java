
/*
 * Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину.
Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
 */

package Homework01;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        BottleOfWater bottleOfWater1 = new BottleOfWater("Saint Stream", "Water1", 70, 1);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Bon Aqua", "Water2", 50, 0.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Evian", "Water3", 310, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Aqua Minerale", "Water4", 110, 2);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Shishkin Forest", "Water5", 75, 1);
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Parmalat", "Milk1", 100, 1, 3.5);
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("House in the village", "Milk2", 100, 0.9, 3.2);
        BottleOfMilk bottleOfMilk3 = new BottleOfMilk("PetMol", "Milk3", 100, 1, 2.5);
        BottleOfMilk bottleOfMilk4 = new BottleOfMilk("Green Village", "Milk4", 100, 1, 2.5);
        BottleOfMilk bottleOfMilk5 = new BottleOfMilk("Prostokvashino", "Milk5", 100, 0.9, 3.2);
        BagOfChips bagOfChips1 = new BagOfChips("Layz", "Chips1", 110, 0.14, "with salt");
        BagOfChips bagOfChips2 = new BagOfChips("Okey", "Chips2", 110, 0.09, "with sour cream");
        BagOfChips bagOfChips3 = new BagOfChips("Pringles", "Chips3", 110, 0.15, "with onion");
        BagOfChips bagOfChips4 = new BagOfChips("Chitos", "Chips4", 110, 0.15, "with becon");
        BagOfChips bagOfChips5 = new BagOfChips("Russian Potato", "Chips5", 110, 0.09, "with paprika");

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(bottleOfMilk5);
        products.add(bagOfChips1);
        products.add(bagOfChips2);
        products.add(bagOfChips3);
        products.add(bagOfChips4);
        products.add(bagOfChips5);

        System.out.println("Список продуктов в автомате:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        VendingMachine machine = new VendingMachine(products);

        BottleOfWater bottleOfWaterChoice =  machine.getBottleOfWater("Water3", 1);
        if (bottleOfWaterChoice != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterChoice);
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        BottleOfMilk bottleOfMilkChoice = machine.getBottleOfMilk("Milk2", 0.9, 3.2);
        if (bottleOfMilkChoice != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkChoice);
        }
        else {
            System.out.println("Такого пакета с молоком нет в автомате.");
        }

        BagOfChips bagOfChipsChoice = machine.getBagOfChips("Chips4", "with becon");
        if (bagOfChipsChoice != null){
            System.out.println("Вы купили: ");
            System.out.println(bagOfChipsChoice);
        }
        else {
            System.out.println("Такой пачки с чипсами нет в автомате.");
        }
    }


}