package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Film film1 = new Film("Интерстеллар", "не помню", 2014, 9.0, "Фантастика");
            Film film2 = new Film("Сотня", "хз", 2010, 8.8, "Фантастика");
            Film film3 = new Film("Бегущий в лабиринте", "порок", 1999, 9.1, "Фантастика");

            Film[] films = {film1, film2, film3};

            System.out.println("все фильмы:");
            for (Film film : films) {
                System.out.println(film);
            }

            System.out.println("\nпоиск фильма за 2014 год:");
            Film foundFilm = Film.getFilmByYear(films, 2014);
            System.out.println(foundFilm);

            System.out.println("\nобновление рейтинга:");
            film1.updateRating(9.5);
            System.out.println(film1);

            System.out.println("\nпроверка ошибки поиска:");
            Film.getFilmByYear(films, 2020);

        } catch (InvalidFilmDataException e) {
            System.out.println("ошибка данных " + e.getMessage());
        } catch (FilmNotFoundException e) {
            System.out.println("ошибка поиска " + e.getMessage());
        } catch (RatingUpdateException e) {
            System.out.println("ошибка обнов рейтинга " + e.getMessage());
        }
    }
}