package Homework07.candidates;

import Homework07.Vacancy;
import Homework07.Vacancy.Type;

public class Junior implements Observer {

    protected String name;
    protected int salary;

    public Junior(String name) {
        this.name = name;;
        salary = 5000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.getType() == Type.JUNIOR) {
            if (this.salary < vacancy.getSalary()){
                System.out.printf("Джуниор %s >>> Мне нужна эта работа! [%d: %s - %d]\n", name, vacancy.getId(), vacancy.getCompany(), vacancy.getSalary());
                this.salary = vacancy.getSalary();
                vacancy.closeVacancy();
            } else {
                System.out.printf("Джуниор %s >>> Я найду работу получше! [%d: %s - %d]\n", name, vacancy.getId(), vacancy.getCompany(), vacancy.getSalary());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Джуниор %s, желаемая зарплата: %d", name, salary);
    }
}
