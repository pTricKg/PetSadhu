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

public class SadhuContent extends Activity{
	
	ImageButton imageButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		
		
		final MediaPlayer mButton = MediaPlayer.create(this, R.raw.doggrowlshort);
		final MediaPlayer mButton2 = MediaPlayer.create(this, R.raw.bark);
		
		mButton.start();
		
		ImageButton imageButton = (ImageButton) findViewById(R.id.imageView1);
	    imageButton.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view)
	      {
	        startActivity(new Intent("pTricKg.Sadhu.VIEW"));
	        
	        Toast text = Toast.makeText(SadhuContent.this, R.string.content, Toast.LENGTH_SHORT);
			text.show();
			
			mButton2.start();
			mButton.release();
			finish();
	      }
	});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
    {
      super.onCreateOptionsMenu(menu);
      getMenuInflater().inflate(R.menu.main_menu, menu);
      return true;
    }

    @Override
	public boolean onOptionsItemSelected(MenuItem item)
    {
      switch (item.getItemId()) {
      case R.id.menuWeb:
    	  startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.ptrickg.com")));
    	  return true;
      case R.id.menuExit:
    	  startActivity(new Intent("pTricKg.Sadhu.VIEW"));
    	  finish();
    	  return true;
      }
     return false;
        
}
    
}
