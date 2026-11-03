package org.example;

public class Forward extends Sportsman {
    private int goals;

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public Forward(String name, String team, int number, int goals) {
        super(name, team, number);
        this.goals = goals;
    }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    public void scoreGoal() {
        goals++;
        System.out.println("голов: " + goals);
    }

    @Override
    public String toString() {
        return getName() + getTeam() +  getNumber() + goals;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}