package ru.geekbrains.homework.lesson6;

import ru.geekbrains.homework.lesson6.animals.Animal;

public class Dog extends Animal {
    protected static int quantity;

    public Dog() {
        super();
        quantity++;
    }

    public Dog(String name, String color) {
        super(name, color);
        quantity++;
    }

    public void run(int length) {
        if (length > 500)
            System.out.printf("Из %d собака пробежала 500 м\n", length);
        else
            System.out.printf("Собака пробежала %d м\n", length);
    }

    public void swim(int length) {
        if (length > 10)
            System.out.printf("Из %d собака проплыла 10 м\n", length);
        else
            System.out.printf("Собака проплыла %d м\n", length);
    }

    public void getQuantity() {
        System.out.println("Quantity dogs: " + quantity);
    }
}
