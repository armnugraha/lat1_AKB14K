package com.unikom.armannugraha.monitoryarman;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Author: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 05-04-2019
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity;
    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //start hide titlebar & status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.login_activity);
        //end hide titlebar & status bar

        //start custom text
        TextView view = (TextView)findViewById(R.id.textPersetujuan);
        String formattedText = "<color='#202020'> Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami </color>";

        view.setText(Html.fromHtml(formattedText));
        //end custom text


        //start add this for move page
        btnMoveActivity = findViewById(R.id.buttonInput);
        btnMoveActivity.setOnClickListener(this);
        //end add this for move page

        //start add this for toast
        btnToast = findViewById(R.id.buttonKode);
        btnToast.setOnClickListener(this);
        //end add this for toast
    }

    /**
     * Listener Onclick button login_activity.xml
     */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonInput:
                Intent moveIntent = new Intent(LoginActivity.this, BiodataActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.buttonKode:
                Toast.makeText(getApplicationContext(),"Silahkan dibeli :)",Toast.LENGTH_LONG).show();
                break;

        }
    }
}
