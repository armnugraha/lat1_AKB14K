package com.unikom.armannugraha.monitoryarman;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Author: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 05-04-2019
 */

public class WelcomeActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";

    TextView tvDataName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //start hide titlebar & status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_welcome);
        //end hide titlebar & status bar

        //start set text dinamis
        tvDataName = findViewById(R.id.tv_data_name);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String text = "Beres! Sekarang " + name + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu " + name + " ngatur waktu :)";
        tvDataName.setText(text);
        //end set text dinamis

        //start button close app
        Button btn1 = (Button) findViewById(R.id.buttonClose);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(WelcomeActivity.this, BiodataActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                intent.putExtra("EXIT", true);
//                startActivity(intent);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
//                finish();
//                System.exit(0);
//                moveTaskToBack(true);
//                AlertDialog.Builder builder = new AlertDialog.Builder(WelcomeActivity.this);
//                builder.setTitle(R.string.app_name);
//                builder.setIcon(R.mipmap.ic_launcher);
//                builder.setMessage("Do you want to exit?")
//                        .setCancelable(false)
//                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                finish();
//                            }
//                        })
//                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.cancel();
//                            }
//                        });
//                AlertDialog alert = builder.create();
//                alert.show();

        }});
        //end button close app

    }
}
