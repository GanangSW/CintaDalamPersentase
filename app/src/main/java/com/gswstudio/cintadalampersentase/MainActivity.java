package com.gswstudio.cintadalampersentase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void hasil(View view) {
        AppCompatEditText laki = findViewById(R.id.edittext_nama_laki);
        AppCompatEditText perempuan = findViewById(R.id.edittext_nama_perempuan);
        TextView hasil = findViewById(R.id.textview_hasil);
        TextView label = findViewById(R.id.textview_label);
        String l = laki.getText().toString();
        String p = perempuan.getText().toString();
        String sum = l + p;
        sum = sum.toLowerCase();
        int value = sum.hashCode();

        Random random = new Random(value);
        String result = (random.nextInt(100) + 1) + "%";
        if (l.equals("") || p.equals("")) {
            Toast.makeText(this, "Masukkan Nama", Toast.LENGTH_SHORT).show();
            label.setVisibility(View.GONE);
            hasil.setVisibility(View.GONE);
        } else {
            hasil.setText(result);
            label.setVisibility(View.VISIBLE);
            hasil.setVisibility(View.VISIBLE);
        }
        label.setText("Persentase kecocokan " + l + " dan " + p + " adalah :");
    }
}
