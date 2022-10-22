package petrolStation;

public class Cart {

    private Fuel[] products;
    private double totalPrice;

    public Fuel[] getProducts() {
        return products;
    }

    public void setProducts(Fuel[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
