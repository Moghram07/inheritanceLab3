import java.util.List;

public class Review {
    private String username;
    private double rating;
    private String comments;
    private List<Review> reviews;
    public Review(String username, double rating, String comments){
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
    @Override
    public String toString() {
        return "Review{" +
                "username='" + username + '\'' +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }

}
