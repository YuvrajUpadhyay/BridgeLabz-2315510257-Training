public class Product {
    private static double discount = 0.0;

    private final int productID;

    private String productName;
    private double price;
    private int quantity;

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void processProduct(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            p.displayDetails();
        } else {
            System.out.println("Invalid object. Not a Product.");
        }
    }
}
