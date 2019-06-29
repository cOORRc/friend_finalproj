package com.example.friend_finalproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {
    private ImageView img_logo;
    private TextView user,password;
    private Button butt_login,butt_can;
    private Toolbar imformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        imformation = (Toolbar) findViewById(R.id.toolbar);
        img_logo = (ImageView)findViewById(R.id.imglogoit);
        user = (TextView)findViewById(R.id.box_user);
        password = (TextView)findViewById(R.id.box_pass);

        butt_login = (Button)findViewById(R.id.buttlogin_log);
        butt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(LoginActivity.this,TeachActivity.class);
                startActivity(gotohome);
            }
        });

        butt_can = (Button)findViewById(R.id.buttcan_log);
        butt_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomain = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(gotomain);
            }
        });

    }
}
