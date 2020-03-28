/*
Employee array list implemented in Java.
Author: Marcel P
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeArray {
    private String name;
    private int salary;
    private int joinDate;

    public EmployeeArray() {

    }

    static void fillList() {
        String[] namesToRandom = {"Kris", "Bob", "Franklin", "Mark", "Kate", "Ashley",
                "Penelope", "Antonio", "Victor", "Edward", "Randy"};
        List<EmployeeArray> employeeAll = new ArrayList<EmployeeArray>();
        int numOfEmployees = 8;
        int lowYear = 1990;
        int highYear = 2020;
        Random year = new Random();
        for (int i = 0; i < numOfEmployees; i++) {
            EmployeeArray temp = new EmployeeArray();
            temp.name = namesToRandom[(new Random()).nextInt(namesToRandom.length)];
            temp.salary = (int) (Math.random() * 1500 + 10000);
            temp.joinDate = year.nextInt(highYear - lowYear) + lowYear;
            employeeAll.add(temp);
        }

        employeeAll.forEach(System.out::println);
    }

    public static void main(String[] args) {
        fillList();
    }

    @Override
    public String toString() {
        return
                "name = " + name +
                        ", salary = " + salary +
                        ", joinDate = " + joinDate;
    }
}
