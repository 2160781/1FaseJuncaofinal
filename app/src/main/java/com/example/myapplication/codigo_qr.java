package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import javax.xml.transform.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler;

public class codigo_qr extends AppCompatActivity {
private ZXingScannerView nScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_qr);



  }

   /* //metodo dos botoes
    public void anterior( View view)  {

        Intent anterior=new Intent(this,MainActivity.class);
        startActivity(anterior);

}
    //metodo dos botoes


    public void  escanear( View view)  {

        nScannerView=new ZXingScannerView( this );
        setContentView( nScannerView );
        nScannerView.setResultHandler( this );
        nScannerView.startCamera();



        }



    @Override
    public void handleResult(com.google.zxing.Result result) {


        Log.v("ResultHandler",result.getText());
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle( "Resultado del scan" );
        builder.setMessage( result.getText() );
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        //nScannerView.resumeCameraPreview( this );



*/


   // }


    @Override
    public boolean dispatchKeyEvent( KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    Intent siguiente = new Intent(this,letor_QR_Code.class);
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
            case KeyEvent.KEYCODE_VOLUME_MUTE:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    Intent escanear = new Intent(this,View.class);
                    startActivity(escanear);

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