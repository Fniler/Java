package org.example;

public class Basketball implements Playable, Scorable {
    private String team1;

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    private String team2;

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Basketball(String team1, String team2, int duration, int score) {
        this.team1 = team1;
        this.team2 = team2;
        this.duration = duration;
        this.score = score;
    }

    @Override
    public void play() {
        System.out.println("поигралии");
    }

    @Override
    public void score() {
        score++;
    }

    @Override
    public String toString() {
        return team1 + team2 + score;
    }
}