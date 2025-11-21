package GUI;

import Classes.Drink;
import Classes.DrinkFactory;
import Classes.DripCoffee;
import Controller.OrderController;

public class OrderGUI {
    OrderController oc;
    DrinkFactory df;

    public OrderGUI() {
        OrderController oc = new OrderController();
        DrinkFactory df = new DrinkFactory();
        this.oc = oc;
        this.df= df;
    }

    //this shows coffees
    public String onAddToCart(String drink){
        System.out.println("Sending a Drink object to OrderController from the OrderGui Class via the addToCartMethod");
       return oc.addToCart(df.createDrink(drink));
    }

    public String onOrderCoffee(){
        System.out.println("Calling the OrderController PlaceOrder Method from the OrderGui Class");
        return oc.placeOrder();
    }
}
