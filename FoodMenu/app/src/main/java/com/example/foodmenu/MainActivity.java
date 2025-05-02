package com.example.foodmenu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private CheckBox cbBurger, cbFries, cbCola, cbCornJuice;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbBurger = findViewById(R.id.cb_burger);
        cbFries = findViewById(R.id.cb_fries);
        cbCola = findViewById(R.id.cb_cola);
        cbCornJuice = findViewById(R.id.cb_corn_juice);
        Button btnOrder = findViewById(R.id.btn_order);
        tvResult = findViewById(R.id.tv_result);

        btnOrder.setOnClickListener(v -> {
            StringBuilder selectedItems = new StringBuilder("您点的餐点是：\n");

            if (cbBurger.isChecked()) {
                selectedItems.append("汉堡\n");
            }
            if (cbFries.isChecked()) {
                selectedItems.append("薯条\n");
            }
            if (cbCola.isChecked()) {
                selectedItems.append("可乐\n");
            }
            if (cbCornJuice.isChecked()) {
                selectedItems.append("玉米汁\n");
            }

            tvResult.setText(selectedItems.toString());
        });
    }
}