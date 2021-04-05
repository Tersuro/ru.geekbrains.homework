package ru.geekbrains.homework.lesson7;

public class Bowl {
    private int foodAmount;

    public void putFoodInto(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food put for %d, and %d left\n", amount, foodAmount);
    }

    public void fillFood() {
        this.foodAmount += 100;
        System.out.println("Тарелка заполнена на 100");
    }

    public void decreaseFood(int amount, String name) {
        if (this.foodAmount - amount >= 0 && amount != 0) {
            this.foodAmount -= amount;
            System.out.printf("Food decreased for %d, and %d left\n", amount, foodAmount);
            System.out.printf("Cat %s ate some food\n", name);
        } else System.out.printf("Cat %s looks at you with displeasure\n", name);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
