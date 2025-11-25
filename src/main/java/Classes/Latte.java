package Classes;




public class Latte implements Drink{
    //PULL THESE FROM DATABASE AFTER IMPLEMENTATION
    String description;
    String name;
    double price;
    char size;

    public Latte(char size){
        this.description = "Nice and Frothy";
        this.name = "Latte Coffee";

        if(size == 's'){
            this.price = 4.5;}
        else if (size == 'm'){
            this.price = 5.5;
        }
        else
            this.price = 6.5;

        this.size = size;
    }
    @Override
    public String getDescription(){
        return description;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override

    public char getSize(){
        return size;
    }
    @Override

    public double getPrice() {
        return price;
    }

}
