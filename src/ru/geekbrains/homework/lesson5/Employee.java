package ru.geekbrains.homework.lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private Double salary;
    private int age;

    public void getEmployeeInfo() {
        System.out.println("Сотрудник: " + name + ".");
        System.out.println("Должность: " + position + ".");
        System.out.println("Email: " + email + ".");
        System.out.println("Телефон: " + phone + ".");
        System.out.println("Зарплата: " + salary + ".");
        System.out.println("Возраст: " + age + ".");
    }

    public int getEmployeeAge() {
        return age;
    }

    public Employee(String name, String position, String email, String phone, Double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {

    }
}

