package canaryTests;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import org.testng.annotations.Test;
import com.canary.bubbleSort;
import org.junit.*;


public class bubbleSortTest  {

    @Test
     public void creatingArray() {

        System.out.println("Test case: Creating Array");
        //creating an array
        int [] createdArray = bubbleSort.creatingArray();
        //getting the greatest number inside of array
        IntStream intStream = Arrays.stream(createdArray);
        OptionalInt optionalInt = intStream.max();
        int maxNum = optionalInt.getAsInt();

        //printing Array, array's size & maxNum
       System.out.println("Array's size: " + createdArray.length);
       System.out.println("Created array: " + Arrays.toString(createdArray));
       System.out.println("Max number inside array is " + maxNum);

        //***positive scenarios
        Assert.assertTrue("Array's length is 10",createdArray.length==10);
        Assert.assertTrue("Max number is not bigger than 100", maxNum<100);

        //***negative scenarios
        Assert.assertFalse(createdArray.length<10);
        Assert.assertFalse(createdArray.length>10);
        Assert.assertFalse(Arrays.toString(createdArray).isEmpty());


}

    @Test
    public void bubbleSort() {

        System.out.println("Test case: Bubble Sort");
        //initializing test array
        int [] testArray = {10,2,5,66,8,7,56,7,9,78};
        //initializing String for bubble Sorted Array Values
        String bubbleSortedArr = bubbleSort.bubbleSort(testArray);
        // sorting an array with the regular sort() method
        Arrays.sort(testArray);
        //initializing String for the array sorted with sort() method
        String sortedArr = Arrays.toString(testArray);
        //printing out results
        System.out.println("sortedArray = " + sortedArr);
        System.out.println("bubbleSortArray:" + bubbleSortedArr);

        //***positive scenario
        Assert.assertEquals(sortedArr, bubbleSortedArr);

        //** negative scenario
        Assert.assertFalse(bubbleSortedArr.isEmpty());
        Assert.assertFalse(sortedArr.isEmpty());

    }

}

