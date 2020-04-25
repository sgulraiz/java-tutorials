package com.sheharyar.array;

//In this class we will calculate the average of numbers passed in by the user
//We will first define our array
// We will create a method and use scanner object to collect user response and insert the numbers to the array
//We will then pass the loaded array to a method to calculate the average

import java.util.Scanner;

public class Average {
    //define the scanner object
    private static Scanner scanner = new Scanner(System.in);
    //main method

    public static void main(String[] args){
        //define the array and initialize it using the method getIntegers()
        int[] myIntegers = getIntegers(5);
        //print the numbers entered by the user and their element number in the array
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + " Value " + myIntegers[i]);
        }
        //print the average
        System.out.println("Average: " + getAverage(myIntegers));
    }

    //method to capture the user responses and return with an array containing the values
    //it takes in the number which defined the length of the array (or the number of times we want to ask the user)
    //it will return an array with user inputs

    public static int[] getIntegers(int number) {

        //System out to prompt the user to provide input - We are using \r escape character/sequence
        //to move the cursor to the next line
        System.out.println("Enter " + number + " numbers.\r");
        //define a local array with the length of the numbers passed into the method
        int[] values = new int[number];
        //now loop through the user response the number of times passed in the method which was added to the dimension
        // of the array when it was initialized and add each response to the array
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        //return the array
        return values;
    }

    //method to parse the array and calculate average based on the contents of the array

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        //calculate and return the average
        return (double) sum / (double) array.length;
    }


}
