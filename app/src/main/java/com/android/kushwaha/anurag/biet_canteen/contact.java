package com.android.kushwaha.anurag.biet_canteen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {

    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        call=(Button)findViewById(R.id.callid);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                String phNum="tel:"+"7238827799";
                callIntent.setData(Uri.parse(phNum));
                startActivity(callIntent);
                }
        });

    }

}
