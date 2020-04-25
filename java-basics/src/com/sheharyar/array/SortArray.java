package com.sheharyar.array;

//In this program we will do the following
//1 - We will create a method getIntegers to capture the values from the user
//2 - We will then sort the values in the array that was loaded with values from the user
//3 - we will then print the sorted values in the array

import java.util.Scanner;

public class SortArray {

    //the main method to execute all the other methods
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        System.out.println("User Input: ");
        printIntegers(myIntegers);
        System.out.println("Sorted Integers: ");
        printIntegers(sortIntegers(myIntegers));
    }

    //this method will get user input and load it to the array

    public static int[] getIntegers(int number){
        //create a scanner object to capture user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " numbers");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printIntegers(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " ,Value " + array[i]);
        }
    }

    //this method will sort the values of integer in descending (highest to lowest) order

    public static int[] sortIntegers(int[] array){
        //create an array that will contain the sortedIntegers
        int[] sortedArray = new int[array.length];
        //copy contents of array that is passed in to this method to sortedArray
        for (int i=0; i<sortedArray.length; i++){
            sortedArray[i] = array[i];
        }
        //set boolean and a temp integer variable to use in the while statement
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            //for loop to iterate over the array
            for (int i=0; i<sortedArray.length-1; i++){
                //if statement will check if the value of the array is less than the next value of the array
                //if the value is less, then assign the value to the temp variable for temporary storage
                //assign the higher value to the element with the lower value
                //then replace the element with higher value with the temporary value
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
