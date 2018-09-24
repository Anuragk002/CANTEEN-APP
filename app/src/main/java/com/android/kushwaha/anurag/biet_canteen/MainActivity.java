package com.android.kushwaha.anurag.biet_canteen;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private static final int PERMISSIONS = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) !=
                PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) !=
                PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.SEND_SMS,
                    Manifest.permission.CALL_PHONE
            }, PERMISSIONS);
        }

    imageButton=(ImageButton) findViewById(R.id.nextImg);
    imageButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
        }
    });
    }
}
