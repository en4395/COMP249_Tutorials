import java.util.LinkedList;
import java.util.Iterator;

public class OrderManager {
    private LinkedList<GroceryOrder> orderQueue = new LinkedList<>();

    public void addOrder(GroceryOrder order) {
        orderQueue.add(order);
    }

    public void completeOrder() {
        if (!orderQueue.isEmpty()) {
            GroceryOrder order = orderQueue.removeFirst();
            System.out.println("Completed Order: " + order);
        } else {
            System.out.println("No orders to complete.");
        }
    }

    public void cancelOrderUsingForEach(int id) {
        for(GroceryOrder order : orderQueue) {
            if(order.getId() == id) {
                orderQueue.remove(order);
                System.out.println("Cancelled Order: " + order);
                return;
            }
        }
        System.out.println("Order ID not found.");
    }

    public void cancelOrderUsingIterator(int id) {
        Iterator<GroceryOrder> iterator = orderQueue.iterator();
        while (iterator.hasNext()) {
            GroceryOrder order = iterator.next();
            if (order.getId() == id) {
                iterator.remove();
                System.out.println("Cancelled Order: " + order);
                return;
            }
        }
        System.out.println("Order ID not found.");
    }

    public void printQueue() {
        System.out.println("Order Queue:");
        for (GroceryOrder order : orderQueue) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.addOrder(new GroceryOrder(25.50, "Yasmin"));
        manager.addOrder(new GroceryOrder(15.75, "Pete"));
        manager.addOrder(new GroceryOrder(74.30, "Illya"));

        manager.printQueue();
        manager.completeOrder();
        manager.cancelOrderUsingForEach(2001);
        //manager.cancelOrderUsingIterator(2001);
        manager.printQueue();
    }
}
