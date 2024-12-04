public class Book {
    String title;
    String author;
    Double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author" + author);
        System.out.println("price" + price);
        // TODO: Complete the rest of this method.
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

