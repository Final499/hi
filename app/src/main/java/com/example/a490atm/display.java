package com.example.a490atm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class display extends AppCompatActivity {
    TextView receive;
    String st1;
    String st2;
    Button back;
    int x ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        receive = (TextView)findViewById(R.id.textView);

        st1 = getIntent().getExtras().getString("value1");
        st2 = getIntent().getExtras().getString("value2");
        int ToNumber = Integer.parseInt(st2);
        x=10000-ToNumber;



        receive.setText(st1+" you have "+x+" left");



        back = (Button) findViewById(R.id.button2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(display.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}