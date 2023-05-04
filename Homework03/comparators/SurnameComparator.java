package Homework03.comparators;

import java.util.Comparator;

import Homework03.employees.Employee;

public class SurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            res = o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}