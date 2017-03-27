package com.endava.main;

import com.endava.utilities.DataUtils;

import javax.xml.crypto.Data;
import java.util.Arrays;

/**
 * Created by lex on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        for (int[] array : DataUtils.returnArray(3, 3)) {
            System.out.println(Arrays.toString(array));
        }

        System.out.println("Random filled arrays: ");
        System.out.println(Arrays.toString(DataUtils.generateRandomArray(new double[]{1.5, 2, 3, 6.4, 6, 4, 5})));
        System.out.println(Arrays.toString(DataUtils.generateRandomArray(new float[]{1.5f, 2, 3.8f, 6.4f, 6, 4, 5})));
        System.out.println(Arrays.toString(DataUtils.generateRandomArray(new int[]{1, 2, 3, 6, 6, 4, 5})));
        System.out.println(Arrays.toString(DataUtils.generateRandomArray(new char[]{'1', '4', 'a', '5', 'b', 'a'})));

        System.out.println("Output arrays: ");
        DataUtils.outputArray(new double[]{1.5, 2, 3, 6.4, 6, 4, 5});
        DataUtils.outputArray(new float[]{1.5f, 2, 3.8f, 6.4f, 6, 4, 5});
        DataUtils.outputArray(new int[]{5, 6, 12, 11, 122, 6, 5});
        DataUtils.outputArray(new char[]{'z', 'd', 'a', 'c', 'b', 'f', 'a'});

        System.out.println("Sorted arrays: ");
        DataUtils.sortArray(new double[]{1.5, 2, 3, 6.4, 6, 4, 5});
        DataUtils.sortArray(new float[]{1.5f, 2, 3.8f, 6.4f, 6, 4, 5});
        DataUtils.sortArray(new int[]{5, 6, 12, 11, 122, 6, 5});
        DataUtils.sortArray(new char[]{'z', 'd', 'a', 'c', 'b', 'f', 'a'});
    }
}
