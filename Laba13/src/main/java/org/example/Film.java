package org.example;

public class Film {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws InvalidFilmDataException {
        if (year < 1900 || year > 2025) {
            throw new InvalidFilmDataException("год не правильный" + year);
        }

        this.year = year;
    }

    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) throws InvalidFilmDataException {
        if (rating < 1 || rating > 10) {
            throw new InvalidFilmDataException("рейтинг не правильный" + rating);
        }

        this.rating = rating;
    }

    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Film(String title, String director, int year, double rating, String genre) throws InvalidFilmDataException {

        this.title = title;
        this.director = director;
        this.setYear(year);
        this.setRating(rating);
        this.genre = genre;
    }

    public void updateRating(double newRating) throws RatingUpdateException {
        if (newRating < 1 || newRating > 10) {
            throw new RatingUpdateException("рейтинг не правильный " + newRating);
        }

        this.rating = newRating;
    }

    public static Film getFilmByYear(Film[] films, int year) throws FilmNotFoundException {
        for (Film film : films) {
            if (film.getYear() == year) {
                return film;
            }
        }

        throw new FilmNotFoundException("фильм" + year + " год не найден");
    }

    @Override
    public String toString() {
        return title + " " + director + " " + year + " " + rating + " " + genre;
    }
}