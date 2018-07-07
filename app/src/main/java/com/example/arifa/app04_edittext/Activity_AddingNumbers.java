package com.example.arifa.app04_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_AddingNumbers extends AppCompatActivity {

    EditText txtfno, txtsno, txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__adding_numbers);

        txtfno = (EditText) findViewById(R.id.txtfno);
        txtsno = (EditText) findViewById(R.id.txtsno);
        txtresult = (EditText) findViewById(R.id.txtresult);

    }


    public void showsum(View view)
    {
        int fno = Integer.parseInt(txtfno.getText().toString());
        int lno = Integer.parseInt(txtsno.getText().toString());
        int result = fno + lno;
        txtresult.setText(Integer.toString(result));
    }
}
