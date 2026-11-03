package org.example;

public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void sell() {
        System.out.println("Продаю чет");
    }

    public void sell(int quantity) {
        System.out.println("Продаю " + quantity);
    }

    public void sell(double discount) {
        System.out.println("Продаю безсз скидки " + discount);
    }

    public double getDiscount() {
        return 0;
    }

    @Override
    public String toString() {
        return name + price + weight;
    }
}