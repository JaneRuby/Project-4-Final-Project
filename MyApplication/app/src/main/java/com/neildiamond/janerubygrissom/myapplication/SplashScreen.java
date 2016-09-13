package com.neildiamond.janerubygrissom.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Button enterBtn;
    ImageView splashScreen;

    //"splash screen, intro, enter the app"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        enterBtn = (Button) findViewById(R.id.splashButton);
        splashScreen = (ImageView) findViewById(R.id.splashscreen);


        //when the button is clicked, enters next screen
        enterBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

            }
        });
//
//        ConnectivityManager conMgr = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//
//        if ( conMgr.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED
//                || conMgr.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTING ) {
////
////            Toast.makeText(SplashScreen.this, "Online", Toast.LENGTH_SHORT).show();
//            // notify user you are online
//
//        }
//        else if ( conMgr.getNetworkInfo(0).getState() == NetworkInfo.State.DISCONNECTED
//                || conMgr.getNetworkInfo(1).getState() == NetworkInfo.State.DISCONNECTED) {
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                splashScreen.setBackground(getDrawable(R.drawable.no_network_connection));
//            }
//            enterBtn.setEnabled(false);
//
////            Toast.makeText(SplashScreen.this, "Offline", Toast.LENGTH_SHORT).show();
//            // notify user you are not online
//        }
    }

}
