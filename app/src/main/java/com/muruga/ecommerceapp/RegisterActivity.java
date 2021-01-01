package com.muruga.ecommerceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.muruga.ecommerceapp.model.User;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity
{

    private Button createBtn;
    private EditText name, number, password;
    private String inputName, inputNumber, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = findViewById(R.id.register_name);
        number = findViewById(R.id.register_phoneNum);
        password = findViewById(R.id.register_password);
        createBtn = findViewById(R.id.register_create_btn);

        createBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputName=name.getText().toString();
                inputNumber=number.getText().toString();
                inputPassword=password.getText().toString();
                saveUser(inputName,inputNumber,inputPassword);
            }
        });
    }

    private void saveUser(String inputName, String inputNumber, String inputPassword)
    {
//        final FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference ref = database.getReference("https://ecommerce-app-f0150-default-rtdb.firebaseio.com/");
//        DatabaseReference usersRef = ref.child("users");
//
//        User user=new User(inputName,inputNumber,inputPassword);
//        usersRef.child("1").setValue(user);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.setValue("Hello, World!");
        int userId=2;
        User user=new User(userId,inputName,inputNumber,inputPassword);
        myRef.child("users").child(String.valueOf(userId)).setValue(user);
    }
}