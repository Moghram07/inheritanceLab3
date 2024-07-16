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
        System.out.println("Watching movie: "+ getTitle());
    }

    public void recommendSimilarMovies(List<Movie> movieCatalog){
        String director = getAuteur();
        System.out.println("Movies from the director "+ director + " : ");
        for(Movie movie : movieCatalog){
            if(movie.getAuteur().equals(director)){
                System.out.println("- "+ movie.getTitle());
            }
        }
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
