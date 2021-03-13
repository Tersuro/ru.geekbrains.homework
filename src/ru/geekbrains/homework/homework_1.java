package ru.geekbrains.homework;

public class homework_1 {

    public static void main(String[] args) {

        int a = 10, b = 11, c = -4, d = 3;
        System.out.println("Результат вычисленного выражения: " + evaluateExpression(a, b, c, d));

        System.out.println("Лежит ли сумма чисел " + a + " и " + b + " в пределах от 10 до 20(включительно)?" +
                " Проверяем... ");
        if (checkNumbersLimit(a, b)) {
            System.out.println("Да");
        } else System.out.println("Нет");

        checkNumber(c);

        String name = "Иван";
        helloUsername(name);

        int year = 2100;
        checkLeapYear(year);
    }

    private static float evaluateExpression(int a, int b, int c, int d) {

        float result = a * (b + 1.0f * c / d);
        return result;
    }

    private static boolean checkNumbersLimit(int a, int b) {

        boolean flag;
        int sum = a + b;
        if ( sum >= 10 && sum <= 20) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    private static void checkNumber(int c) {

        boolean flag;
        if (c >= 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Число " + c + " положительное");
        } else {
            System.out.println("Число " + c + " отрицательное");
        }
    }

    private static void helloUsername(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}
