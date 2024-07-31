import GroceryStore.GroceryStore;
import GroceryStore.Product;

public class Main {
    public static void main(String[] args) {
        Product cheese = new Product("Cheddar Cheese", 12.99, 7);
        Product lettuce = new Product("Boston Lettuce", 3.99, 46);
        Product tamari = new Product("Tamari", 10.89, 20);

        GroceryStore ellasShop = new GroceryStore("Ella's Shop", "src/GroceryStore/EllasShop.txt");

        ellasShop.addProduct(cheese);
        ellasShop.addProduct(lettuce);
        ellasShop.addProduct(tamari);

        ellasShop.checkStockLevels();

        ellasShop.updateInventory();
        ellasShop.loadInventory();
    }
}