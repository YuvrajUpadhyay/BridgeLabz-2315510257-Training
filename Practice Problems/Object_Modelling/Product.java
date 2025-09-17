import java.util.*;
class Product {
    String name;
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
}

class Customer1 {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    void placeOrder(Order o) {
        orders.add(o);
    }
}
