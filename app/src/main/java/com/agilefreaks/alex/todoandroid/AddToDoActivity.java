package com.agilefreaks.alex.todoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddToDoActivity extends AppCompatActivity {

    static final int CREATE_TODO = 1;
    static final String TODO_TEXT = "todoText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);
    }

    public void addTodo(View view) {
        EditText text = findViewById(R.id.addTodo_Text);

        String todoDescription = text.getText().toString();

        Intent resultIntent = new Intent();
        resultIntent.putExtra(TODO_TEXT, todoDescription);
        setResult(RESULT_OK, resultIntent);

        finish();
    }
}
