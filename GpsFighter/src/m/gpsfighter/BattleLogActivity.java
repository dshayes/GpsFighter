package m.gpsfighter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;



public class BattleLogActivity extends Activity {
	
	public void moveToMainActivity(View view) {
		//a button that navagates back to the main menu
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void moveToBattleLogListScreen(View view) {
		//a button that goes from the main battle log view to a list view of combat logs
		Intent intent = new Intent(this, CombatLogActivity.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_battle_log);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_battle_log, menu);
		return true;
	}

}
