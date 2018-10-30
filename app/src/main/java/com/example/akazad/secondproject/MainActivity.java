package com.example.akazad.secondproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private  TextView textView;
  private EditText editText1, editText2;
  private Button addButton, subButton, one, two, three, plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    editText1= (EditText) findViewById(R.id.edittext1Id);
    editText2= (EditText) findViewById(R.id.edittext2Id);
    textView=(TextView) findViewById(R.id.textId);
    addButton= (Button)findViewById(R.id.addId);
    subButton= (Button)findViewById(R.id.subId);
    one= (Button)findViewById(R.id.oneId);
    two= (Button)findViewById(R.id.twoId);
    three= (Button)findViewById(R.id.threeId);
    plus= (Button)findViewById(R.id.plusId);

    addButton.setOnClickListener(this);
    subButton.setOnClickListener(this);
    one.setOnClickListener(this);
    two.setOnClickListener(this);
    three.setOnClickListener(this);
    plus.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
     /* String number1=editText1.getText().toString();
       String number2=editText2.getText().toString();
       //convert into double
        double num1=Double.parseDouble(number1);
        double num2=Double.parseDouble(number2);
        if(v.getId()==R.id.addId){
            double sum=num1+num2;
            textView.setText("Result: "+sum);
        }else if(v.getId()==R.id.subId){
            double sub=num1-num2;
            textView.setText("Resut is: "+sub);
        }
*/
        if(v.getId()==R.id.oneId){
            editText1.setText("1");
        }
        else if(v.getId()==R.id.twoId){
            editText1.setText("2");
        }
        else{
            editText1.setText("3");
        }
    }
}
