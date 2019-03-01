package com.tidittii.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class RandNumGenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randnumgen);

        final Button    submitButton = findViewById(R.id.submitButton);
        final EditText  betweenNumber = findViewById(R.id.betweenNumber);
        final TextView  randomNumber = findViewById(R.id.showRandomNumber);
        final TextView  errorTextView = findViewById(R.id.errorTextView);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToString = betweenNumber.getText().toString();
                if(!TextUtils.isEmpty(textToString) && textToString.length() < 10) {
                    int convertedNumber = Integer.parseInt(textToString);
                    Random rand = new Random();
                    int n = rand.nextInt(convertedNumber);
                    randomNumber.setText(String.valueOf(n + 1));
                    errorTextView.setText("");
                //Error handling!
                } else if(TextUtils.isEmpty(textToString)) {
                    errorTextView.setText(getString(R.string.no_value_error));
                } else if(textToString.length() > 10) {
                    errorTextView.setText(getString(R.string.value_too_large));
                } else {
                    errorTextView.setText(getString(R.string.unknown_error));
                }
            }
        });
    }
}
