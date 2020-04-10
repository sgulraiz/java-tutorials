package com.sheharyar.oop;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Empty constructor
    // We can overload the constructor
    //If we want to control the initialization of an object by initializing it with default values
    //We can call the constructor with parameters and pass some default values when the default constructor
    //is called
    public Account(){
        //the statement below with the this keyword will call the constructor with parameters
        this("1234", 1.0, "Smith", "smith@gmail.com","8567028877");
        System.out.println("Empty constructor called");
    }


    //overloaded constructor
    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("constructor with parameters was called!");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Hello: " + this.customerName + "\nDeposit amount: $" + deposit + "\nYour balance is: $" + this.balance);
    }

    public void withdrawFunds(double withdraw){
        if (this.balance - withdraw >= 0){
            this.balance -= withdraw;
            System.out.println("Withdrawal Amount: $" + withdraw + "\nYour balance is: $" + this.balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
