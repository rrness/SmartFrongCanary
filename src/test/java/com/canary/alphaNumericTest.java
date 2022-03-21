package com.canary;
import org.junit.Assert;
import org.junit.Test;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class alphaNumericTest {


    @Test
    public void shouldTakeUserInput () throws IOException {

        //declaring userInput var
        String userInput = "A11a4";
        //passing userinput into the method as an InputStream
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        //declaring output var
        String output = null;
        //will insert userInput value to the output
        Scanner scanner =  new Scanner(inputStream, StandardCharsets.UTF_8.name());
        //will read a line
        output = scanner.nextLine();

        //positive scenario
        Assert.assertTrue(output.contains(userInput));
        //negative scenario
        Assert.assertFalse(output.isEmpty());

 }
    @Test
    public void sortString() {

        String testString = "A11a4";
        String sortedString = alphaNumericSort.sortString(testString);

        //positive scenarios
        Assert.assertTrue(sortedString.length() == testString.length());

        int isNotSame = sortedString.compareTo(testString);
        // assertion should be negative
        Assert.assertTrue(isNotSame<0);

        //negative scenario
        Assert.assertFalse(sortedString.isBlank());
        Assert.assertNotEquals(sortedString, testString);

    }


}
