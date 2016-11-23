package com.lgcs.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v){
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }

    public void goBeach(View v){
        Intent i = new Intent(this,MapsActivityPlaya.class);
        startActivity(i);
    }

    public void goPier(View v){
        Intent i = new Intent(this,MapsActivityMal.class);
        startActivity(i);
    }

    public void goWhale(View v){
        Intent i = new Intent(this,MapsActivityWhale.class);
        startActivity(i);
    }

    public void goChurch(View v){
        Intent i = new Intent(this,MapsActivityChurch.class);
        startActivity(i);
    }
}
