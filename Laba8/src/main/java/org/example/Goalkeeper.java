package org.example;

public class Goalkeeper extends Sportsman {
    private int saves;

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public Goalkeeper(String name, String team, int number, int saves) {
        super(name, team, number);
        this.saves = saves;
    }

    @Override
    public String getPosition() {
        return "Вратарь";
    }

    public void makeSave() {
        saves++;
        System.out.println("сейвов: " + saves);
    }

    @Override
    public String toString() {
        return getName() + getTeam() + getNumber() + saves;
    }
}