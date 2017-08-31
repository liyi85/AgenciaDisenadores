package com.example.andrearodriguez.agenciadisenadores;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("Actividad1", "IncioActividad1");
        super.onStart();
    }


    @Override
    protected void onResume() {
        Log.i("Actividad1", "ResumenActividad1");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i("Actividad1", "StopActividad1");
        super.onStop();
    }

    public void recuperarDatos (View view){

        Snackbar snackbar = Snackbar.make(view, "Debes recuperar tus datos", Snackbar.LENGTH_LONG)
                .setAction("RECUPERAR", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Las instrucciones de recuperación de cuenta fueron enviados a su e-mail", Toast.LENGTH_LONG).show();
                    }
                });
        snackbar.setActionTextColor(Color.CYAN);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(Color.rgb(126, 37,158));
        snackbar.show();
    }

    public void iniciarSesion (View view){

        EditText nombre = (EditText) findViewById(R.id.input_usuario);
        EditText contrasena = (EditText) findViewById(R.id.input_contrasena);

        String name = nombre.getText().toString();
        String password = contrasena.getText().toString();

        if (name.isEmpty() || password.isEmpty()){
            Toast.makeText(MainActivity.this, "Debes ingresar ambos datos de usuario", Toast.LENGTH_LONG).show();
        }else {
            Intent intent = new Intent(MainActivity.this, Galeria.class);
            startActivity(intent);
        }
    }
}
