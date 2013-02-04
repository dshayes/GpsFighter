package m.gpsfighter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class CombatLogActivity extends Activity {
	
	//on back button click
	public void moveToMainBattleLogActivity(View view) {
		Intent intent = new Intent(this, BattleLogActivity.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_combat_log);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_combat_log, menu);
		return true;
	}

}
