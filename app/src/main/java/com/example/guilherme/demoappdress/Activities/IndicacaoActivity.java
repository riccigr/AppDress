package com.example.guilherme.demoappdress.Activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.guilherme.demoappdress.BusinessLogic.ClimaLogic;
import com.example.guilherme.demoappdress.BusinessLogic.RoupaLogic;
import com.example.guilherme.demoappdress.Constants.TipoPeca;
import com.example.guilherme.demoappdress.POJO.Peca;
import com.example.guilherme.demoappdress.R;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class IndicacaoActivity extends Activity {

    //region #VARIAVEIS#
    // variaveis de layout
    HorizontalScrollView horizontalScrollView;
    ArrayList<LinearLayout> layouts, layouts2;
    TextView txtDescription ;

    //variaveis de deteccao de gestos
    GestureDetector gestureDetector = null;
    int currPosition;

    //variaveis de contexto
    private Context context;

    // variaveis de transicao
    int periodo = 0;
    int nivelTemperatura, mes;
    String cidade, descricao ;
    char genero;
    HashMap<Integer, Integer> mapPecaQuantity;
    List<TipoPeca> listTipoPecas = new ArrayList<>();

    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicacao);

        layoutCleaner();

        txtDescription = (TextView) findViewById(R.id.txtDescription);

        Intent i = getIntent();

        mes = Integer.parseInt(i.getStringExtra("MES"));
        cidade = i.getStringExtra("DESTINO");
        genero = (char) i.getCharExtra("GENERO", '0');
        periodo =  Integer.parseInt(i.getStringExtra("PERIODO"));

        ClimaLogic climaLogic = new ClimaLogic();
        nivelTemperatura = climaLogic.getTemperatureLevel(getApplicationContext(), mes, cidade);
        txtDescription.setText(climaLogic.getWeatherDescription(nivelTemperatura));

        RoupaLogic roupaLogic = new RoupaLogic();
        mapPecaQuantity = roupaLogic.quantifier(periodo, genero, nivelTemperatura);
        HashMap<Integer, List<Peca>> listPeca = roupaLogic.getRoupaIndication(getApplicationContext(),nivelTemperatura, genero);

        loadFlatIconLayout(mapPecaQuantity);
        loadImagaPecaLayout(listPeca);
    }


    //Carrega os icones dos tipos de roupas
    private void loadFlatIconLayout(HashMap<Integer, Integer> listaPecas){

        int mapSize = listaPecas.size();

        LinearLayout layoutParent = (LinearLayout)findViewById(R.id.innerLayFlat);
        for(HashMap.Entry<Integer, Integer> h : listaPecas.entrySet())
        {
            LinearLayout linear = new LinearLayout(this);
            RelativeLayout relative = new RelativeLayout(this);
            TextView counter = new TextView(this);
            ImageView flaticon = new ImageView(this);

            //Layout configuration
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(170, LinearLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
            LinearLayout.LayoutParams insideParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 80, Gravity.CENTER);
            RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.MATCH_PARENT);

            linear.setOrientation(LinearLayout.HORIZONTAL);

            linear.setLayoutParams(layoutParams);
            relative.setLayoutParams(relativeParams);

            counter.setLayoutParams(insideParams);
            counter.setText(h.getValue().toString().concat("."));
            counter.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Medium);

            TipoPeca tipoPeca = new TipoPeca();
            HashMap<Integer,String> pecaMap = tipoPeca.getPecaImageMap();

            flaticon.setLayoutParams(insideParams);
            flaticon.setPadding(15,0,0,0);
            flaticon.setImageResource(getResources().getIdentifier(pecaMap.get(h.getKey()), "drawable", getPackageName()));

            // Adds the view to the layout
            relative.addView(counter);
            relative.addView(flaticon);
            linear.addView(relative);
            layoutParent.addView(linear);
        }
    }

    private void loadImagaPecaLayout(HashMap<Integer, List<Peca>> mapPeca){


        int lastHsvId = 0;
        boolean isFirst = true;
        final float scale = getResources().getDisplayMetrics().density;
        DecimalFormat precision = new DecimalFormat("0.00");

        RelativeLayout relMaster = (RelativeLayout) findViewById(R.id.relMaster);

        for (HashMap.Entry<Integer, List<Peca>> mapItem : mapPeca.entrySet()) {

            List<Peca> listItem = mapItem.getValue();
            Log.i("loja id: ", String.valueOf(mapItem.getKey()));

            int currentHsvId = View.generateViewId();
            int currentLogoId = View.generateViewId();

            HorizontalScrollView hImage = new HorizontalScrollView(this);
            RelativeLayout.LayoutParams hImageparams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            hImage.setId(currentLogoId);
            if (!isFirst) {
                Log.i("eh o primeiro ", "Nao");
                hImageparams.addRule(RelativeLayout.BELOW, lastHsvId);
                lastHsvId = currentHsvId;
            }else {
                Log.i("eh o primeiro ", "Sim");
            }
            hImageparams.setMargins(0, 30, 0, 0);
            hImage.setLayoutParams(hImageparams);
            hImage.setHorizontalScrollBarEnabled(false);

            ImageView imageLogo = new ImageView(this);
            LinearLayout.LayoutParams imgParams2 = new LinearLayout.LayoutParams((int) (150 * scale), LinearLayout.LayoutParams.WRAP_CONTENT);
            imageLogo.setLayoutParams(imgParams2);
            imageLogo.setImageResource(getResources().getIdentifier("logo_".concat(String.valueOf(mapItem.getKey())), "drawable", getPackageName()));

            hImage.addView(imageLogo);


            HorizontalScrollView horizontal = new HorizontalScrollView(this);
            RelativeLayout.LayoutParams hparams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, (int) (150 * scale));
            horizontal.setId(currentHsvId);
            hparams.setMargins(0,10,0,0);
            hparams.addRule(RelativeLayout.BELOW, hImage.getId());

            horizontal.setLayoutParams(hparams);
            horizontal.setHorizontalScrollBarEnabled(false);

            LinearLayout innerLinear = new LinearLayout(this);
            LinearLayout.LayoutParams innerParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,  LinearLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER_VERTICAL);
            innerLinear.setLayoutParams(innerParams);
            innerLinear.setOrientation(LinearLayout.HORIZONTAL);

            for (final Peca p : listItem) {

                //region #monta layout dinamico#
                LinearLayout grd = new LinearLayout(this);
                LinearLayout.LayoutParams grdParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
                grd.setLayoutParams(grdParams);
                grd.setOrientation(LinearLayout.VERTICAL);
                grd.setPadding(0, 0, 10, 0);
                Log.i("<>", String.valueOf(p.getLink()));

                RelativeLayout relImage = new RelativeLayout(this);
                RelativeLayout.LayoutParams relImageParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, (int) (100 * scale));
                relImage.setLayoutParams(relImageParams);

                ImageView imagePeca = new ImageView(this);
                LinearLayout.LayoutParams imgParams = new LinearLayout.LayoutParams((int) (150 * scale), LinearLayout.LayoutParams.WRAP_CONTENT);
                imagePeca.setLayoutParams(imgParams);
                 imagePeca.setImageResource(getResources().getIdentifier("img_".concat(String.valueOf(p.getId())), "drawable", getPackageName()));

                TextView textSeparator = new TextView(this);
                RelativeLayout.LayoutParams separatorParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, 2);
                separatorParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                textSeparator.setLayoutParams(separatorParams);

                relImage.addView(imagePeca);
                relImage.addView(textSeparator);

                RelativeLayout relBuy = new RelativeLayout(this);
                RelativeLayout.LayoutParams relBuyParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
                relBuy.setLayoutParams(relBuyParams);

                TextView txtPreco = new TextView(this);
                txtPreco.setId(p.getId());
                RelativeLayout.LayoutParams txtPrecoParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                txtPrecoParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                txtPrecoParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                txtPreco.setGravity(Gravity.CENTER_VERTICAL);
                txtPreco.setLayoutParams(txtPrecoParams);
                txtPreco.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Medium);
                txtPreco.setText("R$ ".concat(String.valueOf(precision.format(p.getPreco()))));


                ImageView imageCart = new ImageView(this);
                RelativeLayout.LayoutParams cartParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                cartParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
                cartParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
                cartParams.addRule(RelativeLayout.START_OF, p.getId());
                imageCart.setLayoutParams(cartParams);
                imageCart.setImageResource(R.drawable.cart);
                imageCart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(p.getLink());
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(p.getLink())));
                        startActivity(intent);
                    }
                });
                //endregion

                relBuy.addView(txtPreco);
                relBuy.addView(imageCart);

                // Adds the view to the layout
                grd.addView(relImage);
                grd.addView(relBuy);
                innerLinear.addView(grd);

                if (isFirst) {
                    lastHsvId = currentHsvId;
                    isFirst = false;
                }
            }

            horizontal.addView(innerLinear);
            relMaster.addView(horizontal);
            relMaster.addView(hImage);

        }
    }

    //remover as views criadas dinamicamente;
    private void layoutCleaner(){
        LinearLayout layoutParent = (LinearLayout)findViewById(R.id.innerLayFlat);
        layoutParent.removeAllViews();
        mapPecaQuantity = new HashMap<>();
    }

    public void showUrlBrowser(View view, String url){
        Uri uri = Uri.parse(url);
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

            horizontalScrollView.smoothScrollTo(layouts.get(currPosition).getLeft(), 0);
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

//TODO Cor do datapciker
//TODO cor da segunda parte
//TODO Cor do title
