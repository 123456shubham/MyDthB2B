package com.example.princ.mydthb2b;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class OTPActivity extends AppCompatActivity {
@BindView(R.id.singInSignInBtn)
    Button buttonsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        ButterKnife.bind(this);


    }
    @OnClick(R.id.singInSignInBtn)
    public void singIn(){
        Intent intent=new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
        finish();
    }

}
