package com.example.hendrokom_v31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveHendro = findViewById(R.id.btn_move_hendrokom);
        btnMoveHendro.setOnClickListener(this);

        Button btnMoveAbout = findViewById(R.id.btn_move_about);
        btnMoveAbout.setOnClickListener(this);

    }
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_move_hendrokom:
                    Intent moveIntent = new Intent(MainActivity.this, HendroKomputer.class);
                    startActivity(moveIntent);
                    break;
                case R.id.btn_move_about:
                    Intent moveWithDataIntent = new Intent(MainActivity.this, AboutMe.class);
                    moveWithDataIntent.putExtra(AboutMe.EXTRA_NAME, "M. Hendro Junawarko");
                    moveWithDataIntent.putExtra(AboutMe.EXTRA_universitas, "Universitas Teknokrat Indonesia");
                    moveWithDataIntent.putExtra(AboutMe.EXTRA_jurusan, "Informatika");
                    moveWithDataIntent.putExtra(AboutMe.EXTRA_email, "muhammadhendro88@gmail.com");

                    startActivity(moveWithDataIntent);
                    break;
            }
        }
    }

