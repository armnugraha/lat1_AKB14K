package com.unikom.armannugraha.monitoryarman;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Author: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 05-04-2019
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //start hide titlebar & status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        //end hide titlebar & status bar

        btnMoveActivity = findViewById(R.id.buttonLogin);
        btnMoveActivity.setOnClickListener(this);

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                Intent moveIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(moveIntent);
                break;
        }
    }

}
