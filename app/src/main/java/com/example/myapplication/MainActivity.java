package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult;
        EditText edtweight,edtHeightFT,edtHeightIN;
        Button btmcalculate;
        LinearLayout llMain;

        edtweight = findViewById(R.id.edtweight);
        edtHeightFT = findViewById(R.id.edtHeightFT);
        edtHeightIN = findViewById(R.id.edtHeightIN);
        btmcalculate = findViewById(R.id.btmcalculate);
        txtResult = findViewById(R.id.Result);
       

        btmcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int wt =  Integer.parseInt(edtweight.getText().toString()) ;
                int ft =  Integer.parseInt(edtHeightFT.getText().toString()) ;
                int in =  Integer.parseInt(edtHeightIN.getText().toString()) ;

                int totalIN = ft*12 +in;

                double totalcm = totalIN *2.53;

                double totalm = totalcm/100;
                double BMI = wt/(totalm*totalm);

                if (BMI>25)
                {
                    txtResult.setText("you are OverWeight");

                }
                else if (BMI<18)
                {
                    txtResult.setText("you are OverWeight");

                }
                else {
                    txtResult.setText("you are healthy");
                }

            }
        });


    }
}