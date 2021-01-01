package com.muruga.ecommerceapp.model;

import java.math.BigInteger;

public class User
{
    private int id;
    private String name;
    private String phonenumber;
    private String password;

    public User(int id,String inputName, String phonenumber, String password)
    {
        this.id=id;
        this.name=inputName;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
