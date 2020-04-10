package com.sheharyar.basic;

public class ParseFromString {

    //This is the example where we can parse the integer or double value from string and use the values for computation

    public static void main(String[] args) {

        String numberAsString = "2020";
        int number = Integer.parseInt(numberAsString);

        System.out.println("numberAsString " + numberAsString);
        System.out.println("number" + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);


    }
}
