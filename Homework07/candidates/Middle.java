package Homework07.candidates;

import Homework07.Vacancy;
import Homework07.Vacancy.Type;

public class Middle implements Observer{
    protected String name;
    protected int salary;

    public Middle(String name) {
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.getType() == Type.MIDDLE) {
            if (this.salary < vacancy.getSalary()){
                System.out.printf("Миддл %s >>> Мне нужна эта работа! [%d: %s - %d]\n", name, vacancy.getId(), vacancy.getCompany(), vacancy.getSalary());
                this.salary = vacancy.getSalary();
                vacancy.closeVacancy();
            } else {
                System.out.printf("Миддл %s >>> Я найду работу получше! [%d: %s - %d]\n", name, vacancy.getId(), vacancy.getCompany(), vacancy.getSalary());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Миддл %s, желаемая зарплата: %d", name, salary);
    }
}
