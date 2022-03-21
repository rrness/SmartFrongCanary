package com.canary;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class bubbleSort {

    public static void main(String[] args) {
       bubbleSort(creatingArray());
    }
    //method that creates an array (
    public static int[] creatingArray() {
        // Array size = 10
        int[] numbers = new int[10];
        // Using Random class to generate random integers
        Random rand = new Random();
        //iteration for giving each array index an integer value
        for (int i = 0; i < numbers.length; i++) {
            // number range should be up to 100
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before sorting" + Arrays.toString(numbers));
        return numbers;
    }

    //bubble sort method
    public static String bubbleSort(int[] arr) {

        //using while loop
        boolean swapped = true;
        while (swapped) {
            //starting with the condition swapped = false
            swapped = false;
        }
        //going through the iteration for the 1st number in sequence (i)
        for (int i = 0; i < arr.length; i++) {
            //iteration for the 2nd number sequence (j=i+1)
            for (int j = i + 1; j < arr.length; j++) {
                //checking condition:
                if (arr[i] > arr[j]) {
                    //if condition is true, it means that our array is not in right order,
                    // so we should star over and by going back to the while loop
                    swapped = true;
                    //swapping with the dummy var (int temp)
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } //return sorted array
        System.out.println("After sorting: " + Arrays.toString(arr));
        return Arrays.toString(arr);
    }

}
