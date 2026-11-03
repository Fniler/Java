package org.example;

public class Main {
    public static void main(String[] args) {

    Account[] accounts = new Account[5];
        accounts[0] = new SavingsAccount("10212", 100000, "Алексей", 5);
        accounts[1] = new SavingsAccount("2302", 200, "Иваныч", 7);
        accounts[2] = new CheckingAccount("40341", 150, "Макс Ферстапен", 5000);
        accounts[3] = new CheckingAccount("20232", 2500, "Димоооооооооон", 10000);
        accounts[4] = new CheckingAccount("2234", 30, "Андрюха", 15000);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
            System.out.println("Проценты: " + accounts[i].calculateInterest());
            accounts[i].withdraw();
            System.out.println();
        }
    }
}
