package com.android.kushwaha.anurag.biet_canteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView profiletv;
    TextView menutv;
    TextView contacttv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        profiletv=(TextView)findViewById(R.id.profileid);
        profiletv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent(Main2Activity.this,profile.class);
                            startActivity(intent);
                }
            }
        );
        menutv=(TextView)findViewById(R.id.menuid);
        menutv.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent=new Intent(Main2Activity.this,menu.class);
                                             startActivity(intent);
                                         }
                                     }
        );

        contacttv=(TextView)findViewById(R.id.contactid);
        contacttv.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent=new Intent(Main2Activity.this,contact.class);
                                          startActivity(intent);
                                      }
                                  }
        );
        }

}
