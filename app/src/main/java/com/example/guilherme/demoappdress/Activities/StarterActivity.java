package com.example.guilherme.demoappdress.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.guilherme.demoappdress.Helper.Database;
import com.example.guilherme.demoappdress.R;

import java.sql.SQLException;

public class StarterActivity extends Activity {

    public static int TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        Database db = new Database(getApplicationContext());
        try {
            db.open();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

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
