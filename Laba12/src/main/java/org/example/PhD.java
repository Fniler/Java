package org.example;

public class PhD extends Student{
    private int publications;

    public int getPublications() {
        return publications;
    }

    public void setPublications(int publications) {
        this.publications = publications;
    }

    public PhD(String name, int id, int grade, int publications) {
        super(name, id, grade);
        this.publications = publications;
    }

    @Override
    public String toString() {
        return getName() + getId() + getGrade() + publications;
    }
}
