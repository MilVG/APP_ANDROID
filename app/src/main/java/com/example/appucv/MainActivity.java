package com.example.appucv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String APP_UCV_LOG ="APP_UCV_MAIN";

    private EditText txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_create));
        txtNombre = findViewById(R.id.txt_main_nombre);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_star));
    }

    public void saludar(View view){
        Toast.makeText(this, "Hola"+txtNombre.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("APP_UCV_LOG","onPause");
        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_pause));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_resume));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_restart));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_stop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(APP_UCV_LOG,getResources().getString(R.string.app_on_destroy));
    }
}