package escom.myapp;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Field;

public class DisplayAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_add);

      /*  AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();

        User us1 = new User();
        us1.setUid(1);
        us1.setFirstName("Elias");
        us1.setLastName("Garcia");

        db.userDao().insertAll(us1);

        //db.close();+*/


    }
}
