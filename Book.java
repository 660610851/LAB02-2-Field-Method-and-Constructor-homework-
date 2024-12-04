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
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("Invalid price. No changes made.");
        } else {
            price = newPrice;
        }
    }

    public void applyDiscount(double discount) {
        if (discount <= 0.00 || discount >= 100.00) {
            System.out.println("Invalid discount percentage. It must be greater than 0.00 and less than 100.00.");
            return;
        }
        double discountAmount = price * (discount / 100);
        double newPrice = price - discountAmount;
        price = newPrice; // Update the price field
        System.out.println("Discount of " + discount + "% applied. New price: $" + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        // Example usage
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 20.0);
        book.displayDetails();

        book.applyDiscount(-20);   // Invalid discount
        book.applyDiscount(0);     // Invalid discount
        book.applyDiscount(0.5);   // Small valid discount
        book.applyDiscount(25.00); // Valid discount
        book.applyDiscount(100.00); // Invalid discount
        book.applyDiscount(150);   // Invalid discount
    }
}
