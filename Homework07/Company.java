package Homework07;

import java.util.Random;

import Homework07.Vacancy.Type;

public class Company {

    private Random random;
    private String nameCompany;
    private int maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, int maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и
     * передавать
     * объект в агенство.
     * Поиск сотрудника
     */

    public void needEmployee(Type type) {
        int salary = 0;
        switch (type) {
            case JUNIOR:
                salary = random.nextInt(3000, maxSalary);
                break;
            case MIDDLE:
                salary = random.nextInt(40000, maxSalary);
                break;
            case SENIOR:
                salary = random.nextInt(70000, maxSalary);
                break;
            default:
                break;
        }
        Vacancy vacancy = new Vacancy(type, nameCompany, salary);
        jobAgency.sendOffer(vacancy);
    }

}
