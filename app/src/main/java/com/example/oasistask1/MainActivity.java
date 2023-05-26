package com.example.oasistask1;

import static java.lang.Float.parseFloat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String unitText;
    EditText txtUnit;
    TextView convertedUnit;
    Button convert;
    float output;
    float inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        txtUnit = findViewById(R.id.edittxtUnit);
        convertedUnit = findViewById(R.id.convertedUnit);
        convert = findViewById(R.id.convertBtn);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUnit.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter some value in the input", Toast.LENGTH_SHORT).show();
                }
                else{
                    unitText = spinner.getSelectedItem().toString();
                    inp = parseFloat(txtUnit.getText().toString());
                    switch (unitText) {
                        case "Foot to Inch":
                            output = inp * 12;
                            convertedUnit.setText(String.format("%s Inch", output));
                            break;
                        case "yard to feet":
                            output = inp * 3;
                            convertedUnit.setText(String.format("%s feet", output));

                            break;
                        case "mile to yard":
                            output = inp * 1760;
                            convertedUnit.setText(String.format("%s yards", output));
                            break;
                        case "kilometer to meter":
                            output = inp * 1000;
                            convertedUnit.setText(String.format("%s meter", output));
                            break;
                        case "meter to centimeter":
                            output = inp * 100;
                            convertedUnit.setText(String.format("%s centimeter", output));
                            break;
                        case "centimeter to millimeter":
                            output = inp * 10;
                            convertedUnit.setText(String.format("%s millimeter", output));
                            break;
                        case "ton to pound":
                            output = inp * 2000;
                            convertedUnit.setText(String.format("%s pound", output));
                            break;
                        case "kilogram to gram":
                            output = inp * 1000;
                            convertedUnit.setText(String.format("%s grams", output));
                            break;
                        case "gram to milligram":
                            output = inp * 1000;
                            convertedUnit.setText(String.format("%s milligrams", output));
                            break;
                        case "gallon to quarts":
                            output = inp * 4;
                            convertedUnit.setText(String.format("%s quarts", output));
                            break;
                        case "Liter to milliliter":
                            output = inp * 1000;
                            convertedUnit.setText(String.format("%s milliliters", output));
                            break;
                        case "celsius to kelvin":
                            output = (float) (inp + 273.15);
                            convertedUnit.setText(String.format("%s kelvin", output));
                            break;
                        case "kelvin to celsius":
                            output = (float) (inp - 273.15);
                            convertedUnit.setText(String.format("%s degree celsius", output));
                            break;
                        case "Fahrenheit to celsius":
                            output = (float) ((inp - 32) * 5) / 9;
                            convertedUnit.setText(String.format("%s degree celsius", output));
                            break;
                        case "celsius to Fahrenheit":
                            output = (float) ((inp * (5 / 9)) + 32);
                            convertedUnit.setText(String.format("%s Fahrenheit", output));
                            break;
                        case "kelvin to Fahrenheit":
                            output = (float) ((((inp - 273.15) * 9) / 5) + 32);
                            convertedUnit.setText(String.format("%s Fahrenheit", output));
                            break;
                        case "Fahrenheit to kelvin":
                            output = (float) ((((inp - 32) * 5) / 9) + 273.15);
                            convertedUnit.setText(String.format("%s kelvin", output));
                            break;
                    }
                }

            }
        });


    }
}