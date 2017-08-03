package com.boskopi.tokobuku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    @ViewById
    EditText etUsername;

    @ViewById
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Click
    void btnLogin(){

        if (etUsername.getText().length() == 0 || etPassword.getText().length() == 0){
            Toast.makeText(getApplicationContext(), "Silahkan masukan username dan password !", Toast.LENGTH_LONG).show();
        }else{
            MainActivity_.intent(this).start();
            this.finish();
        }
    }
}
