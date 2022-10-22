package petrolStation;

public class ShopFuel {

    private Fuel fuel;
    private double quantity;
    private double price;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double  getPrice(Fuel[] fuel) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
