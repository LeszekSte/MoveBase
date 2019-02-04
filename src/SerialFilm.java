public class SerialFilm {
    private String name;
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private String filmProducer;
    private String type;
    private String description;
    private int rating;

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
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
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
