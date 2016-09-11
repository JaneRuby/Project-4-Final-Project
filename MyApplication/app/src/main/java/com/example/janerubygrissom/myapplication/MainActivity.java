package com.example.janerubygrissom.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button submitButton;
    private Button funFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        editText = (EditText) findViewById(R.id.edittext);
        submitButton = (Button) findViewById(R.id.submit_button);
        funFacts = (Button) findViewById(R.id.fun_facts);

        submitButton.setOnClickListener(new View.OnClickListener() {
            //gets text and sends through the intent
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().equals("")) {
                    editText.setError("Please enter text!");
                } else {
                    Intent intent = new Intent(MainActivity.this, Response.class);
                    intent.putExtra("RobertZimmerman", editText.getText().toString());
                    startActivity(intent);
                }
            }

        });

        //when the button is clicked, enters next Fun Facts
        funFacts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, FunFactsList.class);
                startActivity(i);

            }
        });
    }


}
