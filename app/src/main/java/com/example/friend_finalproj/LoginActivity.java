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

        imformation = findViewById(R.id.toolbar);
        img_logo = findViewById(R.id.imglogoit);
        user = findViewById(R.id.box_user);
        password = findViewById(R.id.box_pass);

        butt_login = findViewById(R.id.buttlogin);
        butt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(LoginActivity.this,TeachActivity.class);
                startActivity(gotohome);
            }
        });

        butt_can = findViewById(R.id.buttcan);
        butt_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomain = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(gotomain);
            }
        });

    }
}
