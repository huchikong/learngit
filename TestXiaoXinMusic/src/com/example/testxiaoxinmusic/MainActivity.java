package com.example.testxiaoxinmusic;

import java.io.IOException;
import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button bofang1, zanting1, tingzhi1;
	private MediaPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bofang1 = (Button) findViewById(R.id.bofang1);
		zanting1 = (Button) findViewById(R.id.zanting1);
		tingzhi1 = (Button) findViewById(R.id.tingzhi1);

		bofang1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 播放SD卡上的音频文件(/sdcard/music
				Toast.makeText(MainActivity.this, "ss", 0).show();

				mediaPlayer = new MediaPlayer().create(MainActivity.this, R.raw.hello);
				mediaPlayer.start();

			}
		});
		zanting1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
					mediaPlayer.pause();
				
			}
		});

		tingzhi1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mediaPlayer.stop();
				
			}
		});
	}
}
