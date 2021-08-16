package com.hanifhudha.aplikasicatatan.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hanifhudha.aplikasicatatan.GlobalVariable;
import com.hanifhudha.aplikasicatatan.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String judul = extras.getString(GlobalVariable.LOGIN);
            setTitle(judul);
        }
    }
}