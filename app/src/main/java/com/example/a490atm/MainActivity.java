package com.example.a490atm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText gpa;
    Button SendEditTextValue;
    Intent intent;

    int x =10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendEditTextValue = (Button)findViewById(R.id.button);
        Name = (EditText)findViewById(R.id.name);
        gpa = (EditText)findViewById(R.id.money);

        SendEditTextValue.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String b = gpa.getText().toString().trim();
                intent = new Intent(getApplicationContext(),display.class);
                intent.putExtra("value1", Name.getText().toString());
                intent.putExtra("value2", gpa.getText().toString());

                if (b.length() > 4){
                    gpa.setError("you'r balance is not enough");
                }else {
                    startActivity(intent);
                }

            }
        });
    }
}