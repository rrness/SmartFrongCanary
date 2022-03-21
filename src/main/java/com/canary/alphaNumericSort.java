package com.canary;

import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class alphaNumericSort {

        public static void main(String[] args) {

            System.out.println(sortString(getUserInput()));

        }
            public static String getUserInput () {
            System.out.println("Please enter your string");
            Scanner sc = new Scanner(System.in);
            String str =  sc.nextLine();
            return str;
        }
            public static String sortString(String str) {

                //initializing separate lists for the different symbols
                ArrayList<Integer> integerList = new ArrayList<>();
                ArrayList<Character> upperCaseList = new ArrayList<>();
                ArrayList<Character> lowerCaseList = new ArrayList<>();
                ArrayList<Character> charactersList = new ArrayList<>();

               //declaring dummy var
                String tempInt = "";

                //starting iteration of the string
                for (int i = 0; i < str.length(); i++) {

                    //numbers:
                    // condition: if char (i) of the String is a number
                    if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                        //condition: if the next char (i+1) is not out of the String length
                        if (i + 1 < str.length()) {
                            //condition: if the next char (i+1) is a number
                            if (str.charAt(i + 1) >= 48 && str.charAt(i + 1) <= 57) {
                                //concatinating (i) & (i+1) characters in temp var.
                                tempInt = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1));
                                //incrementing (i)
                                i++;
                            } //condition: if the next char (i+1) is not number
                            else {
                                //adding char(i) into temp var.
                                tempInt = String.valueOf(str.charAt(i));
                            }
                        } //if the next char in seq (i+1) is bigger than String length
                        else {
                            ////adding char(i) into temp var.
                            tempInt = String.valueOf(str.charAt(i));
                        } //adding temp int into the intergerList
                        integerList.add(Integer.parseInt(tempInt));
                        //declaring tempInt null
                        tempInt = "";
                    }
                    //lower case letters
                    else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                        //adding char(i) into the lowerCaseList
                        lowerCaseList.add(str.charAt(i));
                        //Upper case letters
                    } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                        upperCaseList.add(str.charAt(i));
                        //other symbols
                    } else {
                        charactersList.add(str.charAt(i));
                    }
                }
                    //sorting very list separately
                    Collections.sort(integerList);
                    Collections.sort(upperCaseList);
                    Collections.sort(lowerCaseList);
                    Collections.sort(charactersList);

                    //creating sortedList & adding values
                    ArrayList<Object> sortedList = new ArrayList<Object>();
                    sortedList.addAll(integerList);
                    sortedList.addAll(lowerCaseList);
                    sortedList.addAll(upperCaseList);
                    sortedList.addAll(charactersList);

                    //converting sortedList into a String
                    String sortedString = StringUtils.join (sortedList,"");

                    //printing sorted list
                    System.out.println("Original: " + str);
                    System.out.print("Sorted: " );
                    return  sortedString;

                }
            }


