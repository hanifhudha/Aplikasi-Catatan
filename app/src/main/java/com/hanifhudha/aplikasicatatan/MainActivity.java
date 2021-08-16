package com.hanifhudha.aplikasicatatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hanifhudha.aplikasicatatan.catatan.MainCatatanActivity;
import com.hanifhudha.aplikasicatatan.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void actionDailyNote(View view){
        Intent intent = new Intent(this, MainCatatanActivity.class);
        intent.putExtra(GlobalVariable.CATATAN_HARIAN, "Catatan Harian");
        startActivity(intent);
    }

    public void actionLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(GlobalVariable.LOGIN, "Login Page");
        startActivity(intent);
    }
}