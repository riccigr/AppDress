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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalendar = (ImageButton) findViewById(R.id.btnCalendar);
       // btnCalendar.setOnClickListener(this);

       // daySpinner  = (Spinner) findViewById(R.id.daySpinner);
//        ArrayAdapter<CharSequence> dayadapter = ArrayAdapter.createFromResource(this, R.array.item_day, android.R.layout.simple_spinner_item);
//        dayadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
//        daySpinner.setAdapter(dayadapter);

        //monthSpinner  = (Spinner) findViewById(R.id.monthSpinner);
//        ArrayAdapter<CharSequence> monthadapter = ArrayAdapter.createFromResource(this, R.array.item_month, android.R.layout.simple_spinner_item);
//        monthadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
//        monthSpinner.setAdapter(monthadapter);

        txtData = (TextView) findViewById(R.id.txtData);
        seekBar = (SeekBar) findViewById(R.id.periodoSeekBar);
        seekBarValue = (TextView) findViewById(R.id.seekBarValue);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf(progress+1));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

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
        spinnerDestino = (Spinner) findViewById(R.id.spinnerDestino);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, array_spinner);
        spinnerDestino.setAdapter(adapter);

    }


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

    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            String data = String.valueOf(dayOfMonth) + " / "  + String.valueOf(monthOfYear + 1) +  " / " + String.valueOf(year);
            txtData.setText(data);
        }
    };


    public void searchClothes(View view) {

        genereRadio = (RadioButton) findViewById(R.id.mascRadioButton);
        String genero = "";

        if(genereRadio.isChecked()){
            genero = "M";
        }else{
            genero = "F";
        }

        Intent intent = new Intent(this, IndicacaoActivity.class);
//        Intent intent = new Intent(this, teste.class);
        intent.putExtra("genero" ,genero);
        intent.putExtra("periodo" , seekBarValue.getText().toString());
//        intent.putExtra("dia", daySpinner.getSelectedItem().toString());
//        intent.putExtra("mes", monthSpinner.getSelectedItem().toString());
        intent.putExtra("destino", spinnerDestino.getSelectedItem().toString() );
        startActivity(intent);
    }


    public void showCalendar(View v) {
        showDialog(DATE_DIALOG_ID);
    }
}



