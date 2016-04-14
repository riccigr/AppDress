package com.example.guilherme.demoappdress;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;


public class IndicacaoActivity extends Activity {

    LinearLayout grd1_1, grd1_2, grd1_3,grd1_4, grd1_5, grd1_6 ;
    LinearLayout grd2_1, grd2_2, grd2_3,grd2_4, grd2_5, grd2_6 ;
    LinearLayout.LayoutParams params, params2;
    RelativeLayout next, prev;
    int viewWidth;
    GestureDetector gestureDetector = null;
    HorizontalScrollView horizontalScrollView;
    ArrayList<LinearLayout> layouts, layouts2;
    int parentLeft, parentRight;
    int mWidth;
    int currPosition, prevPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indicacao);

        Intent i = getIntent();

        Log.i("Sexo: ",i.getStringExtra("genero"));
//        Log.i("Dia: ",i.getStringExtra("dia"));
//        Log.i("Mês: ",i.getStringExtra("mes"));
        Log.i("Destino: ",i.getStringExtra("destino"));
        Log.i("Periodo: ",i.getStringExtra("periodo"));

 //----------------------------------

        prev = (RelativeLayout) findViewById(R.id.prev);
        next = (RelativeLayout) findViewById(R.id.next);
        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hsv);
        gestureDetector = new GestureDetector(new MyGestureDetector());
        grd1_1 = (LinearLayout) findViewById(R.id.grd1_1);
        grd1_2 = (LinearLayout) findViewById(R.id.grd1_2);
        grd1_3 = (LinearLayout) findViewById(R.id.grd1_3);
        grd1_4 = (LinearLayout) findViewById(R.id.grd1_4);
        grd1_5 = (LinearLayout) findViewById(R.id.grd1_5);
        grd1_6 = (LinearLayout) findViewById(R.id.grd1_6);

        grd2_1 = (LinearLayout) findViewById(R.id.grd2_1);
        grd2_2 = (LinearLayout) findViewById(R.id.grd2_2);
        grd2_3 = (LinearLayout) findViewById(R.id.grd2_3);
        grd2_4 = (LinearLayout) findViewById(R.id.grd2_4);
        grd2_5 = (LinearLayout) findViewById(R.id.grd2_5);
        grd2_6 = (LinearLayout) findViewById(R.id.grd2_6);

        Display display = getWindowManager().getDefaultDisplay();
        mWidth = display.getWidth(); // deprecated
        viewWidth = mWidth / 3;
        layouts = new ArrayList<LinearLayout>();
        params = new LinearLayout.LayoutParams(viewWidth, LinearLayout.LayoutParams.WRAP_CONTENT);

        grd1_1.setLayoutParams(params);
        grd1_2.setLayoutParams(params);
        grd1_3.setLayoutParams(params);
        grd1_4.setLayoutParams(params);
        grd1_5.setLayoutParams(params);
        grd1_6.setLayoutParams(params);

        layouts.add(grd1_1);
        layouts.add(grd1_2);
        layouts.add(grd1_3);
        layouts.add(grd1_4);
        layouts.add(grd1_5);
        layouts.add(grd1_6);

        layouts2 = new ArrayList<LinearLayout>();
        params2 = new LinearLayout.LayoutParams(viewWidth, LinearLayout.LayoutParams.WRAP_CONTENT);

        grd2_1.setLayoutParams(params2);
        grd2_2.setLayoutParams(params2);
        grd2_3.setLayoutParams(params2);
        grd2_4.setLayoutParams(params2);
        grd2_5.setLayoutParams(params2);
        grd2_6.setLayoutParams(params2);

        layouts2.add(grd2_1);
        layouts2.add(grd2_2);
        layouts2.add(grd2_3);
        layouts2.add(grd2_4);
        layouts2.add(grd2_5);
        layouts2.add(grd2_6);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        horizontalScrollView.smoothScrollTo(
                                (int) horizontalScrollView.getScrollX()
                                        + viewWidth,
                                (int) horizontalScrollView.getScrollY());
                    }
                }, 100L);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        horizontalScrollView.smoothScrollTo(
                                (int) horizontalScrollView.getScrollX()
                                        - viewWidth,
                                (int) horizontalScrollView.getScrollY());
                    }
                }, 100L);
            }
        });

        horizontalScrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (gestureDetector.onTouchEvent(event)) {
                    return true;
                }
                return false;
            }
        });
    }



    public void camisaToSite(View view){
        Uri uri = Uri.parse("http://www.lojasrenner.com.br/p/camiseta-estampada-539295922-539295931");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


    public void bermudaToSite(View view){
        Uri uri = Uri.parse("http://www.lojasrenner.com.br/p/bermuda-slim-em-sarja-539360202-539360253");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    class MyGestureDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                               float velocityY) {
            if (e1.getX() < e2.getX()) {
                currPosition = getVisibleViews("left");
            } else {
                currPosition = getVisibleViews("right");
            }

            horizontalScrollView.smoothScrollTo(layouts.get(currPosition)
                    .getLeft(), 0);
            return true;
        }
    }

    public int getVisibleViews(String direction) {
        Rect hitRect = new Rect();
        int position = 0;
        int rightCounter = 0;
        for (int i = 0; i < layouts.size(); i++) {
            if (layouts.get(i).getLocalVisibleRect(hitRect)) {
                if (direction.equals("left")) {
                    position = i;
                    break;
                } else if (direction.equals("right")) {
                    rightCounter++;
                    position = i;
                    if (rightCounter == 2)
                        break;
                }
            }
        }
        return position;
    }
}
