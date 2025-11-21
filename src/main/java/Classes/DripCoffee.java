package Classes;

public class DripCoffee implements Drink{
    //PULL THESE FROM DATABASE AFTER IMPLEMENTATION
    String description;
    String name;
    double price;

    public DripCoffee(){
   String description = "Plain ol' Black Coffee";
   String name = "Drip Coffee";
   double price = 3.5;
    }
    public String getDescription(){
        return description;
    }
}
