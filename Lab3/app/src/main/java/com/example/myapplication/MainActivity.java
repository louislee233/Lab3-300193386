package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private TextView resultTextView ;
    private Button btnPlus, btnMinus, btnEqual;
    private Button btnDivide, btnMulti, btnClear;
    private String operator;
    private int leftOperand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initViews();
        btn1.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("1");
            }else{
                resultTextView.setText(text+"1");
            }
        });
        btn2.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("2");
            }else{
                resultTextView.setText(text+"2");
            }
        });
        btn3.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("3");
            }else{
                resultTextView.setText(text+"3");
            }
        });
        btn4.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("4");
            }else{
                resultTextView.setText(text+"4");
            }
        });
        btn5.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("5");
            }else{
                resultTextView.setText(text+"5");
            }
        });
        btn6.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("6");
            }else{
                resultTextView.setText(text+"6");
            }
        });
        btn7.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("7");
            }else{
                resultTextView.setText(text+"7");
            }
        });
        btn8.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("8");
            }else{
                resultTextView.setText(text+"9");
            }
        });
        btn9.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("9");
            }else{
                resultTextView.setText(text+"9");
            }
        });
        btn0.setOnClickListener(view -> {
            String text=resultTextView.getText().toString();
            if (text.equals("0")){
                resultTextView.setText("0");
            }else{
                resultTextView.setText(text+"0");
            }
        });
        btnPlus.setOnClickListener(view -> {
            operator="+";
            leftOperand=Integer.parseInt(resultTextView.getText().toString());
            resultTextView.setText("0");
        });
        btnEqual.setOnClickListener(view -> {
            int result;
            if (operator.equals("+")){
                result=leftOperand + Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(Integer.toString(result));
            }else if(operator.equals("-")){
                result=leftOperand - Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(Integer.toString(result));
            } else if(operator.equals("/")){
                result=leftOperand / Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(Integer.toString(result));
            } else if(operator.equals("*")){
                result=leftOperand * Integer.parseInt(resultTextView.getText().toString());
                resultTextView.setText(Integer.toString(result));
            }
        });
        btnMinus.setOnClickListener(view -> {
            operator="-";
            leftOperand=Integer.parseInt(resultTextView.getText().toString());
            resultTextView.setText("0");
        });
        btnDivide.setOnClickListener(view -> {
            operator="/";
            leftOperand=Integer.parseInt(resultTextView.getText().toString());
            resultTextView.setText("0");
        });
        btnClear.setOnClickListener(view -> {
            resultTextView.setText("0");
        });




    }
    private void initViews(){
        resultTextView=findViewById(R.id.resultTextView);
        btn1=findViewById(R.id.number1);
        btn2=findViewById(R.id.number2);
        btn3=findViewById(R.id.number3);
        btn4=findViewById(R.id.number4);
        btn5=findViewById(R.id.number5);
        btn6=findViewById(R.id.number6);
        btn7=findViewById(R.id.number7);
        btn8=findViewById(R.id.number8);
        btn9=findViewById(R.id.number9);
        btn0=findViewById(R.id.number0);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnEqual=findViewById(R.id.btnEqual);
        btnDivide=findViewById(R.id.btnDivide);
        btnMulti=findViewById(R.id.btnMulti);
        btnClear=findViewById(R.id.btnClear);

    }
}