import java.util.Scanner;

public class ConsoleDataReader {
    Scanner sc = new Scanner (System.in);

    Movie createMovie(Movie movie ) {
        System.out.println("Podaj nazwę filmu");
        movie.setName(sc.nextLine());

        System.out.println("Podaj reżysera");
        movie.setDirector(sc.nextLine());

        System.out.println("Podaj rok produkcji");
        movie.setYear(sc.nextInt());
        sc.nextLine();

        System.out.println("Podaj rodzaj filmu (komedia, akcja itp.)");
        movie.setType(sc.nextLine());

        System.out.println("Podaj, krótki opis filmu");
        movie.setDescription(sc.nextLine());

        System.out.println("Podaj ocenę filmu w zakresie ( 1 - 10)");
        movie.setRating(sc.nextInt());
        sc.nextLine();
        return movie;


    }

    SerialFilm createTvSeries(SerialFilm serialFilm) {


        System.out.println("Podaj nazwę serialu");
        serialFilm.setName(sc.nextLine());

        System.out.println("Podaj ilość sezonów min. - 1 ");
        serialFilm.setNumberOfSeasons(sc.nextInt());

        System.out.println("Podaj ilość Odcinków min. - 2 ");
        serialFilm.setNumberOfEpisodes(sc.nextInt());
        sc.nextLine();

        System.out.println("Podaj producenta serialu");
        serialFilm.setFilmProducer(sc.nextLine());

        System.out.println("Podaj rodzaj serialu (komedia, akcja itp.");
        serialFilm.setType(sc.nextLine());

        System.out.println("Podaj, krótki opis serialu");
        serialFilm.setDescription(sc.nextLine());

        System.out.println("Podaj ocenę filmu w zakresie ( 1 - 10)");
        serialFilm.setRating(sc.nextInt());
        sc.nextLine();
        return serialFilm;
    }



    Actor createActor(Actor actor) {

        System.out.println("Podaj imię aktora");
        actor.setFirstName(sc.nextLine());

        System.out.println("Podaj nazwisko aktora");
        actor.setLastName(sc.nextLine());

        System.out.println("Kraj pochodzenie");
        actor.setCountry (sc.nextLine());
        return actor;
    }
}
