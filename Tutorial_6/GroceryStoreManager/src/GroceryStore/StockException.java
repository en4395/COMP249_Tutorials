package GroceryStore;

public class StockException extends Exception {
    private Product product;

    public StockException(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
