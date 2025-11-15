package Database;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.Firestore;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;


public class DBMGR {
    private static Firestore db;

    public DBMGR() throws IOException {
        FirestoreConnector fc = new FirestoreConnector();

        this.db = fc.getFirestoreInstance();
        }

public boolean isFound(String email){
    System.out.println("Database being searched from dbmgr to see if email exists");
    //Search database and return True if email is found
    //
    return false;

}

    public String storeInDB(String name, String email) {
        if (db == null) {
            return ("Firestore instance not initialized. Call setFirestoreInstance() first.");
                  }

        Map<String, Object> userData = new HashMap<>();
        userData.put("name", name);
        userData.put("email", email);
        userData.put("createdAt", System.currentTimeMillis()); // Add a timestamp

        // Add a new document with a generated ID
        ApiFuture<DocumentReference> future = db.collection("Users").add(userData);
return"success";
    }
}
