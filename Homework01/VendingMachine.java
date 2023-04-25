package Homework01;

import java.util.ArrayList;

public class VendingMachine {

    private final ArrayList<Product> products;

    public VendingMachine(ArrayList<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
       }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume, double fat){

        for (Product product : products){
            if (product instanceof BottleOfMilk){
                if (product.getName() == name &&
                 ((BottleOfMilk)product).getVolume() == volume && 
                 ((BottleOfMilk)product).getFat() == fat) {
                    return (BottleOfMilk)product;
                }
            }
       }
        return null;
    }

    public BagOfChips getBagOfChips(String name, String taste){

        for (Product product : products){
            if (product instanceof BagOfChips){
                if (product.getName() == name && ((BagOfChips)product).getTaste() == taste){
                    return (BagOfChips)product;
                }
            }
       }
        return null;
    }

}
