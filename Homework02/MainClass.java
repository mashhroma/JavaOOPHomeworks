package Homework02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    static boolean catHappiness = false;

    public static void main(String[] args) {

        Cat catChubik = new Cat("Чубик", 10);
        Cat catPepsik = new Cat("Пепсик", 15);
        Cat catYuki = new Cat("Юки", 6);
        Cat catViska = new Cat("Виска", 5);
        Cat catLastya = new Cat("Ластя", 7);

        ArrayList<Cat> myCats = new ArrayList<>();
        myCats.add(catChubik);
        myCats.add(catPepsik);
        myCats.add(catYuki);
        myCats.add(catViska);
        myCats.add(catLastya);
        System.out.println("Дома живут коты:");
        for (Cat cat : myCats) {
            System.out.println(cat);
        }

        Plate dryWhiskas = new Plate("Сухой Whiskas", 20);
        System.out.println("\nДома есть такая еда для котов:");
        dryWhiskas.info();

        System.out.println("\n\nКоты начали подходить к тарелке и есть:");
        Feeding(myCats, dryWhiskas);

        if (catHappiness) {
            System.out.println("\nВсе коты наелись и счастливы");
        } else {
            System.out.println("\nНекоторые коты остались голодными:");
            for (Cat cat : myCats) {
                if (cat.getSatiety() == false)
                    System.out.println(cat);
            }

            System.out.println("\nДобавьте в миску еду, чтобы покормить голодных котиков:");

            System.out.print("\nТеперь накормим голодных котов, напишите, сколько им добавить еды:");
            Scanner input = new Scanner(System.in);
            dryWhiskas.putFood(input.nextInt());
            input.close();

            Feeding(myCats, dryWhiskas);
            if (catHappiness) {
                System.out.println("\nНаконец-то все коты наелись!");
            } else {
                System.out.println("\nИ все-таки вы добавили недостаточно корма, чтобы всех накормить!");
            }
        }
    }

    public static void Feeding(ArrayList<Cat> cats, Plate plate) {
        for (Cat cat : cats) {
            if (cat.getSatiety() == false) {
                cat.eat(plate.getFood());
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println("\nОсталось еды в миске: " + plate.getFood());
                if (cat.getSatiety())
                    catHappiness = true;
                else
                    catHappiness = false;
            }
        }
    }
}
