package com.example.aroe.nextpagebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button harrystyles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        harrystyles = (Button)findViewById(R.id.btnNext);
        harrystyles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextPage();
            }
        });
    }

    public void openNextPage(){
        Intent ladygaga = new Intent(MainActivity.this, NextPage.class);
        startActivity(ladygaga);
//https://www.youtube.com/watch?v=bgIUdb-7Rqo

    }
}
