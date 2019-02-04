public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Tomasz", "Kalolak", "Poland");

        String description = "Haker komputerowy Neo dowiaduje się\n" +
                "od tajemniczych rebeliantów, że świat, \n" +
                "w którym żyje, jest tylko obrazem przesyłanym\n " +
                "do jego mózgu przez roboty";
        Movie movie1 = new Movie("Martix", "Lilly Wachowski", 1999, "Sci_Sf",description , 7);

        description = "Polska rodzinka 5 osobowa";
        SerialFilm serialFilm1 = new SerialFilm("Rodzinka.pl", 13, 13, "TVP", "Comedy", description, 7);

        ConsoleDataReader reader = new ConsoleDataReader();

        System.out.println("Podaj info o aktorze");
        Actor actor = new Actor();
        reader.createActor(actor);
        System.out.println(actor.toString());

        System.out.println("Podaj info o serialu");
        SerialFilm serialFilm = new SerialFilm();
        reader.createTvSeries(serialFilm);
        System.out.println(serialFilm.toString());

        Movie movie = new Movie();
        reader.createMovie(movie);
        System.out.println(movie.toString());
     //   System.out.println(movie1.toString());




    }


}
