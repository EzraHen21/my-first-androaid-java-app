package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    String organ1;
    String organ2;
    String choosen_func;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.textView1);
        organ1="";
        organ2="";
        choosen_func="";

    }

    public void funcButton(View view) {
        Button b= (Button) view;
        if(result.equals(""))
            result.setText(b.getText().toString());
        else {
            result.append(b.getText());
        }

    }

    public void C_function(View view) {
        organ1="";
        organ2="";
        choosen_func="";
        result.setText("");

    }

    public void Plus_function(View view) {
        organ1=result.getText().toString();
        choosen_func="+";
        result.setText("");

    }

    public void Minus_function(View view) {
        organ1=result.getText().toString();
        choosen_func="-";
        result.setText("");

    }

    public void divide_function(View view) {
        organ1=result.getText().toString();
        choosen_func="/";
        result.setText("");

    }

    public void multi_function(View view) {
        organ1=result.getText().toString();
        choosen_func="*";
        result.setText("");

    }

    public void Equal_Func(View view) {
        Double Org1,Org2;
        Double res;
        String myRes;
        organ2=result.getText().toString();
        Org1=Double.parseDouble(organ1);
        Org2=Double.parseDouble(organ2);
        switch (choosen_func){
            case "+":
                res=Org1+Org2;
                myRes=res.toString();
                result.setText(myRes);
                choosen_func="";
                break;
            case "-":
                res=Org1-Org2;
                myRes=res.toString();
                result.setText(myRes);
                choosen_func="";
                break;
            case "*":
                res=Org1*Org2;
                myRes=res.toString();
                result.setText(myRes);
                choosen_func="";
                break;
            case "/":
                res=Org1/Org2;
                myRes=res.toString();
                result.setText(myRes);
                choosen_func="";
                break;
        }







    }



}