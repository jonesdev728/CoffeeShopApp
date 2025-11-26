package Controller;

import Database.DBMGR;

import java.io.IOException;

public class LoginController {
    DBMGR dbmgr;
    private String password, email;

    public LoginController() throws IOException {
        System.out.println("New DBMGR object created");
        DBMGR dbmgr = new DBMGR();
        this.dbmgr = dbmgr;
    }
    public String login(String password, String email) throws Exception {
        this.password = password;
        this.email = email;

        System.out.println("Calling db to see if user exists/ password is correct");
        if (dbmgr.verifyUser(email,password) == "Correct Password"){//This means that the account has been made
            System.out.println("Hooray");
            return "Logged in and Account Object created"; //If this happens, pass to LoginGUI
        } else
            return "Invalid input either username or password is wrong";
    }
}


