package com.borjalapa.orientaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ponemos el mismo id para los dos campos de texto (el de landscape y el de portrait)

    @Override
    protected void onResume() {
        super.onResume();

        //recogemos y identificamos los campos para cambiarle el texto a todos a la vez
        TextView tv = (TextView)findViewById(R.id.tvTexto);
        //tv.setText("Texto Nuevo");

        //esto es para cambiar el texto depende de su orientacion
        //devuelve un entero con el valor de horizontal o vertical
        int orientation = getResources().getConfiguration().orientation;
            if (orientation == Configuration.ORIENTATION_LANDSCAPE){
                tv.setText("Estoy acostado");
            } else {
                tv.setText("Estoy normal");
            }
    }
}