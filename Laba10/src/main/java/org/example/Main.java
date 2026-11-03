package org.example;

public class Main {
    public static void main(String[] args) {
        Playable[] games = new Playable[5];
        games[0] = new Football("МИНСК", "Реал", 90, 0);
        games[1] = new Football("Минск2", "Интер", 90, 0);

        games[2] = new Basketball("Минск 3 возвращение домой", "хз", 48, 0);
        games[3] = new Basketball("Минск 4 нет пути домой", "хз2", 48, 0);
        games[4] = new Basketball("Минск 5 не шагу назад", "хз3", 48, 0);

        for(int i = 0; i < games.length; i++)
        {
            games[i].play();
        }

        Football football1 = (Football) games[0];
        Football football2 = (Football) games[1];
        Basketball basketball1 = (Basketball) games[2];
        Basketball basketball2 = (Basketball) games[3];
        Basketball basketball3 = (Basketball) games[4];

        football1.score();
        football1.score();
        football2.score();

        basketball1.score();
        basketball1.score();
        basketball1.score();
        basketball2.score();
        basketball2.score();
        basketball3.score();

        System.out.println(football1);
        System.out.println(football2);
        System.out.println(basketball1);
        System.out.println(basketball2);
        System.out.println(basketball3);
    }
}