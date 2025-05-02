package com.example.ch04_tempconversion;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private EditText etInput;
    private TextView tvResultF, tvResultC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        etInput = findViewById(R.id.et_input);
        tvResultF = findViewById(R.id.tv_result_f);
        tvResultC = findViewById(R.id.tv_result_c);

        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                convertTemperature();
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                convertTemperature();
            }
        });
    }

    private void convertTemperature() {
        String input = etInput.getText().toString().trim();
        if (input.isEmpty()) {
            tvResultF.setText("");
            tvResultC.setText("");
            return;
        }

        try {
            double value = Double.parseDouble(input);
            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == R.id.radio_fahrenheit) {

                double celsius = (value - 32) * 5.0 / 9.0;
                tvResultF.setText(String.format("%.1f%s", value, getString(R.string.fahrenheit_symbol)));
                tvResultC.setText(String.format("%.1f%s", celsius, getString(R.string.celsius_symbol)));
            } else if (selectedId == R.id.radio_celsius) {

                double fahrenheit = value * 9.0 / 5.0 + 32;
                tvResultF.setText(String.format("%.1f%s", fahrenheit, getString(R.string.fahrenheit_symbol)));
                tvResultC.setText(String.format("%.1f%s", value, getString(R.string.celsius_symbol)));
            }
        } catch (NumberFormatException e) {
            // 输入非法字符时清空结果
            tvResultF.setText("");
            tvResultC.setText("");
        }
    }
}