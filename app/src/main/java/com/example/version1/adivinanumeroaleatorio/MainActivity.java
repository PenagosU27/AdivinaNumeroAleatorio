package com.example.version1.adivinanumeroaleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText numero;
    private Button enviar;
    private TextView numaleatorio;
    private Button salir;
    private int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numero = findViewById(R.id.txtnumeroingresado);
        enviar = findViewById(R.id.btnenviar);
        numaleatorio = findViewById(R.id.txtresultado);
        salir = findViewById(R.id.btnsalir);

        enviar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                total = (int)(Math.random()*100) + 1;
                numaleatorio.setText(String.valueOf(total));

                if(numero==numaleatorio){


                    Toast.makeText(MainActivity.this,"Usted ha ganado",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"Sigue intentando ",Toast.LENGTH_LONG).show();

                }


            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });







    }
}
