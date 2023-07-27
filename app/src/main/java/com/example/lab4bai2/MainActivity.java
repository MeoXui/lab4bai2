package com.example.lab4bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View frag1 = findViewById(R.id.frag1),
        frag2 = findViewById(R.id.frag2);
        TextView txtOutput = frag1.findViewById(R.id.txt_out);
        EditText edtInput = frag2.findViewById(R.id.edt_in);
        Button btnSend = frag2.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(v -> txtOutput.setText(edtInput.getText()));
    }
}