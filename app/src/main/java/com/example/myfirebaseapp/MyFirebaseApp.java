package com.example.myfirebaseapp;

import com.google.firebase.database.FirebaseDatabase;

public class MyFirebaseApp extends android.app.Application{

    //1 persistencia de datos
    //luego en manifest android:name=".MyFirebaseApp"
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
