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
    public void viewCart(){
        double total = 0.0;
        for (int i =0;i<cart.size(); i++){
            System.out.println("+ "+cart.get(i).getName() + ", "+ cart.get(i).getSize()+ ", " + "$" +cart.get(i).getPrice()+" + ");
            total = total + cart.get(i).getPrice();
            System.out.println("+ ------------------ +");
        }

        System.out.println("+ ======="+ " $" +total + " +");
        System.out.println("++++++++++++++++++++++");
        System.out.println("");
    }

    public String removeFromCart(Drink d){
        cart.remove(d);
        return "Removed From Cart";
    };

}
