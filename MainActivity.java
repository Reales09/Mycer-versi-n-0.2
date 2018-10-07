package com.example.reales.mycer_concesionario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Button Btningresar;
    private EditText Et1;
    private EditText Et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //icono en el action bar

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
//***********************************************************
        Et1 = (EditText) findViewById(R.id.Et1);
        Et2 = (EditText) findViewById(R.id.Et2);
        Btningresar = (Button)findViewById(R.id.Btn1);

    }
    public void Onclick (View view){

        String valor1 = Et1.getText().toString();
        String valor2 = Et2.getText().toString();

        if ( valor1.isEmpty()) {
            Toast.makeText(this, "Te hace falta un dato", Toast.LENGTH_LONG).show();

        }
        else if (valor2.isEmpty()){

            Toast.makeText(this, "Te hace falta un dato", Toast.LENGTH_LONG).show();

        }else {

            Intent Menu1 = new Intent(this, MenuA.class);
            Menu1.putExtra("Usuario", Et1.getText().toString());
            startActivity(Menu1);
        }
    }
}
