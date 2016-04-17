package com.example.guilherme.demoappdress;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.guilherme.demoappdress.Handler.DatabaseHandler;

public class StarterActivity extends Activity {

    public static int TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        Log.i("bd", "start in");
        DatabaseHandler dbHandler = new DatabaseHandler(this);
        dbHandler.getWritableDatabase();
        Log.i("bd", "start out");

        ImageView applogo = (ImageView) findViewById(R.id.appLogo);
        applogo.animate().alpha(0f).setDuration(TIMEOUT);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        },TIMEOUT );

    }
}
