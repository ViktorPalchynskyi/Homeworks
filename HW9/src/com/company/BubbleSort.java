package com.company;

import java.util.List;

public class BubbleSort {
    boolean isSort = false;
    int change;

    public  void bubbleSort(int[] array) {




        while (isSort) {
        }
        isSort = true;
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i] > array[i + 1]) {
                isSort = false;
                change = array[i];
                array[i] = array[i + 1];
                array[i + 1] = change;
            }
        }
    }

    public static void swapNumber(int[] array, int first, int second) {


        int change = array[first];
        array[first] = array[second +1];
        array[second + 1] = array[first];

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
