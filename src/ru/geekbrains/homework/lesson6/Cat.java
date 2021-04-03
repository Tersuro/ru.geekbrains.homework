package ru.geekbrains.homework.lesson6;

import ru.geekbrains.homework.lesson6.animals.Animal;

public class Cat extends Animal {
    protected static int quantity;

    public Cat() {
        super();
        quantity++;
    }

    public Cat(String name, String color) {
        super(name, color);
        quantity++;
    }

    public void run(int length) {
        if (length > 200)
            System.out.printf("Из %d кот пробежал 200 м\n", length);
        else
            System.out.printf("Кот пробежал %d м\n", length);
    }

    public void swim(int length) {
            System.out.println("Кот не умеет плавать");
    }

    public void getQuantity() {
        System.out.println("Quantity cats: " + quantity);
    }

}
