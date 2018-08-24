package com.example.estudiante.renjifo_gil_quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InicioDeSesion extends AppCompatActivity {


    private Button btn_cerrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuenta);

        Intent solicitud = getIntent();


        btn_cerrar=findViewById(R.id.btn_cerrar);


        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cerrar=new Intent(getApplicationContext(),MainActivity.class);

                startActivityForResult(cerrar,Cons.EXIT);
            }
        });

    }
}