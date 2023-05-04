package Homework03.comparators;

import java.util.Comparator;

import Homework03.employees.Employee;

public class DateComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getBirthday().compareTo(o2.getBirthday());
        return res;
    }
}