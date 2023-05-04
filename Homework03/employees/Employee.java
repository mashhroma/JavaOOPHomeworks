package Homework03.employees;

import java.util.Calendar;

public abstract class Employee implements Comparable<Employee> {

    protected String surName;
    protected String name;
    protected Calendar birthday;
    protected double salary;

    public Employee(String surName, String name, Calendar birthday, double salary) {
        this.surName = surName;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; зарплата за месяц: %.2f", name, surName, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.calculateSalary(), calculateSalary());
    }
}
