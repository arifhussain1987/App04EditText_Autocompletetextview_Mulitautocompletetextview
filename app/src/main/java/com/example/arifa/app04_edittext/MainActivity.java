package com.example.arifa.app04_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtfname, txtlname, txtfullname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtfname = (EditText) findViewById(R.id.txtfname);
        txtlname = (EditText) findViewById(R.id.txtlname);
        txtfullname = (EditText) findViewById(R.id.txtfullname);
    }


    public void showname(View view)
    {
        String firstname = txtfname.getText().toString().trim();
        String lastname = txtlname.getText().toString().trim();
        String fullname = firstname + " " + lastname;

        txtfullname.setText(fullname);
    }
}
