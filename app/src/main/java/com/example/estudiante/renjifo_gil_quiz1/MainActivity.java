package com.example.estudiante.renjifo_gil_quiz1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_ingresar;
    private EditText et_usuario;
    private EditText et_contra;

    private TextView tv_estado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ingresar=findViewById(R.id.btn_ingresar);
        et_usuario=findViewById(R.id.et_usuario);
        et_contra=findViewById(R.id.et_contra);
        tv_estado=findViewById(R.id.tv_estado);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent entrar=new Intent(getApplicationContext(),InicioDeSesion.class);

            String usuario = et_usuario.getText().toString();
            String contra = et_contra.getText().toString();
                entrar.putExtra("usuario", usuario );
                entrar.putExtra("contra",contra);


                if(usuario.equals("Administrador") &&  contra.equals("123456")) {

                    startActivityForResult(entrar, Cons.USER);


                } else {
                    tv_estado.setText("El usuario o la contraseña no es correcto");
                }

            }
        });





    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
