public class Movie {
    private String name;
    private String director;
    private int year;
    private String type;
    private String description;
    private int rating;

    public Movie(String name, String director, int year, String type, String description, int rating) {
        this.name = name;
        this.director = director;
        this.year = year;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
