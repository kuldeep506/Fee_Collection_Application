package com.example.feecollectionapplication.dashboard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.example.feecollectionapplication.R;

import java.util.Objects;

public class MainDashboard extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        Objects.requireNonNull(getSupportActionBar()).setElevation(45);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.gradient_list));
        Button newRegistration = findViewById(R.id.registrationBtn);
        Button registrationList = findViewById(R.id.registrationListBtn);
        Button feeDetails = findViewById(R.id.feeDetailsBtn);

        newRegistration.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainRegistration.class);
            startActivity(intent);
        });

//        registrationList.setVisibility(View.GONE);
        registrationList.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), RegistrationList.class);
            startActivity(intent);
        });

//        feeDetails.setVisibility(View.GONE);
        feeDetails.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FeeList.class);
            startActivity(intent);
        });
    }

    /**methods to show menu in action*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.about:
                Intent intent =new Intent(MainDashboard.this, AboutDeveloper.class);
                startActivity(intent);
                break;
        }
        return true;
    }

}