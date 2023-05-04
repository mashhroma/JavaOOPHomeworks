package Homework03.employees;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Freelancer extends Employee {

    public Freelancer(String surName, String name, Calendar birthday, double salary) {
        super(surName, name, birthday, salary);
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");

    @Override
    public double calculateSalary() {
        return salary * 22;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; дата рождения: %s, Удаленный сотрудник; зарплата за месяц: %.2f (руб.)", surName, name,
                dateFormat.format(birthday.getTime()),
                calculateSalary());
    }
}
