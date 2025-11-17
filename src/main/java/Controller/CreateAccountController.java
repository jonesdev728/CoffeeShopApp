package Controller;

import Database.DBMGR;

import java.io.IOException;

public class CreateAccountController {
    DBMGR dbmgr;
    private String email, password;

    public CreateAccountController() throws IOException {
        System.out.println("New DBMGR object created");
        DBMGR dbmgr = new DBMGR();
        this.dbmgr = dbmgr;
    }
    public String createAccount(String password, String email) throws Exception {
        this.email = email;
        this.password = password;
        System.out.println("Calling db to see if user exists");
        if (dbmgr.emailExists(email)==false){//This means that the account has been made
            System.out.println(dbmgr.emailExists(email));
            return "Account Already Created"; //If this happens, pass to LoginGUI
        } else
            return dbmgr.storeInDB(email, password);
    }
}
