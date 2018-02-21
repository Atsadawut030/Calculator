package sdu.cs58.atsadawut.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Number1EditText,Number2EditText;
    Button AddButton,MinusButton,MultiplyButton,DivideButton;
    TextView ResultTextView;
    int num1,num2,result  ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1EditText = findViewById(R.id.etdNumber1); //ผูกตัวแปรบน java ให้รู้จัก element บน xml
        Number2EditText = findViewById(R.id.edtNumber2); //ผูกตัวแปรบน java ให้รู้จัก element บน xml
        AddButton = findViewById(R.id.btnAdd); //ผูกตัวแปรบน java ให้รู้จัก element บน xml
        MinusButton = findViewById(R.id.btnMinus); //ผูกตัวแปรบน java ให้รู้จัก element บน xml
        MultiplyButton = findViewById(R.id.btnMultiply); //ผูกตัวแปรบน java ให้รู้จัก element บน xml
        DivideButton = findViewById(R.id.btnDivide); //ผูกตัวแปรบน java ให้รู้จัก element บน xml
        ResultTextView = findViewById(R.id.txvResult); //ผูกตัวแปรบน java ให้รู้จัก element บน xml

        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิท int
                num1 = Integer.parseInt(Number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(Number2EditText.getText().toString().trim());
                result = num1 + num2 ;

                ResultTextView.setText(result+"");

            }

        });
        MinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิท int
                num1 = Integer.parseInt(Number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(Number2EditText.getText().toString().trim());
                result = num1 - num2 ;

                ResultTextView.setText(result+"");

            }

        });
        MultiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิท int
                num1 = Integer.parseInt(Number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(Number2EditText.getText().toString().trim());
                result = num1 * num2 ;

                ResultTextView.setText(result+"");

            }

        });
        DivideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิท int
                num1 = Integer.parseInt(Number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(Number2EditText.getText().toString().trim());
                result = num1 / num2 ;

                ResultTextView.setText(result+"");

            }

        });
    } //end Method onCreate
} //end Clasas
