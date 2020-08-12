package com.example.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.prathameshmore.toastylibrary.Toasty;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {


    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toasty toasty = new Toasty(MainActivity.this);
        Button boton = findViewById(R.id.btnToasty);

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        message =  getResources().getString(R.string.texto);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasty.darkToasty(v.getContext(), message, Toasty.LENGTH_LONG, Toasty.BOTTOM);
            }

        });

        }


    protected void onStart () {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
}


