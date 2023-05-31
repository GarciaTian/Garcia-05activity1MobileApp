package com.example.garciaswapperandcheckertp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.resultTextView);

        String text1 = getIntent().getStringExtra("text1");
        String text2 = getIntent().getStringExtra("text2");

        if (text1.equals(text2)) {
            resultTextView.setText("SAME");
        } else {
            resultTextView.setText("NOT THE SAME");
        }
    }
}
