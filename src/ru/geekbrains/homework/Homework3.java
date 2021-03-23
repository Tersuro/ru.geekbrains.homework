package ru.geekbrains.homework;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {


        guessTheWord();
    }

    private static void guessTheWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = words[new Random().nextInt(words.length)];
        System.out.println("Угадайте, какое слово было загадано из следующего набора: apple, orange, lemon, banana, " +
                "apricot, avocado, broccoli, carrot, cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut," +
                " olive, pea, peanut, pear, pepper, pineapple, pumpkin, potato");

        Scanner scan = new Scanner(System.in);
        String inputWord;

        String resWord = "###############";
        char[] resTemp;

        while (!resWord.equals(word)) {
            inputWord = scan.next();
            inputWord = inputWord.toLowerCase(Locale.ROOT);
            resWord = "###############";
            resTemp = resWord.toCharArray();

            if (word.length() < inputWord.length()) {
                for (int i = 0; i < word.length(); i++) {
                    if (inputWord.charAt(i) == word.charAt(i))
                        resTemp[i] = inputWord.charAt(i);
                }
            } else {
                for (int i = 0; i < inputWord.length(); i++) {
                    if (inputWord.charAt(i) == word.charAt(i))
                        resTemp[i] = inputWord.charAt(i);
                }
            }
            resWord = new String(resTemp);
            System.out.println(resWord);
            resWord = resWord.replace("#", "");
        }
        System.out.println("Вы угадали!");
    }
}
