package ro.pub.cs.systems.eim.practicaltest01var08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PracticalTest01Var08SecondaryActivity extends AppCompatActivity {

    TextView textView11, textView12, textView21, textView22;
    Button sumButton = null;
    Button productButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_secondary);

        int number11;
        int number12;
        int number21;
        int number22;


        textView11 = (TextView) findViewById(R.id.textView11);
        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("number11")) {
            number11 = intent.getIntExtra("number11", -1);
            textView11.setText(String.valueOf(number11));
        }

        textView12 = (TextView) findViewById(R.id.textView12);
        if (intent != null && intent.getExtras().containsKey("number12")) {
            number12 = intent.getIntExtra("number12", -1);
            textView12.setText(String.valueOf(number12));
        }
        textView21 = (TextView) findViewById(R.id.textView21);
        if (intent != null && intent.getExtras().containsKey("number21")) {
            number21 = intent.getIntExtra("number21", -1);
            textView21.setText(String.valueOf(number21));
        }
        textView22 = (TextView) findViewById(R.id.textView22);
        if (intent != null && intent.getExtras().containsKey("number22")) {
            number22 = intent.getIntExtra("number22", -1);
            textView22.setText(String.valueOf(number22));
        }

        sumButton = (Button) findViewById(R.id.button_sum);
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number11 = Integer.parseInt(textView11.getText().toString());
                int number12 = Integer.parseInt(textView12.getText().toString());
                int number21 = Integer.parseInt(textView21.getText().toString());
                int number22 = Integer.parseInt(textView22.getText().toString());
                int sum = number11 + number12 + number21 + number22;
                Toast.makeText(PracticalTest01Var08SecondaryActivity.this, "The sum of numbers is " + sum, Toast.LENGTH_LONG).show();
            }
        });

        productButton = (Button) findViewById(R.id.button_product);
        productButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number11 = Integer.parseInt(textView11.getText().toString());
                int number12 = Integer.parseInt(textView12.getText().toString());
                int number21 = Integer.parseInt(textView21.getText().toString());
                int number22 = Integer.parseInt(textView22.getText().toString());
                int product = number11 * number12 * number21 * number22;
                Toast.makeText(PracticalTest01Var08SecondaryActivity.this, "The product of numbers is " + product, Toast.LENGTH_LONG).show();
            }
        });
    }
}
