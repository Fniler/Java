package org.example;

public class Graduate extends Student{
    private String thesis;

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public Graduate(String name, int id, int grade, String thesis) {
        super(name, id, grade);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return getName() + " " + getId() + " " + getGrade() + " " + thesis;
    }
}
