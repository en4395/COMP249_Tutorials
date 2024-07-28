package GroceryStore;

import java.io.*;
import java.util.ArrayList;

public class GroceryStore {
    private String storeName;
    private File inventoryFile;
    private ArrayList<Product> productList;
    private final int CRITICAL_STOCK_THRESHOLD = 10;
    public GroceryStore(String storeName, String inventoryFileName) {
        this.storeName = storeName;
        inventoryFile = new File(inventoryFileName);
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    // Serialize products in productList and write them into inventory file
    public void updateInventory() {
        try {
            // Create file output stream for inventory file
            FileOutputStream fos = new FileOutputStream(inventoryFile);
            // Wrap output stream in object output stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Serialize each product object in the product list and
            // write it to inventoryFile
            for(Product product : productList) {
                oos.writeObject(product);
            }

            oos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // Read bytestream from inventory file and deserialize product objects
    public void loadInventory() {
        ArrayList<Product> inventoryProductsList = new ArrayList<Product>();

        try {
            // Create file input stream for inventory file
            FileInputStream fis = new FileInputStream(inventoryFile);
            // Wrap input stream in object input stream
            ObjectInputStream ois = new ObjectInputStream(fis);

            /*
            *   1. Read an object from the input stream,
            *   2. Try to cast that object to a Product object
            *   3. Add that product to this local list
            */
            inventoryProductsList.add((Product)ois.readObject());

            for(Product product : productList) {
                System.out.println(product);
            }

            ois.close();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void checkStockLevels() {
        try {
            for(Product product : productList) {
                if(product.getQuantity() < CRITICAL_STOCK_THRESHOLD) {
                    throw new StockException(product);
                }
            }
        } catch(StockException e) {
            int currentQuantity = e.getProduct().getQuantity();
            System.out.println("Stock exception was thrown, there are only " +
                    currentQuantity + " " + e.getProduct().getName() + " in stock. " +
                    "\nBuying 50 more...");

            e.getProduct().setQuantity(currentQuantity + 50);
            e.printStackTrace();
        }
    }
}
