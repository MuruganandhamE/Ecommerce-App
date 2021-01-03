package com.muruga.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AdminAddNewProductActivity extends AppCompatActivity
{

    private String categoryName;
    private ImageView productImage;
    private EditText productName,productDescription,productPrice;
    private Button addProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);
        productImage=findViewById(R.id.select_product_image);
        productName=findViewById(R.id.product_name);
        productDescription=findViewById(R.id.product_description);
        productPrice=findViewById(R.id.product_price);


        categoryName=getIntent().getExtras().get("category").toString();

        Toast.makeText(this, categoryName, Toast.LENGTH_SHORT).show();
    }
}