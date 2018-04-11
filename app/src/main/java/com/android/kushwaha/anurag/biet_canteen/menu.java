package com.android.kushwaha.anurag.biet_canteen;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.android.kushwaha.anurag.biet_canteen.profileedit.MyPREFERENCES;

public class menu extends AppCompatActivity {

    int burger=0;
    int omlette=0;
    int tea=0;
    int total;
    Button confirm;

    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        sharedpreferences=getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE);
        final String name=sharedpreferences.getString("nameKey"," ");
        final String room=sharedpreferences.getString("roomKey","");
        final String hostel=sharedpreferences.getString("hostelKey","");

        confirm=(Button)findViewById(R.id.confirmid);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strPhone="7238827799";
                String strMessage=name+" Room="+room+" "+hostel+"\n Burger="+burger+" omlette="+omlette+" tea="+tea+" total="+total;
                SmsManager sms= SmsManager.getDefault();
                if(total==0) {
                    Toast.makeText(getApplicationContext(), "Select Something first", Toast.LENGTH_LONG).show();
                }
                else {
                    sms.sendTextMessage(strPhone, null, strMessage, null, null);
                    Toast.makeText(getApplicationContext(), "Ordered ** THANK YOU", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
//burger
    public void increaseBurger(View view){
        burger=burger+1;
        displayburger(burger);
        showTotal();
    }
    public void decreaseBurger(View view){
        burger=burger-1;
        if(burger>=0) {
            displayburger(burger);
            showTotal();
        }
        else
            burger=0;
    }
    private void displayburger(int number){
        TextView displayInteger=(TextView)findViewById(R.id.burgerid);
        displayInteger.setText(""+number);
    }

//omlette
public void increaseOmlette(View view){
    omlette=omlette+1;
    displayomlette(omlette);
    showTotal();
}
    public void decreaseOmlette(View view){
        omlette=omlette-1;
        if(omlette>=0) {
            displayomlette(omlette);
            showTotal();
        }
        else
            omlette=0;
    }
    private void displayomlette(int number){
        TextView displayInteger=(TextView)findViewById(R.id.omletteid);
        displayInteger.setText(""+number);
    }

    //tea
    public void increaseTea(View view){
        tea=tea+1;
        displaytea(tea);
        showTotal();
    }
    public void decreaseTea(View view){
        tea=tea-1;
        if(tea>=0) {
            displaytea(tea);
            showTotal();
        }
        else
            tea=0;
    }
    private void displaytea(int number){
        TextView displayInteger=(TextView)findViewById(R.id.teaid);
        displayInteger.setText(""+number);
    }

    //total
        public void showTotal(){
            total = (25 * burger) + (20 * omlette) + (10 * tea);
            displaytotal(total);
        }
    public void displaytotal ( int number){
            TextView displayInteger = (TextView) findViewById(R.id.totalid);
            displayInteger.setText("" + number);
        }




}
