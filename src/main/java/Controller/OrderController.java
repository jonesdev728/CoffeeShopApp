package Controller;

import Classes.Cart;
import Classes.Drink;
import Classes.Order;
import Classes.OrderQueue;

public class OrderController {
    Cart c;
    Order o;
    OrderQueue oq;
    public OrderController(){
        Cart c = new Cart();
    }

    public String addToCart(Drink d){
       return c.addToCart(d);

    }
}
