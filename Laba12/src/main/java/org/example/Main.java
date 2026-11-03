package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("Алексей", new Undergraduate("Алексей", 1, 9, 4));
        students.put("Иван", new Undergraduate("Иван", 2, 8, 3));
        students.put("Максим", new Undergraduate("Максим", 3, 7, 2));
        students.put("Дмитрий", new Graduate("Дмитрий", 4, 10, "Ерип"));
        students.put("Андрей", new Graduate("Андрей", 5, 8, "Кибербез"));
        students.put("Сергей", new Graduate("Сергей", 6, 9, "Кибер"));
        students.put("Никита", new PhD("Никита", 7, 10, 15));
        students.put("Павел", new PhD("Пашок", 8, 9, 10));

        students.forEach((key, value) -> {
            System.out.println(key + value);
        });

        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1, "Минск", "Белорусская", 3, Arrays.asList(5, 4, 5)));
        restaurants.add(new Restaurant(2, "Минск3", "бел2", 4, Arrays.asList(3, 2, 5)));
        restaurants.add(new Restaurant(3, "Минск2", "беллл", 2, Arrays.asList(2, 4, 4)));
        restaurants.add(new Restaurant(4, "Минск4", "б", 5, Arrays.asList(3, 4, 5)));
        restaurants.add(new Restaurant(5, "Токио1", "белорусска", 3, Arrays.asList(5, 4, 1)));


        Iterator<Restaurant> iterator = restaurants.iterator();
        while (iterator.hasNext()) {
            Restaurant restaurant = iterator.next();
            if (restaurant.getAverageReview() < 3) {
                iterator.remove();
            }
        }

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getAverageReview() >= 4) {
                restaurant.setStars(restaurant.getStars() + 1);
            }
        }

        printRestaurants(restaurants, 4);
        System.out.println("-------------");
        restaurants.sort(Comparator.comparingDouble(Restaurant::getAverageReview).reversed().thenComparing(Restaurant::getName, Comparator.reverseOrder()));


        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getId() + " " + restaurant.getName() + " " + restaurant.getAverageReview());
        }
    }

    public static void printRestaurants(List<Restaurant> restaurants, int stars) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getStars() == stars) {
                System.out.println(restaurant);
            }
        }
    }
}
