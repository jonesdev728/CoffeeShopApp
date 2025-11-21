package Controller;

import Classes.Cart;
import Classes.Drink;
import Classes.Order;
import Classes.OrderQueue;

public class OrderController {
    Cart c;
    Order o;

    public OrderController() {
        Cart c = new Cart();
        this.c = c;};

    public String addToCart(Drink d) {

        System.out.println("Drink object passed to Cart class from the OrderController class addToCart Method");
        return c.addToCart(d);
    }

    public String placeOrder() {
        System.out.println("Order object created in memory");
        Order o = new Order(c);
        this.o = o;
        System.out.println("Order object (which contains a Drink object) sent to addToQueue method from OrderController class");
        return (o.addToQueue(o));
    }

}
