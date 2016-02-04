package com.example.administrator.imusic.welcome;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.imusic.Main;
import com.example.administrator.imusic.R;

/**
 * Welcome
 *
 * @author: Xingkai Ren
 * @time: 2016/2/4  17:22
 */
public class Welcome extends Activity {

    private static final String TAG = "Welcome";

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        mediaPlayer = MediaPlayer.create(this, R.raw.kuwo);
        mediaPlayer.start();
        //跳过初始化背景界面
        findViewById(R.id.btnWelcom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome.this, Main.class));
            }
        });
    }
}
