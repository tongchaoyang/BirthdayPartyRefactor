package scrap.heap.refactor;

public class LineItem {
    private Product product;
    private int quantity;
    private double discount;
    
    public LineItem(Product p, int quantity, double discount) {
        product = p;
        this.quantity = quantity;
        this.discount = discount;
        if (discount < 0 || discount >= 1) {
            throw new RuntimeException("Invalid discount rate!");
        }
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }
    
    public double getTotal() {
        return product.getPrice() * quantity * (1 - discount);
    }

    @Override
    public String toString() {
        return "LineItem [product=" + product + ", quantity=" + quantity + ", discount=" + discount + "]";
    }
}
