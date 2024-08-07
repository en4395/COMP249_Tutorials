public class GroceryOrder {
    private static int ids = 2000;
    private int id;
    private double totalCost;
    private String customerName;

    public GroceryOrder(double totalCost, String customerName) {
        this.totalCost = totalCost;
        this.customerName = customerName;
        id = ids++;
    }

    public int getId() {
        return id;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order ID: " + id + ", Cost: $" + totalCost + ", Customer: " + customerName;
    }
}


