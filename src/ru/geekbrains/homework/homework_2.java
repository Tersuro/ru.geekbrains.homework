package ru.geekbrains.homework;

import java.util.Random;

public class homework_2 {

    public static void main(String[] args) {

        //Task1
        //------------------------------------------------------------------------------------
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++) arr[i] = rand.nextInt(2);
        for(int i = 0; i < arr.length; i++) if(arr[i] == 0) arr[i] = 1; else arr[i] = 0;
        //Task2
        //------------------------------------------------------------------------------------
        int[] arr1 = new int[8];
        arr1[0] = 0;
        for(int i = 1; i < arr1.length; i++) arr1[i] = arr1[i - 1] + 3;
        //Task3
        //------------------------------------------------------------------------------------
        int[] arr2 = new int[12];
        for(int i = 0; i < arr2.length; i++) arr2[i] = rand.nextInt(12);
        for(int i = 0; i < arr2.length; i++) if(arr2[i] < 6) arr2[i] = arr2[i] * 2;
        //Task4
        //------------------------------------------------------------------------------------
        int[][] arr3 = new int[5][5];
        for(int i = 0; i < arr3.length; i++)
            for (int j = 0; j < arr3.length; j++)
                if( i == j || i+j == 4) arr3[i][j] =1;
        //Task5
        //------------------------------------------------------------------------------------
        int[] arr4 = new int[10];
        for(int i = 0; i < arr4.length; i++) arr4[i] = rand.nextInt(50);
        int min = arr4[0];
        int max = min;
        for(int i = 1; i < arr4.length; i++) {
            if(arr4[i] < min) min = arr4[i];
            if(arr4[i] > max) max = arr4[i];
        }
        //Task7
        //------------------------------------------------------------------------------------
        int[] arr5 =  {1, 2, 3, 4, 5, 6};
        int n = -4;
        arrShift(arr5, n);
        for(int i = 0; i < arr5.length; i++) System.out.print(" " + arr5[i]);

    }


    private static void arrShift(int[] array, int n) {

        int temp;
        if(n < 0) {
            for(int k = 0; k < Math.abs(n); k++)
                for(int i = 0; i < array.length - 1; i++) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
            }
        } else if(n > 0) {
            for(int k = 0; k < n; k++)
                for(int i = array.length - 1; i > 0; i--){
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
        }
    }

}
