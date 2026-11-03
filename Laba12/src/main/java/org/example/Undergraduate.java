package org.example;

public class Undergraduate extends Student {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Undergraduate(String name, int id, int grade, int year) {
        super(name, id, grade);
        this.year = year;
    }

    @Override
    public String toString() {
        return getName() + getId() + getGrade() + year;
    }
}
