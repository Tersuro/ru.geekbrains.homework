package ru.geekbrains.homework.lesson6;

import ru.geekbrains.homework.lesson6.animals.Animal;

public class Homework6 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", "white"),
                new Dog("Bobik", "black"),
                new Cat("Pers", "yellow")
        };


        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(8);
            animal.getQuantity();
        }

        System.out.println("Quantity animals" + Animal.quantity);


    }
}
