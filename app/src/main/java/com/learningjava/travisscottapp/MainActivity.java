package com.learningjava.travisscottapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.learningjava.travisscottapp";
    public static final String EXTRA_MESSAGE2 = "nothing here";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    int answer = 0;
    public void sendMessage(View view) {

        Intent intent = new Intent(this, displaymessageactivity.class);


        EditText date = findViewById(R.id.date);
        EditText month = findViewById(R.id.month);
        EditText year = findViewById(R.id.year);
        int DATE = Integer.parseInt(date.getText().toString());
        int MONTH = Integer.parseInt(month.getText().toString());
        int YEAR = Integer.parseInt(year.getText().toString());
        answer = answer + selfadder(DATE)+  selfadder(MONTH) + yearadder(YEAR);;
        answer = selfadder(answer);
        Log.d("Main", String.valueOf(answer));





        String message = String.valueOf(answer);


       // EditText personname = findViewById(R.id.personname);
       //String nameme = personname.getText().toString();

        //intent.putExtra(EXTRA_MESSAGE2, nameme);
        intent.putExtra(EXTRA_MESSAGE, message);


        startActivity(intent);
    }

    private int selfadder(int x) {
        int datesum = 0;
        datesum = datesum + (x % 10);
        datesum = datesum + (x / 10);


        return (datesum);
    }

        private int yearadder(int y){
           int yearsum = 0;
            ;
            int i = 0;
            while (i < 4) {

                yearsum = yearsum +  (y % 10);
                y = y /10;

                i++;
            }
            Log.d("yearsum1", String.valueOf(yearsum));
            return yearsum;

        }
    }


