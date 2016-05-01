package com.example.guilherme.demoappdress.Activities;

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
import android.widget.Toast;

import com.example.guilherme.demoappdress.R;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //region #VARIAVEIS#
    public Spinner daySpinner;
    public Spinner monthSpinner;
    public SeekBar seekBar;
    public TextView seekBarValue;
    public TextView txtDate;
    public Button searchButton;
    public RadioButton genreRadioMasc;
    public Spinner spinnerDestiny;
    private String arraySpinner[];
    private ImageButton btnCalendar;
    static final int DATE_DIALOG_ID = 0;
    public String txtMonth;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalendar = (ImageButton) findViewById(R.id.btnCalendar);
        txtDate = (TextView) findViewById(R.id.txtData);
        seekBar = (SeekBar) findViewById(R.id.periodoSeekBar);
        seekBarValue = (TextView) findViewById(R.id.seekBarValue);
        spinnerDestiny = (Spinner) findViewById(R.id.spinnerDestino);

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
        arraySpinner =new String[11];
        arraySpinner[0]="Selecione...";
        arraySpinner[1]="Porto Seguro";
        arraySpinner[2]="Maceio";
        arraySpinner[3]="Fortaleza";
        arraySpinner[4]="Natal";
        arraySpinner[5]="Gramado";
        arraySpinner[6]="Orlando";
        arraySpinner[7]="Nova York";
        arraySpinner[8]="Las Vegas";
        arraySpinner[9]="Buenos Aires";
        arraySpinner[10]="Paris";
        //endregion

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, arraySpinner);
        spinnerDestiny.setAdapter(adapter);

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
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, mDateSetListener, ano, mes, dia);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                return datePickerDialog;
        }
        return null;
    }

    //Entregando a data no formato br
    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            String data = String.valueOf(dayOfMonth) + " / "  + String.valueOf(monthOfYear + 1) +  " / " + String.valueOf(year);
            txtDate.setText(data);
            txtMonth = String.valueOf(monthOfYear +1);
        }
    };

    public void showCalendar(View v) {
        showDialog(DATE_DIALOG_ID);
    }
    //endregion

    //botao principal
    public void searchButton(View view) {

        genreRadioMasc = (RadioButton) findViewById(R.id.mascRadioButton);
        char genre = '0';

        if(genreRadioMasc.isChecked()){
            genre = 'M';
        }else{
            genre = 'F';
        }

//        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA GATO
        txtDate.setText("23/4/2016");
        txtMonth = "4";
        spinnerDestiny.setSelection(3);


        if(isValidActivity()){

            Intent intent = new Intent(this, IndicacaoActivity.class);
            intent.putExtra("GENERO", genre);
            intent.putExtra("PERIODO", seekBarValue.getText().toString());
            intent.putExtra("DESTINO", spinnerDestiny.getSelectedItem().toString());
            intent.putExtra("ID_DESTINO", spinnerDestiny.getSelectedItemId());
            intent.putExtra("DATA_TEXTO", txtDate.toString());
            intent.putExtra("MES", txtMonth.toString());

            startActivity(intent);
        }
    }

    private boolean isValidActivity(){

        boolean valid = true;

        if(txtDate.getText() == null || txtDate.getText().equals("")){
            Toast.makeText(MainActivity.this, "Quando vai viajar?", Toast.LENGTH_SHORT).show();
           return false;
        }

        if(spinnerDestiny.getSelectedItem() == null || spinnerDestiny.getSelectedItem().toString().equals("Selecione...") || spinnerDestiny.getSelectedItem().toString().equals("") ){
            Toast.makeText(MainActivity.this, "Qual o seu destino?", Toast.LENGTH_SHORT).show();
            return false;
        }

        return valid;
    }





}



