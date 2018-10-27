package com.uso.juego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    public void callJuego(View view) {
        Intent i = new Intent(this, NuevoJugador.class);
        startActivity(i);

    }

    public void iniciarJuego(View view) {
        Intent i = new Intent(this, IniciarJuego.class);
        startActivity(i);



    }

    public void puntaje(View view) {
        Intent i = new Intent(this, Puntajes.class);
        startActivity(i);

    }


}
