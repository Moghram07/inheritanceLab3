import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private int quantityInStock;
    private List<Review> reviews;

    public Book(String title, String auteur, String ISBN, double price, int quantityInStock){
        super(title, auteur, ISBN, price);
        this.quantityInStock = quantityInStock;
        this.reviews = new ArrayList<>();
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setListOfReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review r){
        reviews.add(r);
    }

    public double getAverageRating(){
        if (reviews.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(Review review: reviews){
            sum += review.getRating();
        }
        return sum/reviews.size();
    }

    public void purchase(User user){

    }
    public boolean isBestseller(){
        return getAverageRating()>=4.5;
    }

    public void restock(int quantity){
        quantityInStock += quantity;
        System.out.println(quantity + " copies of "+ getTitle() + " have been restocked.");
    }

    @Override
    public String getMediaType(){
        return isBestseller()? "Bestselling Book": "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", Auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", quantityInStock=" + quantityInStock +
                ", reviews=" + reviews +
                '}';
    }
}
