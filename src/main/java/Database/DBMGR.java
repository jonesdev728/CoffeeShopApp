package Database;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.api.core.ApiFuture;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.ListenerRegistration;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;


public class DBMGR {
    private static Firestore db;

    public DBMGR() throws IOException {
        FirestoreConnector fc = new FirestoreConnector();

        this.db = fc.getFirestoreInstance();
        }

public boolean emailExists(String email) throws Exception {
        if (db == null){
            System.out.println(email);
            return false;}
        else
        {
        String emailToSearch = email;
        System.out.println(email);
        String collectionName = "Customers";
        String emailFieldName = "Email";

        CollectionReference usersRef = db.collection(collectionName);

        Query query = usersRef.whereEqualTo(emailFieldName,emailToSearch);
        ApiFuture<QuerySnapshot> future = query.get();



        QuerySnapshot snapshot = future.get();
            System.out.println(snapshot.size());
        if (snapshot.size() == 0){
            System.out.println("Email Doesn't exist");
            return true;//email not found. User can create account
    }
    System.out.println("User has an account already");
    return false;//email found. User can log in

}}
    public String getFirestoreTimestamp() {
        ZonedDateTime now = ZonedDateTime.now();
        return now.format(DateTimeFormatter.ISO_INSTANT);}

    public String storeInDB(String password, String email,String fName, String lName) {
        if (db == null) {
            return ("Firestore instance not initialized. Call setFirestoreInstance() first.");
                  }
        else{

        Map<String, Object> userData = new HashMap<>();

        userData.put("FirstName",fName);
        userData.put("LastName",lName);
        userData.put("Email", email);
        userData.put("Password",password);
        userData.put("DateJoined", getFirestoreTimestamp()); // Add a timestamp
        userData.put("CustomerID", java.util.UUID.randomUUID().toString());
        userData.put("Points", 0);


        try{
            ApiFuture<DocumentReference> future = db.collection("Customers").add(userData);

            DocumentReference docRef = future.get();
            System.out.println("Doc written with id:"+ docRef.getId());


        } catch (Exception e) {
            e.printStackTrace();
            return "Error writing to Database" + e.getMessage();

        }
        // Add a new document with a generated ID
return"success";
    }
    }
}
