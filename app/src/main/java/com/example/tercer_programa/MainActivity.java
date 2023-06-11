package com.example.tercer_programa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  EditText num1, num2;
    private TextView res;
    private RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.n1);
        num2=(EditText)findViewById(R.id.n2);
        res=(TextView) findViewById(R.id.r);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
    }
    public void Operar (View view){
        String v1= num1.getText().toString();
        String v2= num2.getText().toString();
        int nu1=Integer.parseInt(v1);
        int nu2=Integer.parseInt(v2);
        String resultado;
        if(r1.isChecked()==true){
            int suma=nu1+nu2;
             resultado=String.valueOf(suma);
            res.setText(resultado);
        }else{
            if(r2.isChecked()==true){
                int resta=nu1-nu2;
                resultado=String.valueOf(resta);
                res.setText(resultado);
            }
        }
    }
}