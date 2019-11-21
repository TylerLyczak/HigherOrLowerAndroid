package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Generates a random number between 20 and 1, Inclusive
    int randomNumber = (int)((Math.random() * ((20 - 1) + 1))+1);


    public void onClick (View view) {

        // Gets the text the user inputed and converts it to an int
        EditText editText = (EditText)findViewById(R.id.inputText);
        String userText = editText.getText().toString();
        int userInt = Integer.parseInt(userText);

        if (userInt == randomNumber)    {
            // User guessed correctly
            Toast.makeText(this, "Correct, Try Guessing Again!", Toast.LENGTH_SHORT).show();
            // Resets the random number
            randomNumber = (int)((Math.random() * ((20 - 1) + 1))+1);
        }
        else if (userInt > randomNumber)    {
            // User is higher than random
            Toast.makeText(this, "Go Lower...", Toast.LENGTH_SHORT).show();
        }
        else if (userInt < randomNumber)    {
            // User is lower than random
            Toast.makeText(this, "Go Higher...", Toast.LENGTH_SHORT).show();
        }
        else    {
            // Error
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
