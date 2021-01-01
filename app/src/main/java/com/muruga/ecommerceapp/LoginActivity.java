package com.muruga.ecommerceapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity
{

    private EditText number, password;
    private Button login;
    private String numberInput, passwordInput;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        number = findViewById(R.id.login_phoneNum);
        password = findViewById(R.id.login_password);
        login = findViewById(R.id.login_login_btn);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loginUser();
            }
        });
    }

    private void loginUser()
    {
        numberInput = number.getText().toString();
        passwordInput = password.getText().toString();
        if (TextUtils.isEmpty(numberInput))
        {
            Toast.makeText(this, "Please Enter Your Number", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(passwordInput))
        {
            Toast.makeText(this, "Please Enter Your password", Toast.LENGTH_SHORT).show();
        } else
        {
            loadingBar = new ProgressDialog(this);
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please Wait,While We are checking the credentials");
            loadingBar.setCancelable(false);
            loadingBar.show();

            validateUser(numberInput, passwordInput);
        }
    }

    private void validateUser(String numberInput, String passwordInput)
    {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();
    }
}