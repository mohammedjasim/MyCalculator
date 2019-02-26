package com.example.mycalculator2number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText editText3,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);

}



    public void add(View d){
        Float N1=Float.parseFloat(editText2.getText().toString());
        Float N2=Float.parseFloat(editText3.getText().toString());
        Float button=N1+N2;
        Result =(TextView)findViewById(R.id.textView5);
        Result.setText(button+"");
    }
    public void Div(View d){
        Float N1=Float.parseFloat(editText2.getText().toString());
        Float N2=Float.parseFloat(editText3.getText().toString());
        Float button=N1/N2;
        Result=(TextView)findViewById(R.id.textView5);
        Result.setText(button+"");
    }
    public void Mult(View d){
        Float N1=Float.parseFloat(editText2.getText().toString());
        Float N2=Float.parseFloat(editText3.getText().toString());
        Float button=N1*N2;
        Result=(TextView)findViewById(R.id.textView5);
        Result.setText(button+"");

    }
    public void Sub(View d){
        Float N1=Float.parseFloat(editText2.getText().toString());
        Float N2=Float.parseFloat(editText3.getText().toString());
        Float button=N1-N2;
        Result=(TextView)findViewById(R.id.textView5);
        Result.setText(button+"");
    }
    public void claer(View C){
        editText2.setText("");
        editText3.setText("");
        Result.setText("");
    }
}
