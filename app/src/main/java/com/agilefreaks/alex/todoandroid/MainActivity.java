package com.agilefreaks.alex.todoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int CREATE_TODO = 1;
    static final String TODO_TEXT = "todoText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addToDo_onClick(View view)
    {
        Intent addToDoIntent = new Intent(this,AddToDoActivity.class);

        startActivityForResult(addToDoIntent, CREATE_TODO);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(resultCode == RESULT_OK)
        {
            String text = data.getStringExtra(TODO_TEXT);

            TextView txtv = findViewById(R.id.textview);

            txtv.setText(text);
        }
    }
}
