package ru.geekbrains.homework.lesson7;

public class Homework7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 20),
                new Cat("Whity", 60),
                new Cat("Murzik", 31)
        };
        Bowl bowl = new Bowl();
        bowl.fillFood();
        for (Cat cat : cats) {
            cat.eat(bowl);
            if(cat.getSatiety())
                System.out.printf("Cat %s is full\n", cat.getName());
            else System.out.printf("Cat %s isn't full\n", cat.getName());
        }
    }
}
