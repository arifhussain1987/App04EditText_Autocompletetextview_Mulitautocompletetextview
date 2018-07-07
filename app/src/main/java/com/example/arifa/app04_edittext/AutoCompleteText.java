package com.example.arifa.app04_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class AutoCompleteText extends AppCompatActivity {

    String countries_array[] = {"Pakistan", "Afghanistan", "Iran", "China", "India"};
    AutoCompleteTextView autoCompleteTextView_simple, autoCompleteTextView_resouces;
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    TextView txtshowcountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        autoCompleteTextView_simple = (AutoCompleteTextView)findViewById(R.id.actv_simple);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries_array);
        autoCompleteTextView_simple.setAdapter(adapter);

        autoCompleteTextView_resouces = (AutoCompleteTextView)findViewById(R.id.actv_resources);
        String countries[] = getResources().getStringArray(R.array.countries_array);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        autoCompleteTextView_resouces.setAdapter(adapter1);

        multiAutoCompleteTextView = (MultiAutoCompleteTextView)findViewById(R.id.mactv);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        multiAutoCompleteTextView.setAdapter(adapter2);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


        txtshowcountry = (TextView)findViewById(R.id.txtshowcountry);

    }

    public void showdata(View view)
    {
        String data = multiAutoCompleteTextView.getText().toString();

        String[] data_without_comma = data.split(",");

        String properdata = "";

        for (int i = 0; i < data_without_comma.length; i++)
        {
            properdata += data_without_comma[i];
        }


        Toast.makeText(this, properdata, Toast.LENGTH_SHORT).show();
    }


}
