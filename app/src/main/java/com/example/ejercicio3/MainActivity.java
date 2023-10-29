package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;

import android.widget.*;

public class MainActivity extends AppCompatActivity {
    RadioGroup miRadioGroup;
    ImageView fotoNublado;
    ImageView fotoLluvia;
    ImageView fotoSoleado;
    ImageView fotoNieve;
    CheckBox limpiar;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miRadioGroup=findViewById(R.id.radioGroup1);
        fotoNublado=findViewById(R.id.nublado);
        fotoLluvia=findViewById(R.id.lluvia);
        fotoSoleado=findViewById(R.id.soleado);
        fotoNieve=findViewById(R.id.nieve);
        limpiar=findViewById(R.id.limpiar);

        miRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int chekedld) {

                fotoNublado.setVisibility(View.GONE);
                fotoNieve.setVisibility(View.GONE);
                fotoSoleado.setVisibility(View.GONE);
                fotoLluvia.setVisibility(View.GONE);

                if(chekedld==R.id.opcion1){
                    fotoNublado.setVisibility(View.VISIBLE);
                    fotoNublado.setImageResource(R.drawable.nublado);
                } else if (chekedld==R.id.opcion2) {
                    fotoLluvia.setVisibility(View.VISIBLE);
                    fotoLluvia.setImageResource(R.drawable.lluvia);
                } else if (chekedld == R.id.opcion3) {
                    fotoSoleado.setVisibility(View.VISIBLE);
                    fotoSoleado.setImageResource(R.drawable.soleado);
                } else if (chekedld == R.id.opcion4) {
                    fotoNieve.setVisibility(View.VISIBLE);
                    fotoNieve.setImageResource(R.drawable.nieve);
                }
            }
        });
        limpiar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(limpiar.isChecked()== true){
                    miRadioGroup.clearCheck();
                    limpiar.toggle();
                }else {

                }
            }
        });
    }
}