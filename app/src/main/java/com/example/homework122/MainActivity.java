package com.example.homework122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtResult = findViewById(R.id.txtResult);
        Random r = new Random();
        int rand_value = r.nextInt(100);
        txtResult.setText("http://myfile.org/"+rand_value);

        ImageButton btn1 = findViewById(R.id.btnNext);
        ImageButton btn2 = findViewById(R.id.btnPrev);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnNext:
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                break;
            case R.id.btnPrev:
                    finish();
                break;
        }
    }
}
