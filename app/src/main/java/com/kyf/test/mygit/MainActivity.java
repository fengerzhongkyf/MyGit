package com.kyf.test.mygit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFeature2;
    private Button btnFeature3;
    private Button btnFeature1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnFeature2 = (Button) findViewById(R.id.btn_feature2);
        btnFeature3 = (Button) findViewById(R.id.btn_feature3);
        btnFeature1 = (Button) findViewById(R.id.btn_feature1);
    }

    public void feature1(View view) {
        if (btnFeature1.getText().toString().equals("功能1")) {
            btnFeature1.setText(R.string.feature_1_dis);
        } else {
            btnFeature1.setText(R.string.feature_1);
        }
    }

    public void feature2(View view) {
        if (btnFeature2.getText().toString().equals("功能2")) {
            btnFeature2.setText(R.string.feature_2_dis);
        } else {
            btnFeature2.setText(R.string.feature_2);
        }
    }
}
