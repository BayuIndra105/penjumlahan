package com.example.bayuindra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView hasil;
    Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.angka1);
        num2 = (EditText) findViewById(R.id.angka2);
        hasil = (TextView) findViewById(R.id.hasil);
        tombol = (Button) findViewById(R.id.button);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bil1 = Integer.parseInt(num1.getText().toString());
                int bil2 = Integer.parseInt(num2.getText().toString());
                int jumlah = bil1 + bil2;
                hasil.setText(""+jumlah);
            }
        });
    }
}
