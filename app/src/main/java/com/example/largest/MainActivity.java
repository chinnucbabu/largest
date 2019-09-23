package com.example.largest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3;
    Button btn, btnn;
    String getNum1, getNum2, getNum3, res, result;
    int num1,num2, num3, largest, smallest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);
        ed3=(EditText)findViewById(R.id.num3);

        btn=(Button)findViewById(R.id.but);
        btnn=(Button)findViewById(R.id.butt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getNum1= ed1.getText().toString();
                getNum2=ed2.getText().toString();
                getNum3=ed3.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                num3=Integer.parseInt(getNum3);

                if(num1>num2)
                {
                    if(num1>num3)
                    {
                        largest=num1;

                    }
                    else
                    {
                        largest=num3;

                    }
                }
                else {
                    if (num2>num3)
                    {
                        largest=num2;
                    }
                    else
                    {
                        largest=num3;
                    }
                }

                res=String.valueOf(largest);
                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
            }
        });

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getNum1= ed1.getText().toString();
                getNum2=ed2.getText().toString();
                getNum3=ed3.getText().toString();


                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                num3=Integer.parseInt(getNum3);

                if(num1<num2)
                {
                    if(num1<num3)
                    {
                        smallest=num1;
                    }
                    else
                    {
                        smallest=num3;
                    }
                }
                else
                    {
                        if (num2<num3)
                        {
                            smallest=num2;
                        }
                        else
                        {
                            smallest=num3;
                        }

                }

                result=String.valueOf(smallest);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
