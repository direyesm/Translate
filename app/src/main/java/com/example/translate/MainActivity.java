package com.example.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }


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
        Timber.d("onStart");
    }
}


