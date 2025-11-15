package Classes;

import GUI.CreateAccountGUI;


import java.util.Scanner;

  public class CreateAccountTest{
public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
        //User goes to the CreateAccount GUI
        CreateAccountGUI cac=new CreateAccountGUI();
    System.out.println("Enter email: ");
    String email = scanner.nextLine();

    System.out.println("Enter password: ");
    String password = scanner.nextLine();
    System.out.println(cac.onCreateAccountClicked(email, password));


        }

  }