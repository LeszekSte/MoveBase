public class SerialFilm {
    private String name;
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private String filmProducer;
    private String type;
    private String description;
    private int rating;

    public  SerialFilm (){}
    public SerialFilm(String name, int numberOfSeasons, int numberOfEpisodes, String filmProducer, String type, String description, int rating) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.filmProducer = filmProducer;
        this.type = type;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
       if (numberOfSeasons<1){
           numberOfSeasons = 1;
           System.out.println("Ilość sezonów musi wynosić co najmniej 1");
       }
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        if (numberOfSeasons<2){
            numberOfSeasons = 2;
            System.out.println("Ilość odcinków musi być większa od 1");
        }
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getFilmProducer() {
        return filmProducer;
    }

    public void setFilmProducer(String filmProducer) {
        this.filmProducer = filmProducer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating<1 ||  rating> 10 ){
            rating = 5;
            System.out.println("Ocena serialu musi byś pomiędzy 1-10.\nW przypadku błednej oceny wpisuję ocenę -5    ");
        }


        this.rating = rating;
    }

    @Override
    public String toString() {
        return "SerialFilm{" +
                "name='" + name + '\'' +
                ", numberOfSeasons=" + numberOfSeasons +
                ", numberOfEpisodes=" + numberOfEpisodes +
                ", filmProducer='" + filmProducer + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
