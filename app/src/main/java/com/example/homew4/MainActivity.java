package com.example.homew4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editEngine, editTransnission, editBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editEngine = findViewById(R.id.editEngine);
        editTransnission = findViewById(R.id.editTransmission);
        editBody = findViewById(R.id.editBody);
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int engine = Integer.parseInt(editEngine.getText().toString());
            int transmission = Integer.parseInt(editTransnission.getText().toString());
            int body = Integer.parseInt(editBody.getText().toString());

            int sum = engine + transmission + body;
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra("sum", sum);
            startActivity(intent);
        }
    };
}