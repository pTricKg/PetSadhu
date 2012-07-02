package pTricKg.Sadhu;

import pTricKg.Sadhu.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;



public class SadhuActivity extends Activity{
    /** Called when the activity is first created. */

	ImageButton button1;
	MediaPlayer mButton2;
	MediaPlayer mButton3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
                        
      //sound button

       mButton2 = MediaPlayer.create(this, R.raw.bark); 
       mButton3 = MediaPlayer.create(this, R.raw.dogpanting);
        
        
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast text = Toast.makeText(SadhuActivity.this, R.string.rubdown, Toast.LENGTH_SHORT);
				text.show();
				startActivity(new Intent("pTricKg.Sadhu.CONTENT")); 
				mButton3.release();
				finish();
			}
		});
      button1.setOnLongClickListener(new View.OnLongClickListener() {
      public boolean onLongClick(View view) {
        
       mButton2.start();
       mButton3.start();
       return true;
      }
    });
    }
    @Override
	public boolean onCreateOptionsMenu(Menu menu)
    {
      super.onCreateOptionsMenu(menu);
      getMenuInflater().inflate(R.menu.main_menu0, menu);
      return true;
    }

    @Override
	public boolean onOptionsItemSelected(MenuItem item)
    {
      switch (item.getItemId()) {
      case R.id.menuWeb:
    	  startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.ptrickg.com")));
    	  finish();
    	  return true;
      
      }
     return false;
       
}
   
  }

    
