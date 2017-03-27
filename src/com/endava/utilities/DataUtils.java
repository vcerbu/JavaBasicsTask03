package com.endava.utilities;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by lex on 25.03.2017.
 */
public class DataUtils {

    private static Random rand = new Random();

    //method that receives dimensions of an array and returns the array
    public static int[][] returnArray(int numberOne, int numberTwo) {
        System.out.println("Generated " + numberOne + "x" + numberTwo + " array");
        int[][] array = new int[numberOne][numberTwo];
        for (int i = 0; i < numberOne; i++)
            for (int j = 0; j < numberTwo; j++) {
                array[i][j] = rand.nextInt(100);
            }
        return array;
    }

    //method that receives an array as input and returns an array on output filling it with random numbers
    //int
    public static int[] generateRandomArray(int array[]) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < copiedArray.length; i++)
            copiedArray[i] = rand.nextInt(100);
        return copiedArray;
    }

    //method that receives an array as input and returns an array on output filling it with random numbers
    //double
    public static double[] generateRandomArray(double array[]) {
        double[] copiedArray = new double[array.length];
        for (int i = 0; i < copiedArray.length; i++)
            copiedArray[i] = rand.nextDouble();
        return copiedArray;
    }

    //method that receives an array as input and returns an array on output filling it with random numbers
    //float
    public static float[] generateRandomArray(float array[]) {
        float[] copiedArray = new float[array.length];
        for (int i = 0; i < copiedArray.length; i++)
            copiedArray[i] = rand.nextFloat();
        return copiedArray;
    }

    //method that receives an array as input and returns an array on output filling it with random numbers
    //char
    public static char[] generateRandomArray(char array[]) {
        char[] copiedArray = new char[array.length];
        for (int i = 0; i < copiedArray.length; i++)
            copiedArray[i] = (char) (rand.nextInt(26) + 'a');
        return copiedArray;
    }


    //method that receives an array as input and returns an array on output
    //int
    public static void outputArray(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    //method that receives an array as input and returns an array on output
    //double
    public static void outputArray(double array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    //method that receives an array as input and returns an array on output
    //float
    public static void outputArray(float array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    //method that receives an array as input and returns an array on output
    //char
    public static void outputArray(char array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }


    //method that sorts an array
    //int
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

    //method that sorts an array
    //double
    public static void sortArray(double array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    //method that sorts an array
    //float
    public static void sortArray(float array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    //method that sorts an array
    //char
    public static void sortArray(char array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }


}
