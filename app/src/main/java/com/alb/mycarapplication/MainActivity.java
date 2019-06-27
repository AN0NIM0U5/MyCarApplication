package com.alb.mycarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {



    Button btnDelete;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // DataCoche.init(getApplicationContext(R.layout.));

        final Adapter newAdaptador;

        newAdaptador = new Adapter (_coche());




        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                newAdaptador.ingresarDatos("1","2");

            }
        });
        //btnAdd = findViewById(R.id.btnAddXlm);//layaout fragment Colores






    }


    public List<MoldelCoche> _coche () {

        MoldelCoche MoldelCoche0 = new MoldelCoche();
        MoldelCoche MoldelCoche1= new MoldelCoche();
        MoldelCoche MoldelCoche2 = new MoldelCoche();
        MoldelCoche MoldelCoche3 = new MoldelCoche();
        MoldelCoche MoldelCoche4 = new MoldelCoche();


        MoldelCoche0.set_nombre_coche("L");
        MoldelCoche1.set_nombre_coche("A");
        MoldelCoche2.set_nombre_coche("M");
        MoldelCoche3.set_nombre_coche("B");
        MoldelCoche4.set_nombre_coche("J");

        MoldelCoche0.set_color("AZUL");
        MoldelCoche0.getColor();
        MoldelCoche0.getColor();
        MoldelCoche0.getColor();
        MoldelCoche0.getColor();



        List<MoldelCoche> arrayCoche = new ArrayList<>();
        arrayCoche.add(MoldelCoche0);
        arrayCoche.add(MoldelCoche1);
        arrayCoche.add(MoldelCoche2);
        return arrayCoche;
    }


}
