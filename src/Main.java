public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Book book1 = new Book("The Incoherence of the Philosophers تهافت الفلاسفة", "Mohammed Al-Ghazali", "N000546987", 17.99, 2);
        Book book2 = new Book("The Sealed Nectar الرحيق المختوم", "Safiur Rahman Mubarakpuri", "N0004578963", 15.99, 5);
        Book book3 = new Book("The Truth Revealed إظهار الحق", "Rahmatullah Kairanvi", "N0002346951", 13.99, 4);
        Book book4 = new Book("The Garden of the Righteous رياض الصالحين", "Yahya ibn Sharaf an-Nawawi", "N000564789", 16.99, 6);
        book1.addReview(new Review("Omar Alshehri", 5, "Amazing book"));
        book2.addReview(new Review("Mohammed Alzahrani", 5, "Epic"));
        book3.addReview(new Review("Hussam Sharmani", 5, "Very informative"));
        book4.addReview(new Review("Abdulaziz Alshehri", 5, "Great book"));
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);
        Movie movie1 = new Movie("The Showshank Redemption", "Frank Darabont", "N132456789", 15.99, 142);
        Movie movie2 = new Movie("The Green Mile", "Frank Darabont", "N413697852", 13.99, 189);
        Movie movie3 = new Movie("The Count of Monte Cristo", "Kevin Reynolds", "N5647896512", 10.99, 131);
        Movie movie4 = new Movie("Tracks", "John Curran", "N551236987", 9.99, 113);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);
        store.addMedia(movie4);
        Music music1 = new Music("Clap Again", "Akon", "N020005487", 2.99);
        Music music2 = new Music("Freedom", "Akon", "N020005461", 2.99);
        Music music3 = new Music("Locked up", "Akon", "N020006533", 2.99);
        Music music4 = new Music("Sorry", "Otis Stacks", "N020001432", 2.99);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(music4);
        Novel novel1 = new Novel("Alchemist", "Paulo Coelho", "N0001245876", 8.99, 5,"Philosophy");
        Novel novel2 = new Novel("Persepolis", "Marjane Satrapi", "N0002354896", 6.99, 9, "Graphic");
        Novel novel3 = new Novel("Partners in Crime", "Agatha Cristie", "N000546978", 4.99, 10, "Detective");
        Novel novel4 = new Novel("Death on the Nile", "Agatha Cristie", "N000547896", 4.99, 8,"Detective");
        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(novel3);
        store.addMedia(novel4);
        AcademicBook acadbook1 = new AcademicBook("Head First Java", "Kathy Sierra & Bert Bates", "N505002457",11.99, 9, "Java Programming");
        AcademicBook acadbook2 = new AcademicBook("HTML for the World Wide Web", "Elizabeth Castro", "N505003345",9.99, 8, "HTML Programming");
        store.addMedia(acadbook1);
        store.addMedia(acadbook2);

        //Display all items in the store
        System.out.println("Available Media in Store:");
        store.displayMedias();

        // Create users
        User user1 = new User("user1", "user1@example.com");
        User user2 = new User("user2", "user2@example.com");

        // Add users to the store
        store.addUser(user1);
        store.addUser(user2);

        // User interactions
        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(music1);

        // User checkout
        user1.checkout();

        // Display purchased media for user1
        System.out.println("\nPurchased Media for " + user1.getUsername() + ":");
        for (Media media : user1.getPurchased()) {
            System.out.println(media.getTitle() + " - " + media.getMediaType());
        }

        // Search for a book by title
        Book foundBook = (Book) store.searchBook("Book Title 1");
        if (foundBook != null) {
            System.out.println("\nFound Book:");
            System.out.println(foundBook);
        } else {
            System.out.println("\nBook not found.");
        }

    }
}