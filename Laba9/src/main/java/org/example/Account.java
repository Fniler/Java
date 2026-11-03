package org.example;

public abstract class Account {
    private String number;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    private double balance;

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    private String owner;

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public Account(String number, double balance, String owner)
    {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public abstract double calculateInterest();

    public abstract void withdraw();
    
    public void displayInfo()
    {
        System.out.println(number);
        System.out.println(balance);
        System.out.println(owner);
    }

    @Override
    public String toString() {
        return number + balance + owner;
    }
}
