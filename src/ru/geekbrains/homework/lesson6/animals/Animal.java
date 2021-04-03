package ru.geekbrains.homework.lesson6.animals;

public class Animal {

    protected String name;
    protected String color;
    public static int quantity;

    public Animal() {
        quantity++;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        quantity++;
    }

    public void run(int length) {
        System.out.printf("Animal %s ran %d meters\n", name, length);
    }

    public void swim(int length) {
        System.out.printf("Animal %s swam %d meters\n", name, length);
    }

    public void getQuantity() {
        System.out.println("Quantity animals: " + quantity);
    }
}
