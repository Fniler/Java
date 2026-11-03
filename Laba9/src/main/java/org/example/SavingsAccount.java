package org.example;

public class SavingsAccount extends Account{
    private double rate;

    public double getRate(){
        return rate;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public SavingsAccount(String number, double balance, String owner, double rate){
        super(number, balance, owner);
        this.rate = rate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * rate / 100;
    }

    @Override
    public void withdraw() {
        System.out.println("Снятие с комиссией 1%");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(rate);
    }

    @Override
    public String toString() {
        return getNumber() + getBalance() + getOwner() + rate;
    }
}
