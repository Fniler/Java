package org.example;


public class Main {
    public static void main(String[] args) {
        Product product = new Product("товар", 100, 2);
        Electronics electronics = new Electronics("Телефон", 1500, 0.5, "самса");
        Food food = new Food("молоко", 3, 1, "Молочка");

        product.sell();
        product.sell(5);
        product.sell(10.0);

        electronics.sell("Куркурьер");
        food.sell("скоропортящийся");

        System.out.println(product.getDiscount());
        System.out.println(electronics.getDiscount());
        System.out.println(food.getDiscount());

        Product product1 = new Electronics("Ноутбук", 2000, 2, "ASUS");
        Product product2 = new Food("Хлеб", 2, 0.5, "Хлебобулочные");

        System.out.println(product1.getDiscount());
        System.out.println(product2.getDiscount());

        System.out.println(electronics);
        System.out.println(food);
    }
}