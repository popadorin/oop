package com.dorin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        functionalSolution();
        oopSolution();
    }

    private static void oopSolution() {
        Employee e1 = new Employee("jora", 100);
        Employee e2 = new Employee("grisha", 200);

        Employee[] employees = {e1, e2};

        for (Employee employee : employees) {
            employee.increase(10000);
        }

        // sout employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void functionalSolution() {
        List<Object> e1 = new ArrayList<>();
        e1.add("Jora");
        e1.add(100);

        List<Object> e2 = new ArrayList<>();
        e2.add("grisha");
        e2.add(200);

        List<List<Object>> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);

        // ------------------------------------------------------------------------------

        List<List<Object>> happierEmployees = changeSalaries(employees);

        // sout employees
        for (List<Object> employee : happierEmployees) {
            System.out.println(employee);
        }

    }

    private static List<List<Object>> changeSalaries(List<List<Object>> employees) {
        return employees.stream()
                .map(employee -> changeSalary(employee))
                .collect(Collectors.toList());
    }

    private static List<Object> changeSalary(List<Object> employee) {
        List<Object> modifiedEmployee = new ArrayList<>();

        modifiedEmployee.add(employee.get(0)); // name
        modifiedEmployee.add((Integer) employee.get(1) + 10000); // salary += 10000

        return modifiedEmployee;
    }
}


class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void increase(int increase) {
        salary += increase;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}