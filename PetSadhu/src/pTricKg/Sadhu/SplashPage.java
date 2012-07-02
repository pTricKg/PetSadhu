package pTricKg.Sadhu;

import pTricKg.Sadhu.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

public class SplashPage extends Activity{
	MediaPlayer mSound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread splashTimer = new Thread(){
			@Override
			public void run(){
				try{
					int splashTimer = 0;
					while(splashTimer <2000) {
						sleep(100);
						splashTimer = splashTimer +100;
					}
					startActivity(new Intent("pTricKg.Sadhu.VIEW"));
				} catch(InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		};
		splashTimer.start();
		
		Toast text = Toast.makeText(SplashPage.this, R.string.main, Toast.LENGTH_SHORT);
		text.show();
		mSound = MediaPlayer.create(this, R.raw.bark);
		mSound.start();
	}
	@Override
	protected void onDestroy() {
		 //TODO Auto-generated method stub
		super.onDestroy();
		mSound.release();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mSound.pause();
	}

	@Override
	protected void onResume() {
		 //TODO Auto-generated method stub
		super.onResume();
		mSound.start();
	}

	@Override
	protected void onStop() {
		 //TODO Auto-generated method stub
		super.onStop();
	}
	


}


