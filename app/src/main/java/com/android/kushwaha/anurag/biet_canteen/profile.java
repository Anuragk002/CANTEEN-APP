package com.android.kushwaha.anurag.biet_canteen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.android.kushwaha.anurag.biet_canteen.profileedit.MyPREFERENCES;

public class profile extends AppCompatActivity {

    ImageButton editbtn;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editbtn=(ImageButton)findViewById(R.id.editid);
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(profile.this,profileedit.class);
                startActivity(intent);
            }

        });

        sharedpreferences= getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String name=sharedpreferences.getString("nameKey","editfirst");
        TextView displayName=(TextView)findViewById(R.id.nametv);
        displayName.setText(name);

        sharedpreferences= getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String room=sharedpreferences.getString("roomKey","editfirst");
        TextView displayRoom=(TextView)findViewById(R.id.roomtv);
        displayRoom.setText(room);

        sharedpreferences= getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String hostel=sharedpreferences.getString("hostelKey","editfirst");
        TextView displayHostel=(TextView)findViewById(R.id.hosteltv);
        displayHostel.setText(hostel);
    }
}
