package GUI;

import Controller.CreateAccountController;

import javax.swing.*;
import java.io.IOException;

public class CreateAccountGUI {
    CreateAccountController cac;

    // User is on the main page
    //They click on the Create Account tab in from the main page
    //When they click this button, the CreateAccountGui is created

    public CreateAccountGUI() throws IOException {
        System.out.println("New CreateAccountController Created");
        CreateAccountController cac =
        new CreateAccountController();
        this.cac = cac;
    }

    //These text fields will be filled out with the needed info

    JTextField emailField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    String email = emailField.getText();
    String password = new String(passwordField.getPassword());

    //Once they do this, they click the button "Create"
    //This will call this function which passes on the info to the controller

   public String onCreateAccountClicked(String email, String password){
       System.out.println("Passing to CreateAccountController with username and password");
       String message = cac.createAccount(email,password);
        return message;
   }


}
