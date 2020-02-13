package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnShowSegitiga (View view){
        Intent intent = new Intent(this,SegitigaActivity.class);
        startActivity(intent);
    }

    public void OnShowJajargenjang (View view){
        Intent intent = new Intent(this, JajargenjangActivity.class);
        startActivity(intent);
    }

    public void OnShowPersegi (View view){
        Intent intent = new Intent(this, PersegiActivity.class);
        startActivity(intent);
    }
}
