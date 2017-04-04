package ro.pub.cs.systems.eim.practicaltest01var08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var08MainActivity extends AppCompatActivity {

    private static final int SECONDARY_ACTIVITY_REQUEST_CODE = 1;
    Button setButton;
    EditText editText11, editText12, editText21, editText22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_main);

        editText11 = (EditText) findViewById(R.id.editText11);
        editText12 = (EditText) findViewById(R.id.editText12);
        editText21 = (EditText) findViewById(R.id.editText21);
        editText22 = (EditText) findViewById(R.id.editText22);


        setButton = (Button) findViewById(R.id.button_set);
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ok = 1, number11 = 0;
                int number12 = 0;
                int number21 = 0;
                int number22 = 0;
                switch(v.getId()) {
                    case R.id.editText11:
                        String text11 = editText11.getText().toString();
                        try
                        {
                            number11 = Integer.parseInt(text11);
                        } catch (NumberFormatException e) {
                            ok = 0;
                        }
                        break;
                    case R.id.editText12:
                        String text12 = editText12.getText().toString();
                        try
                        {
                            number12 = Integer.parseInt(text12);
                        } catch (NumberFormatException e) {
                            ok = 0;
                        }
                        break;
                    case R.id.editText21:
                        String text21 = editText21.getText().toString();
                        try
                        {
                            number21= Integer.parseInt(text21);
                        } catch (NumberFormatException e) {
                            ok = 0;
                        }
                        break;
                    case R.id.editText22:
                        String text22 = editText22.getText().toString();
                        try
                        {
                            number22 = Integer.parseInt(text22);
                        } catch (NumberFormatException e) {
                            ok = 0;
                        }
                        break;
                }
                if(ok == 1){
                    number11 = Integer.parseInt(editText11.getText().toString());
                    number12 = Integer.parseInt(editText12.getText().toString());
                    number21 = Integer.parseInt(editText21.getText().toString());
                    number22 = Integer.parseInt(editText22.getText().toString());

                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var08SecondaryActivity.class);
                    intent.putExtra("number11", number11);
                    intent.putExtra("number12", number12);
                    intent.putExtra("number21", number21);
                    intent.putExtra("number22", number22);
                    startActivityForResult(intent, SECONDARY_ACTIVITY_REQUEST_CODE);
                }
            }
        });

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("number11")) {
                editText11.setText(savedInstanceState.getString("number11"));
            } else {
                editText11.setText(String.valueOf(0));
            }
            if (savedInstanceState.containsKey("number12")) {
                editText12.setText(savedInstanceState.getString("number12"));
            } else {
                editText12.setText(String.valueOf(0));
            }
            if (savedInstanceState.containsKey("number21")) {
                editText21.setText(savedInstanceState.getString("number21"));
            } else {
                editText21.setText(String.valueOf(0));
            }
            if (savedInstanceState.containsKey("number22")) {
                editText22.setText(savedInstanceState.getString("number22"));
            } else {
                editText22.setText(String.valueOf(0));
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SECONDARY_ACTIVITY_REQUEST_CODE) {

        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("number11", editText11.getText().toString());
        outState.putString("number12", editText12.getText().toString());
        outState.putString("number21", editText21.getText().toString());
        outState.putString("number22", editText22.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey("number11")) {
            editText11.setText(savedInstanceState.getString("number11"));
        } else {
            editText11.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("number12")) {
            editText12.setText(savedInstanceState.getString("number12"));
        } else {
            editText12.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("number21")) {
            editText21.setText(savedInstanceState.getString("number21"));
        } else {
            editText21.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("number22")) {
            editText22.setText(savedInstanceState.getString("number22"));
        } else {
            editText22.setText(String.valueOf(0));
        }
    }
}
