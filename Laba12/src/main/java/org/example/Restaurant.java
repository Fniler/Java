package org.example;

import java.util.List;

public class Restaurant {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String cuisine;

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    private int stars;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    private List<Integer> customerReviews;

    public List<Integer> getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(List<Integer> customerReviews) {
        this.customerReviews = customerReviews;
    }

    public Restaurant(int id, String name, String cuisine, int stars, List<Integer> customerReviews) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.stars = stars;
        this.customerReviews = customerReviews;
    }

    public double getAverageReview() {
        int sum = 0;

        for (int i = 0; i < customerReviews.size(); i++) {
            sum += customerReviews.get(i);
        }

        return (double) sum / customerReviews.size();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getAverageReview();
    }
}