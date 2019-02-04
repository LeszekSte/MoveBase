public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor("Tomasz", "Kalolak", "Poland");

        String description = "Haker komputerowy Neo dowiaduje się\n" +
                "od tajemniczych rebeliantów, że świat,\n" +
                " w którym żyje, jest tylko obrazem przesyłanym\n " +
                "do jego mózgu przez roboty";
        Movie movie = new Movie("Martix", "Lilly Wachowski", 1999, "Sci_Sf",description , 7);

        description = "Polska rodzinka 5 osobowa";
        SerialFilm serialFilm = new SerialFilm("Rodzinka.pl", 13, 13, "TVP", "Comedy", description, 7);

        System.out.println(actor.toString());
        System.out.println(movie.toString());
        System.out.println(serialFilm.toString());



    }


}
