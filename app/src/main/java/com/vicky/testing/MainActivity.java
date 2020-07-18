package com.vicky.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Name all the files
        ImageButton findStore,searchPeople,homeButton,findHospital,userAccount;

        findStore = (ImageButton) findViewById(R.id.imageButton2);
        searchPeople = (ImageButton) findViewById(R.id.imageButton3);
        homeButton = (ImageButton) findViewById(R.id.imageButton4);
        findHospital = (ImageButton) findViewById(R.id.imageButton5);
        userAccount = (ImageButton) findViewById(R.id.imageButton6);

    }

}