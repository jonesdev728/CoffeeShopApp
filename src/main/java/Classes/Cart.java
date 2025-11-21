package Classes;

import java.util.ArrayList;

public class Cart {
    ArrayList<Drink> cart;

    public Cart()
    {
    Cart c = new Cart();}

    public String addToCart(Drink d){
        cart.add(d);
        return "Added to Cart";
    };

    public String removeFromCart(Drink d){
        cart.remove(d);
        return "Removed From Cart";
    };
}
