import java.util.ArrayList;
import java.util.List;
public class Store {
    private List<Media> mediaList;
    private List<User> userList;

    public Store() {
        this.mediaList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void displayUsers() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public void displayMedias() {
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }

    public Book searchBook(String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return (Book) media;
            }
        }
        return null;//book not fouond
    }
}


