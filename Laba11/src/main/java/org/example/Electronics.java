package org.example;

public class Electronics extends Product {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Electronics(String name, double price, double weight, String brand) {
        super(name, price, weight);
        this.brand = brand;
    }

    @Override
    public double getDiscount() {
        return 5;
    }

    public void sell(String delivery) {
        System.out.println("ДЫЫЫставка" + delivery);
    }

    @Override
    public String toString() {
        return getName() + " " + getPrice() + " " + getWeight() + " " + brand;
    }
}