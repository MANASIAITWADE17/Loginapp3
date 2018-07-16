package com.app.manasiaitwade.loginapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    TextView tv2;
    EditText et1;
    EditText et2;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv2=(TextView)findViewById(R.id.tv2);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("admin") && et2.getText().toString().equals("12345")){
                    Toast.makeText(getApplicationContext(),"LoginSucess",Toast.LENGTH_LONG);
                    Intent myintent=new Intent (Second.this,Third.class);
                    startActivity(myintent);

                }
                else{
                    Toast.makeText(getApplicationContext(),"ENTER VALID CREDENTIALS",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
