# SmartFrongCanary
Rysbekova Nestan : Front-End QA Homework

The task was to implement two different sorting methods:

1.Alpahnumerical sort with several conditions (sequence should be: numbers, lowercase letters, uppercase letters, all other characters;
and if any two numerical characters are next to each other, then they need to be treated as one numeric value. 

2.Bubble Sort (without conditions)

Tasks are done using Java programming language. I used JUnit for Assertions and TestNG for my Test annotaions. Dependencies are managed in pom.xmal file. 
Also, I have created a testng.mxl file to run tests (it could be done as well for the smoke and regression test suites for the further projects). 
@Test was created for every method (with both positive and negative scenarios).

Alphanumeric sorting was done with getUserInput method (Scanner) & sortString method(every char of the given String is checked according to the ASCII table, then added to the specific ArrayList (numbers, lowercase, uppercase and char lists), then sorted separately, after added to the new List (sortedList) and converted to String (StringUtil class). Scanner class was used to make code more reusable. ArrayLists were used, so related characters would be stored seprately as regular sort() method does not meet the conditions of the exercise (sequence of characters: first lowercase, then uppercase) and to keep order of numbers (when 2 numbers should be treated as one). As numbers have specific condition, first of all, I have checked if character is a number (ASCII table), then checked if the next character in sequence is not out of the String's length (so to not to get an exception), after I have checked if a characteer is a number (ASCII), if the condition is true, I did concatination of the 1st & 2nd characters in a row being numbers, then added them to tempInt (String) variable, then converted number into the integer and added to Integer List, declared tempInt variable (String) as null, so it could be used again for the next numbers in the String.

Bubble sorting was implemented with creatingArray method (Random Class), as conditions were not given in the exercise, I have defined array's size(10) and numbers' range(up to 100) as a condition for the Random class, so array is always dynamic & bubbleSort method (using while loop, for loop and dummy temporary variable for swapping). In both cases main method only calling sorting method which call another method as an arguement, to make code more clean.

Instructions on how to execute tests 

You can run all tests from testng.xml file (by right click on the file -> run testng.xml) and see the results in console.

Normally, as QA Automation Engineer I do not perform unit tests, for the sake of the assignment, I have performed unit tests for the two sorting methods. Test cases are correlated with the methods inside the classes. All tests have positive and negative scenarios with the different types of assertions.

--------BubbleSort TEST----------

creatingArray Test: I used Stream approach to find a greatest number in array (if the condition of array met). Checked conditions for the array (10 numbers in an array; numbers should be up to 100; numbers should be generated (so when calling method array should not be empty). bubbleSort Test : I've created testArray, whcih has been sorted with the bubbleSort method and also I have sorted String with the Arrays.sort() method, then compared if the array from the bubbleSort method is sorted as expected.

--------AlpahnumericalSort TEST------

shoulTakeUserInput : checked if scanner is working and passing a value. Used InputSteam, Scanner class, then compared input and output. sortString Test : created testString (original) & sortedString (used Alpahnumerical sort), compared them.

Things I would add if I had more time Maybe I would add more positive and negative scenarios, but I am not sure if it necessary.
