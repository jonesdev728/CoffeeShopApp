package Classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
    ArrayList<Drink> cart;

    public Cart()
    {
        System.out.println("New arraylist initialized in the Cart class constructor");
        cart = new ArrayList<>();
    }

    public String addToCart(Drink d){
        System.out.println("Drink added to cart arraylist in the cart class");
        cart.add(d);
        return "Added to Cart";
    };

    public String removeFromCart(Drink d){
        cart.remove(d);
        return "Removed From Cart";
    };

}
