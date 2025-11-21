package Classes;
import java.util.LinkedList;
import java.util.Queue;
public class OrderQueue {

    private static OrderQueue oq = null;
    private static Queue<Order>queue;
    private OrderQueue(){
        System.out.println("New LL created in OrderQueue class from constructor");
        queue = new LinkedList<>();
    }
    public static synchronized OrderQueue getInstance(){
        if(oq == null) {
            oq = new OrderQueue();}
        return oq;
    }
    public String addToOrderQueue(Order o){
        System.out.println("Element added to queue");
        queue.add(o);
        System.out.println(queue.element());
        return "Added to Queue";
    }
}
