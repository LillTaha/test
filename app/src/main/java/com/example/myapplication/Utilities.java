package com.example.myapplication;

enum ErrorCodes
{
    IncorrectAuth, FieldsEmpty, True, False
}

enum PlantCat
{
    tree,flower,
}

public class Utilities {
    private static Utilities instance;

    public Utilities()
    {}

    public static Utilities getInstance()
    {
        if (instance == null)
            instance = new Utilities();

        return instance;
    }

    public boolean validateEmail(String username)
    {
        return true;
    }

    public boolean validatePassword(String password)
    {
        return true;
    }

    public boolean checkTrimEmpty(String text)
    {
        return text.trim().isEmpty();
    }
}

