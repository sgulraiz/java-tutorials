package com.sheharyar.oop;

public class Main {

    public static void main(String[] args){

       // Instantiate the object with calling the constructors and passing the values
        Account sgAccount = new Account("123456",2000.0,"SG","sg@gmail.com","8567046633");
        //Instantiate the object with calling the default constructor which in turn calls the overloaded constructor
        //Account sgAccount = new Account();
        sgAccount.depositFunds(1000.0);
        sgAccount.withdrawFunds(3000.0);

    }
}
