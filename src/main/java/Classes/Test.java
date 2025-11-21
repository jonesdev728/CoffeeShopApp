package Classes;

import GUI.CreateAccountGUI;
import GUI.OrderGUI;


import java.io.IOException;
import java.util.Scanner;

  public class Test{
public static void main(String[]args) throws Exception {

    //Create Account Test//
    Scanner scanner=new Scanner(System.in);
        //User goes to the CreateAccount GUI
        CreateAccountGUI cac=new CreateAccountGUI();
    System.out.println("Enter email: ");
    String email = scanner.nextLine();

    System.out.println("Enter password: ");
    String password = scanner.nextLine();

    System.out.println("Enter First Name: ");
    String fName = scanner.nextLine();

    System.out.println("Enter Last Name:");
    String lName = scanner.nextLine();

    System.out.println(cac.onCreateAccountClicked(password, email,fName,lName));
//////////////////////////////////////////////////////////////////////////////

    //Order a drink logic:
    //This will show a user clicking "Add to Cart" on a DripCoffee
    //This will add the Drip Coffee to the cart
    //After this, we assume the user will click "Submit Checkout" which will create an Order
    //This order will be stored in the OrderQueue class

    OrderGUI orderGUI = new OrderGUI();

    System.out.println(orderGUI.Drink.drip);
    //click "add to cart"
    orderGUI.onAddToCart(d);



        }

  }