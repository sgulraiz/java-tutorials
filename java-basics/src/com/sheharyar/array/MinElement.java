package com.sheharyar.array;

import java.util.Scanner;

//In this program, we will get the user input to create an array
//We will then then ask the user to provide the numbers to add to the array
//find min value from the array
public class MinElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the total number of values for an array: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myIntArray = readIntegers(count);
        printIntegers(myIntArray);
        System.out.println("Minimum value entered is: " + findMin(myIntArray));
    }

    public static int[] readIntegers(int count){
        int[] myIntegers = new int[count];
        System.out.println("Enter " + count + " numbers: ");
        for (int i=0; i<myIntegers.length; i++){
            myIntegers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myIntegers;
    }

    public static void printIntegers(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " ,Value " + array[i]);
        }
    }

    public static int findMin(int[] array){
//arrange the array values in Ascending order
        boolean flag = true;
        int temp = 0;

        while (flag) {
            flag = false;
            for(int i=0; i<array.length-1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        //once array is arranged in ascending order then select the first elements which will be the minimum value
        return array[0];
    }
}
