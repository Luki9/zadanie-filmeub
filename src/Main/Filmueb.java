package Main;

import SE01.Actors;
import SE01.Movies;
import SE01.Tvshows;

public class Filmueb {

    public static void main(String[] args) {

        Movies movie = new Movies("Grand Torino", "Clint Eastwood", "Crime", "Drama movie", 8);
        Tvshows tvshows = new Tvshows("The Game of Thrones", 7, 10, "David Beinhoff", 9, "Adventure");
        Actors actors = new Actors("Clint", "Eastwood", "USA");


        System.out.printf("Tytuł:%s\n", movie.getTitle());
        System.out.printf("Reżyser:%s\n", movie.getDirector());
        System.out.printf("Gatunek:%s\n", movie.getGenres());
        System.out.printf("Opis:%s\n", movie.getDescription());
        System.out.printf("Ocena:%s\n\n", movie.getRating());

        System.out.printf("Tytuł;%s\n", tvshows.getTitle());
        System.out.printf("Sezon:%s\n", tvshows.getSeasons());
        System.out.printf("Odcinek:%s\n", tvshows.getParts());
        System.out.printf("Producent:%s\n", tvshows.getProducer());
        System.out.printf("Ocena:%s\n", tvshows.getRating());
        System.out.printf("Opis:%s\n\n", tvshows.getDescription());


        System.out.printf("Imię;%s\n", actors.getFirstName());
        System.out.printf("Nazwisko:%s\n", actors.getLastName());
        System.out.printf("Pochodzenie:%s\n\n", actors.getCountry());
    }
}
