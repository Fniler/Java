package org.example;

public class Main {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[5];

        sportsmen[0] = new Forward("Алексей", "ЦСК", 10, 15);
        sportsmen[1] = new Forward("Иваныч", "Оле Оле ЦСК - Москва", 7, 20);
        sportsmen[2] = new Forward("Макс", "хз", 9, 12);

        sportsmen[3] = new Goalkeeper("Дмитрий", "Нагиев", 1, 30);
        sportsmen[4] = new Goalkeeper("Андрюха", "Динамо", 16, 25);

        for (int i = 0; i < sportsmen.length; i++) {
            sportsmen[i].displayInfo();
            System.out.println();
        }

        Forward forward = (Forward) sportsmen[0];
        forward.scoreGoal();

        Goalkeeper goalkeeper = (Goalkeeper) sportsmen[3];
        goalkeeper.makeSave();
    }
}
