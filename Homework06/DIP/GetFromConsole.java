package DIP;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFromConsole implements GetReport {

    Scanner input = new Scanner(System.in);

    public ArrayList<ReportItem> reportFromConsole() {
        ArrayList<ReportItem> items = new ArrayList<>();
        String choice = "";
        while (!choice.equals("no")) {
            System.out.print("Ввести новую строку?(если нет - no): ");
            choice = input.nextLine();

            if (choice.equals("no")) {
                break;
            } else {
                System.out.println("Введите данные:");
                items.add(getItem());
            }
        }
        return items;
    }

    public ReportItem getItem() {
        System.out.print("Описание: ");
        String description = input.nextLine();
        System.out.print("Сумма: ");
        float amount = input.nextLong();
        input.nextLine();
        return new ReportItem(description, amount);
    }

}
