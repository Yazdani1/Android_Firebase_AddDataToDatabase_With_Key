package firebase.firebase16allupdate;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Yazdani on 3/16/2017.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
