package SPR;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        TakeOrders takeFromConsole = new TakeOrderFromConsole();
        SaveOrders toJSON = new SaveOrderToJSON();
        SaveOrders toXML = new SaveOrderToXML();

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество заказов для оформления: ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите заказ:");
            orders.add(takeFromConsole.takeNewOrder());
            System.out.println(orders.get(i));
        }

        for (Order order : orders) {
            toJSON.saveOrder(order);
            toXML.saveOrder(order);
        }

        System.out.println("Заказы созданы и сохранены в форматах: JSON и XML.");

        input.close();
    }
}
