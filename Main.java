//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // สร้างหนังสือแบบ unknown
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // สร้างหนังสือ Harry Potter
        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        // ทดสอบการอัปเดตราคา
        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();

        // ทดสอบการใช้ส่วนลด
        System.out.println("\nApplying discounts:");
        hp1Book.applyDiscount(-10);  // ส่วนลดไม่ถูกต้อง
        hp1Book.applyDiscount(0);    // ส่วนลดไม่ถูกต้อง
        hp1Book.applyDiscount(10);   // ส่วนลด 10%
        hp1Book.applyDiscount(50);   // ส่วนลด 50%
        hp1Book.applyDiscount(100);  // ส่วนลดไม่ถูกต้อง
    }
}
