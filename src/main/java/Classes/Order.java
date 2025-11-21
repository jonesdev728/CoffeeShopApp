package Classes;

public class Order {
    Cart c;

    public Order(Cart c) {
        this.c = c;
    }

    public String addToQueue(Order o) {
        OrderQueue oq = OrderQueue.getInstance();
        System.out.println("The order has been added to the queue");
        return (oq.addToOrderQueue(o));
    }

}
