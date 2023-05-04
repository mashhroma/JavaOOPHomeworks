package Homework03;

import Homework03.comparators.*;
import Homework03.employees.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random = new Random();
    static Employee employee;

    static void generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман", "Андрей", "Максим", "Игорь", "Вячеслав", "Денис" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов", "Иванов", "Петров", "Сидоров", "Савкин", "Горлов" };

        Calendar date = new GregorianCalendar(random.nextInt(1960, 2005), random.nextInt(12), random.nextInt(30));
        int salaryPerMonth = random.nextInt(30000, 60000);
        int salaryPeaceWork = random.nextInt(1000, 3000);
        int randWorker = random.nextInt(3);
        if (randWorker == 0) {
            employee = new OfficeWorker(surnames[random.nextInt(10)], names[random.nextInt(10)], date, salaryPerMonth);
        } else if (randWorker == 1) {
            employee = new WarehouseWorker(surnames[random.nextInt(10)], names[random.nextInt(15)], date,
                    salaryPerMonth);
        } else {
            employee = new Freelancer(surnames[random.nextInt(10)], names[random.nextInt(15)], date, salaryPeaceWork);
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            generateEmployee();
            employees.add(employee);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nВыберите сортировку:\n" +
                "1. по фамилии\n" +
                "2. по имени\n" +
                "3. по дате рождения\n" +
                "4. по зарплате за месяц\n" +
                "Напишите цифру: ");

        Scanner input = new Scanner(System.in);
        String filterChoice = input.nextLine();
        input.close();

        switch (filterChoice) {
            case "1":
                employees.sort(new SurnameComparator());
                System.out.printf("\n*** Список сотрудников, отсортированный по фамилии: ***\n\n");
                break;
            case "2":
                employees.sort(new NameComparator());
                System.out.printf("\n*** Список сотрудников, отсортированный по имени: ***\n\n");
                break;
            case "3":
                employees.sort(new DateComparator());
                System.out.printf("\n*** Список сотрудников, отсортированный по дате рождения: ***\n\n");
                break;
            case "4":
                employees.sort(new SalaryComparator());
                System.out.printf("\n*** Список сотрудников, отсортированный по зарплате за месяц: ***\n\n");
                break;
            default:
                System.out.printf("\n Неверный выбор\n***Неотсортированный список сотрудников: ***\n\n");
                break;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
