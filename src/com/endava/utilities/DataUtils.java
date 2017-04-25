package com.endava.utilities;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by lex on 25.03.2017.
 */
public class DataUtils {

    private static Random rand = new Random();

    //method that receives dimensions of an array and returns the array
    public static int[] createArray(int firstNumber, int secondNumber) {
        System.out.println("Created array with " + firstNumber * secondNumber + " elements");
        int[] array = new int[firstNumber * secondNumber];
        return array;
    }

    //method that receives an array as input and returns an array on output filling it with random number
    public static int[] fillArrayWithRandomNumbers(int array[]) {
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
        return array;
    }

    //method that receives an array as input and returns an array on output
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }


    //method that sorts an array
    public static void sortArray(int array[]) {
        //Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
