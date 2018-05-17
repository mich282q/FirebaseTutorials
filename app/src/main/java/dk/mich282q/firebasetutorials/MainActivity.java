package dk.mich282q.firebasetutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button mFirebasebtn;
//
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebasebtn = (Button) findViewById(R.id.firebase_btn);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mFirebasebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 1 - Create Child in root objevt
                // 2 - Assign som valuse to the child object

                mDatabase.child("Name").setValue("Akshaue JH");

            }
        });
    }
}

