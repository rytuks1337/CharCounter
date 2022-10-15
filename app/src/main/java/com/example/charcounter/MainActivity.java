package com.example.charcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerOptions;
    private EditText edText;
    private TextView txView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.edText= (EditText) findViewById(R.id.edMainText);
        this.spinnerOptions = (Spinner) findViewById(R.id.spinnerOptions);
        this.txView = (TextView) findViewById(R.id.textResult);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_options, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        this.spinnerOptions.setAdapter(adapter);

    }

    public void btnClick(View view) {
        if(this.edText.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"You Failed To Input Text",Toast.LENGTH_SHORT).show();
        }
        if(this.spinnerOptions.getSelectedItem().toString().equals(getResources().getString(R.string.Word_option))){
            this.txView.setText(calculations.calcWords(edText.getText().toString()));
        }else{
            this.txView.setText(calculations.calcChars(edText.getText().toString()));
        }
    }
}