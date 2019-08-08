package com.example.hendrokom_v31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_universitas = "universitas";
    public static final String EXTRA_jurusan = "jurusan";
    public static final String EXTRA_email = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String univ = getIntent().getStringExtra(EXTRA_universitas);
        String juru = getIntent().getStringExtra(EXTRA_jurusan);
        String mail = getIntent().getStringExtra(EXTRA_email);
        String text = "Name : " + name + ",\nUniversitas : " + univ + ",\nJurusan : " + juru + ",\nEmail : " +mail;
        tvDataReceived.setText(text);

    }
}
