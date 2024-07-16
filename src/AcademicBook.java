public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int quantityOfStock, String subject){
        super(title, auteur, ISBN, price, quantityOfStock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        return (getAverageRating()>=4.5)? "Bestselling AcademicBook":"AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "title='" + getTitle() + '\'' +
                ", Auteur='" + getAuteur() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", price=" + getPrice() +
                ", quantityInStock=" + getQuantityInStock() +
                ", subject='" + subject + '\'' +
                '}';
    }
}
