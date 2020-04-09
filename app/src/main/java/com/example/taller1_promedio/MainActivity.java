package com.example.taller1_promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText nota4;
    private TextView resultado;
    private Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1=(EditText)findViewById(R.id.txtnota1);
        nota2=(EditText)findViewById(R.id.txtnota2);
        nota3=(EditText)findViewById(R.id.txtnota3);
        nota4=(EditText)findViewById(R.id.txtnota4);
        calcular=(Button)findViewById(R.id.btncalcular);
        resultado=(TextView)findViewById(R.id.txtresultado);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double not1,not2, not3,not4,promedio;
                not1=Double.parseDouble(nota1.getText().toString());
                not2=Double.parseDouble(nota2.getText().toString());
                not3=Double.parseDouble(nota3.getText().toString());
                not4=Double.parseDouble(nota4.getText().toString());

                promedio = (not1+not2+not3+not4)/4;

                resultado.setText(String.valueOf(promedio));

                if(promedio>=3){
                    Toast.makeText(MainActivity.this,"Usted aprobo la Materia ",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Usted Reprobo la Materia  ",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
