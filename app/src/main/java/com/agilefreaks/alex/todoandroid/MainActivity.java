package com.agilefreaks.alex.todoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addToDo_onClick(View view)
    {
        Intent addToDoIntent = new Intent(this,AddToDoActivity.class);

        startActivity(addToDoIntent);
    }
}
