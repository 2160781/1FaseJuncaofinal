package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    //metodo boton SIGUIENTE 2

        //metodo dos botoes
        //public void Siguiente2(View view)  {

           // Intent ir_a_cod_Qr =new Intent(this,codigo_qr.class);
       // startActivity(ir_a_cod_Qr);
           @Override
           public boolean dispatchKeyEvent( KeyEvent event) {
               int action = event.getAction();
               int keyCode = event.getKeyCode();
               switch (keyCode) {
                   case KeyEvent.KEYCODE_VOLUME_UP:
                       if (action == KeyEvent.ACTION_DOWN) {
                           //TODO
                           Intent siguiente = new Intent(this,codigo_qr.class);
                           startActivity(siguiente);

                       }
                       return true;
                   case KeyEvent.KEYCODE_VOLUME_DOWN:
                       if (action == KeyEvent.ACTION_DOWN) {
                           //TODO

                           Intent anterior = new Intent(this, MainActivity.class);
                           startActivity(anterior);

                       }
                       return true;
                   default:
                       return super.dispatchKeyEvent(event);
               }
           }

   /*private void siguiente( Intent siguiente ) {

        startActivity( siguiente );

    }
    //private void anterior( Intent anterior ) {

       // startActivity( anterior );
    }

*/

    }
