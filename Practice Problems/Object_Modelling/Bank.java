import java.util.*;
class Bank {
    ArrayList<Customer> customers = new ArrayList<>();

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}
