package GUI;

import Classes.Drink;
import Classes.DrinkFactory;
import Classes.DripCoffee;
import Controller.OrderController;

public class OrderGUI {
    OrderController oc;
    DrinkFactory df;
     //on start up, the menu items get initialized
    //it is from this class that the frontend will connect to grab info about each drink

    public OrderGUI() {
        OrderController oc = new OrderController();
        DrinkFactory df = new DrinkFactory();
        //additional Drinks to be added later
    }

    //this shows coffees


    public String onAddToCart(String drink){
        return oc.addToCart(df.createDrink(drink));

    }
}
