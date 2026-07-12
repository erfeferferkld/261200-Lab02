public class Book {
    // Fields (State)
    String isbn;
    String title;
    String author;
    double price;
    int publicationYear;
    // TODO: Add author, price, and publicationYear

    // Parameterized Constructor
    public Book(String isbn, String title, String author, double price, int publicationYear) {
        // TODO: Initialize all 5 fields
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    // Default Constructor
    public Book() {
        // TODO: Complete this constructor to set default values
        this("000-0-0000-0000-0", "Unknow", "Unknow", 0.0,1990);
    }

    // Methods (Behaviors)
    // Get book details
    public String getDetails() {
        // TODO: Complete this method to return a formatted string.
        return "[" + this.isbn + "]" + this.title + " by " +
                this.author + " (" + this.publicationYear + ") - " + this.price;
    }

    // Update book price (only if positive)
    public void updatePrice(double newPrice) {
        // TODO: Check if newPrice is valid. If valid, update the price.
        if( newPrice > 0.0)
            this.price = newPrice;
    }

    // Compare with another book
    public boolean isSameBook(Book otherBook) {
        // TODO: Complete this method to return true if this book's ISBN matches
        //the otherBook's ISBN
        return this.isbn.equals(otherBook.isbn);
    }

    //discount calculation
    public boolean applyDiscount(double discountPercentage){
        if(discountPercentage > 0.00 && discountPercentage < 100){
            double discountAmount = this.price * discountPercentage / 100.0;
            this.price = this.price - discountAmount;
            return true;
        }
        return false; //invalid
    }
}
