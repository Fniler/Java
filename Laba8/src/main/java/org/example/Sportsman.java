package org.example;

public class Sportsman  {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Sportsman(String name, String team, int number) {
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public String getPosition() {
        return "Спортсмен";
    }

    public void displayInfo() {
        System.out.println("Имя " + name);
        System.out.println("Команда " + team);
        System.out.println("Номер " + number);
        System.out.println("Позиция " + getPosition());
    }

    @Override
    public String toString() {
        return name + team + number;
    }
}
