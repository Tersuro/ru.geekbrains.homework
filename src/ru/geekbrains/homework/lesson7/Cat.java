package ru.geekbrains.homework.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Bowl bowl) {
        int startAmount = bowl.getFoodAmount();
        bowl.decreaseFood(appetite, this.name);
        if (startAmount != bowl.getFoodAmount() && bowl.getFoodAmount() != 0)
            setSatiety();
    }

    public void setSatiety() {
        this.satiety = true;
    }

    public boolean getSatiety() {
        return this.satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
