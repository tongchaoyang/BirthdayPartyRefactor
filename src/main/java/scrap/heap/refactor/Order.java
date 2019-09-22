package scrap.heap.refactor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<LineItem> items;
    private LocalDateTime date;
    
    public Order(Customer customer, LocalDateTime date) {
        this.customer = customer;
        this.date = date;
        this.items = new ArrayList<>();
    }
    public Customer getCustomer() {
        return customer;
    }
    public List<LineItem> getItems() {
        return items;
    }
    public LocalDateTime getDate() {
        return date;
    }
    
    public void addItem(Product p, int quantity, double discount) {
        items.add(new LineItem(p, quantity, discount));
    }
    
    public double getGrandTotal() {
        double r = 0;
        for (LineItem i : items) {
            r += i.getTotal();
        }
        return r;
    }
    @Override
    public String toString() {
        return "Order [customer=" + customer + ", date=" + date + ", items=" + items + "] + ";
    }
}
