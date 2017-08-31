package com.example.andrearodriguez.agenciadisenadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
    }

    @Override
    protected void onStart() {
        Log.i("Actividad2", "IncioActividad2");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Actividad2", "ResumenActividad2");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i("Actividad2", "StopActividad2");
        super.onStop();
    }
}
