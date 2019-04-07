package com.unikom.armannugraha.monitoryarman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Author: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 05-04-2019
 */

public class BiodataActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveWithDataActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //start hide titlebar & status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_biodata);
        //end hide titlebar & status bar

        //start create button to move activity
        btnMoveWithDataActivity = findViewById(R.id.buttonBiodata);
        btnMoveWithDataActivity.setOnClickListener(this);
        //end create button to move activity

    }

    /**
     * Listener Onclick button activity_biodata.xml
     * send value to class welcome activity
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonBiodata:

                EditText setTextName = (EditText)findViewById(R.id.editTextNama);
                String getTextName = setTextName.getText().toString();

                Intent moveWithDataIntent = new Intent(BiodataActivity.this, WelcomeActivity.class);
                moveWithDataIntent.putExtra(WelcomeActivity.EXTRA_NAME, getTextName);
                startActivity(moveWithDataIntent);
                break;
        }
    }
}
