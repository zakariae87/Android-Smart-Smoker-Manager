package com.example.smartfighter;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class SplashScreenActivity extends AppCompatActivity {

    private  static int SPLASH_TIME_OUT = 3000;

    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);

        Thread loaderThread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(SPLASH_TIME_OUT);  //Delay of 3 seconds
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        loaderThread.start();
    }
}
