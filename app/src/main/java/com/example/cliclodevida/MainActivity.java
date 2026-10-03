package com.example.cliclodevida;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Carga la interfaz creada en el archivo XML
        setContentView(R.layout.activity_main);

        mostrarMensaje("onCreate(): Activity creada");
    

    @Override
    protected void onStart() {
        super.onStart();
        mostrarMensaje("onStart(): Activity a punto de ser visible");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mostrarMensaje("onResume(): Activity interactiva (primer plano)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mostrarMensaje("onPause(): Activity pausada");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mostrarMensaje("onStop(): Activity no visible");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mostrarMensaje("onRestart(): Activity reiniciándose");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mostrarMensaje("onDestroy(): Activity destruida");
    }

    private void mostrarMensaje(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}