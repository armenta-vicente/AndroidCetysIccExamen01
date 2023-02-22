package com.vicentearmenta.androidcetysiccexamen01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;
import com.vicentearmenta.androidcetysiccexamen01.databinding.ActivityMainBinding;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;
    private EditText costOfService;
    private RadioGroup tipOptions;
    private SwitchMaterial roundUpSwitch;
    private Button calculateButton;
    private TextView tipResult;
    double tipPercentage = 0.2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        costOfService= binding.costOfServiceEditText;
        tipOptions = binding.tipOptions;

        roundUpSwitch = binding.roundUpSwitch;

        calculateButton = binding.calculateButton;

        tipResult = binding.tipResult;

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calculateTip(Double.parseDouble(costOfService.getText().toString()));
                } catch (NumberFormatException exception) {
                    Toast.makeText(MainActivity.this, "Capturar un monto", Toast.LENGTH_LONG).show();
                }
            }
        });

        tipOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.option_twenty_percent:
                        tipPercentage = 0.20;
                        break;
                    case R.id.option_eighteen_percent:
                        tipPercentage = 0.18;
                        break;
                    case R.id.option_fifteen_percent:
                        tipPercentage = 0.15;
                        break;
                }
            }
        });
    }

    private void calculateTip(double cost){
        if (cost == 0.0) {
            displayTip(0);
            return;
        }

        if (roundUpSwitch.isChecked()) {
            displayTip(Math.ceil(cost * tipPercentage));
        }
        else {
            displayTip(cost * tipPercentage);
        }
    }

    private void displayTip(double result){
        String formattedTip = NumberFormat.getCurrencyInstance().format(result);
        tipResult.setText(getString(R.string.tip_amount, formattedTip));
    }
}