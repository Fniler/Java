package org.example;

public class Food extends Product {

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Food(String name, double price, double weight, String category) {
        super(name, price, weight);
        this.category = category;
    }

    public void sell(String tip) {
        System.out.println("тип:" + tip);
    }

    @Override
    public double getDiscount() {
        return 15;
    }

    @Override
    public String toString() {
        return getName() + " " + getPrice() + " " + getWeight() + " " + category;
    }
}