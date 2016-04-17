package com.example.guilherme.demoappdress;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //region #VARIAVEIS#
    public Spinner daySpinner;
    public Spinner monthSpinner;
    public SeekBar seekBar;
    public TextView seekBarValue;
    public TextView txtData;
    public Button searchButton;
    public RadioButton genereRadio;
    public Spinner spinnerDestino;
    private String array_spinner[];
    private ImageButton btnCalendar;
    static final int DATE_DIALOG_ID = 0;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalendar = (ImageButton) findViewById(R.id.btnCalendar);
        txtData = (TextView) findViewById(R.id.txtData);
        seekBar = (SeekBar) findViewById(R.id.periodoSeekBar);
        seekBarValue = (TextView) findViewById(R.id.seekBarValue);
        spinnerDestino = (Spinner) findViewById(R.id.spinnerDestino);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarValue.setText(String.valueOf(progress+1));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        //region #COMBO TOP CIDADES#
        array_spinner=new String[11];
        array_spinner[0]="Selecione...";
        array_spinner[1]="Porto Seguro";
        array_spinner[2]="Maceio";
        array_spinner[3]="Fortaleza";
        array_spinner[4]="Natal";
        array_spinner[5]="Gramado";
        array_spinner[6]="Orlando";
        array_spinner[7]="Nova York";
        array_spinner[8]="Las Vegas";
        array_spinner[9]="Buenos Aires";
        array_spinner[10]="Paris";
        //endregion


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, array_spinner);
        spinnerDestino.setAdapter(adapter);

    }


    //region #METODOS PARA O CALENDAR#
    @Override
    protected Dialog onCreateDialog(int id) {
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        switch (id) {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this, mDateSetListener, ano, mes, dia);
        }
        return null;
    }

    //Entregando a data no formato br
    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            String data = String.valueOf(dayOfMonth) + " / "  + String.valueOf(monthOfYear + 1) +  " / " + String.valueOf(year);
            txtData.setText(data);
        }
    };

    public void showCalendar(View v) {
        showDialog(DATE_DIALOG_ID);
    }
    //endregion

    //botao principal
    public void searchClothes(View view) {

        genereRadio = (RadioButton) findViewById(R.id.mascRadioButton);
        String genero = "";

        if(genereRadio.isChecked()){
            genero = "M";
        }else{
            genero = "F";
        }

        Intent intent = new Intent(this, IndicacaoActivity.class);
        intent.putExtra("GENERO" ,genero);
        intent.putExtra("PERIODO" , seekBarValue.getText().toString());
        intent.putExtra("DESTINO", spinnerDestino.getSelectedItem().toString() );
        intent.putExtra("ID_DESTINO", spinnerDestino.getSelectedItemId() );
        intent.putExtra("DATA", txtData.toString() );
        intent.putExtra("MES", txtData.toString() );
        intent.putExtra("DIA", txtData.toString() );
        intent.putExtra("ANO", txtData.toString() );

        startActivity(intent);
    }



}



