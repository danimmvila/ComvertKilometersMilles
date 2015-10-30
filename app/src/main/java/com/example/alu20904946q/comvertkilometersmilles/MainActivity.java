package com.example.alu20904946q.comvertkilometersmilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ed;
    private TextView tv;
    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.textView);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    convert();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void convert(){
        if(rg.getCheckedRadioButtonId()==R.id.radioButtonTK){
            double m=Double.parseDouble(String.valueOf(ed.getText()));
            double k= m*1.6;
            tv.setText(m+"milles are "+k+"km");
        }
        if(rg.getCheckedRadioButtonId()==R.id.radioButtonTM){
            double k=Double.parseDouble(String.valueOf(ed.getText()));
            double m= k/1.6;
            tv.setText(k+"km are "+m+"milles");
        }
    }
}
