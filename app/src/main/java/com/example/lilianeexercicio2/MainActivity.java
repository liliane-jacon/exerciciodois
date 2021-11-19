package com.example.lilianeexercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bttela2,bttoast;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttela2 = findViewById(R.id.bttela2);
        bttoast = findViewById(R.id.btToast);
        bttoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Liliane Jacon",Toast.LENGTH_LONG).show();
            }
        });
        bttela2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                it = new Intent(getBaseContext(), Tela2.class);
                startActivity(it);
            }
        });
    }

}