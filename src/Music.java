import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String title, String auteur, String ISBN, double price){
        super(title, auteur, ISBN, price);
        this.artist = auteur;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
        System.out.println("User "+ user.getUsername() + " is listening to: "+ getTitle() + " by "+ artist);
    }
    public void generatePlaylist(List<Music>musicCatalog){
        System.out.println("Music playlist by: " + artist + " : ");
        for(Music music: musicCatalog){
            if(music.getArtist().equals(artist)){
                System.out.println(" - " + music.getTitle());
            }
        }
    }

    @Override
    public String getMediaType(){
        return (getPrice()>= 10)? "Premium Music":"Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + getTitle() + '\'' +
                ", artist='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
