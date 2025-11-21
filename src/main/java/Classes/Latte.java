package Classes;




public class Latte implements Drink{
    //PULL THESE FROM DATABASE AFTER IMPLEMENTATION
    String description;
    String name;
    double price;

    public Latte(){
        String description = "Nice and Frothy";
        String name = "Latte Coffee";
        double price = 4.5;
    }
    public String getDescription(){
        return description;
    }
}
