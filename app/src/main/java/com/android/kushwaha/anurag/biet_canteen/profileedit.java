package com.android.kushwaha.anurag.biet_canteen;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profileedit extends AppCompatActivity {
    EditText et1,et2,et3;
    Button savebtn;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Room = "roomKey";
    public static final String Hostel = "hostelKey";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileedit);
        et1=(EditText)findViewById(R.id.editname);
        et2=(EditText)findViewById(R.id.editroom);
        et3=(EditText)findViewById(R.id.edithostel);
        savebtn=(Button)findViewById(R.id.saveedit);
        sharedpreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=et1.getText().toString();
                String r=et2.getText().toString();
                String h=et3.getText().toString();

                SharedPreferences.Editor editor=sharedpreferences.edit();

                editor.putString(Name,n);
                editor.putString(Room,r);
                editor.putString(Hostel,h);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
