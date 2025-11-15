package Controller;

import Database.DBMGR;

public class CreateAccountController {
    DBMGR dbmgr;
    private String email, password;

    public CreateAccountController() {
        System.out.println("New DBMGR object created");
        DBMGR dbmgr = new DBMGR();
        this.dbmgr = dbmgr;
    }
    public String createAccount(String email, String password) {
        this.email = email;
        this.password = password;
        System.out.println("Calling db to see if user exists");
        if (dbmgr.isFound(email) == true) {
            return "Account Already Created"; //If this happens, pass to LoginGUI
        } else
            return dbmgr.storeInDB(email, password);
    }
}
