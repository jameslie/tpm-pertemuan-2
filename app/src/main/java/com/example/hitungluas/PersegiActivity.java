package com.example.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PersegiActivity extends AppCompatActivity {
    private TextView tv_hasil;
    private EditText sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
    }

    public void OnShowPersegi(View view){
        try {
            tv_hasil = findViewById(R.id.tv_hasil);
            sisi = findViewById(R.id.et_sisi);

            float sumpersegi = Float.parseFloat(String.valueOf(sisi.getText())) * Float.parseFloat(String.valueOf(sisi.getText()));

            tv_hasil.setText(String.valueOf(sumpersegi));

        }catch(NumberFormatException nfe){
            Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }
    }
}
