package com.endava.main;

import com.endava.utilities.DataUtils;

import javax.xml.crypto.Data;
import java.util.Arrays;

/**
 * Created by lex on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Create array: ");
        System.out.println(Arrays.toString(DataUtils.createArray(4, 4)));

        System.out.println("Random filled array: ");
        System.out.println(Arrays.toString(DataUtils.fillArrayWithRandomNumbers(new int[]{1, 2, 3, 6, 6, 4, 5})));
        //System.out.println(Arrays.toString(DataUtils.fillArrayWithRandomNumbers(new double[]{1.5, 2, 3, 6.4, 6, 4, 5})));
        //System.out.println(Arrays.toString(DataUtils.fillArrayWithRandomNumbers(new float[]{1.5f, 2, 3.8f, 6.4f, 6, 4, 5})));
        //System.out.println(Arrays.toString(DataUtils.fillArrayWithRandomNumbers(new char[]{'1', '4', 'a', '5', 'b', 'a'})));

        System.out.println("Printed array: ");
        DataUtils.printArray(new int[]{5, 6, 12, 11, 122, 6, 5});
        //DataUtils.printArray(new double[]{1.5, 2, 3, 6.4, 6, 4, 5});
        //DataUtils.printArray(new float[]{1.5f, 2, 3.8f, 6.4f, 6, 4, 5});
        //DataUtils.printArray(new char[]{'z', 'd', 'a', 'c', 'b', 'f', 'a'});

        System.out.println("Sorted array: ");
        DataUtils.sortArray(new int[]{5, 6, 12, 11, 122, 6, 5});
        //DataUtils.sortArray(new double[]{1.5, 2, 3, 6.4, 6, 4, 5});
        //DataUtils.sortArray(new float[]{1.5f, 2, 3.8f, 6.4f, 6, 4, 5});
        //DataUtils.sortArray(new char[]{'z', 'd', 'a', 'c', 'b', 'f', 'a'});
    }
}
