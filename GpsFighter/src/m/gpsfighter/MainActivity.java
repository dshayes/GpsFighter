package m.gpsfighter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	//moves the view to the battle log screen
	public void moveToBattleLogScreen(View view) {
		Intent intent = new Intent(this, BattleLogActivity.class);
		startActivity(intent);
	}
	
	//moves to the character screen
	public void moveToMyCharacterScreen(View view) {
		Intent intent = new Intent(this, MyCharacterActivity.class);
		startActivity(intent);
	}
	
	//moves to the inventory screen
	public void moveToInventoryScreen(View view) {
		Intent intent = new Intent(this, InventoryActivity.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
