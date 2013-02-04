package m.gpsfighter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MyCharacterActivity extends Activity {
	
	public void moveToMainMenu(View view) {
		//moves back to the main menu
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_character);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_my_character, menu);
		return true;
	}

}
