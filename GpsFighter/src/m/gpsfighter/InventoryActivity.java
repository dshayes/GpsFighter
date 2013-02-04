package m.gpsfighter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class InventoryActivity extends Activity {
	
	//methor called when user hits back button
	public void moveToMainMenu(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	//method called when user hits char button
	public void moveToCharacterScreen(View view) {
		Intent intent = new Intent(this, MyCharacterActivity.class);
		startActivity(intent);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inventory);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_inventory, menu);
		return true;
	}

}
