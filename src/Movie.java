import java.util.List;

public class Movie extends Media{
    private int duration; //in minutes

    public Movie(String title, String auteur, String ISBN, double price, int duration){
        super(title,auteur,ISBN,price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user){
        user.purchased(this);
    }

    public void recommendSimilarMovies(List<Movie> movieCatalog){

    }

    @Override
    public String getMediaType(){
        return (duration>120)? "Long Movie": "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + getTitle() + '\'' +
                ", Auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", duration=" + duration +
                '}';
    }
}
