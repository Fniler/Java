package org.example;

public class CheckingAccount extends Account{
    private  double overdraftLimit;

    public double getOverdraftLimit()
    {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String number, double balance, String owner, double overdraftLimit)
    {
        super(number, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void withdraw() {
        System.out.println("Снятие без комиссии");
    }

    @Override
    public void displayInfo() {
        System.out.println(getNumber());
        System.out.println(getBalance());
        System.out.println(getOwner());
        System.out.println(overdraftLimit);
    }

    @Override
    public String toString() {
        return getNumber() + getBalance() + getOwner() + overdraftLimit;
    }
}
