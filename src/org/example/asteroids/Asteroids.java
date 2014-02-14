package org.example.asteroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroids extends Activity {
	public static IScoreWarehouse scoreWarehouse = new ScoreWarehouseArray();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button bAbout = (Button) findViewById(R.id.about);

		bAbout.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {

				launchAbout(null);
			}
		});

		Button bfinish = (Button) findViewById(R.id.exit);

		bfinish.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {

				finish(null);
			}
		});
	}

	public void finish(View view) {
		finish();
	}

	public void launchScore(View view) {

		Intent intent = new Intent(this, Scores.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
		/** true -> el menú ya está visible */
	}

	// Este método llama a actividades desde el botón de menu
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.aboutItem:
			launchAbout(null);
			break;
		case R.id.config:
			launchPreferences(null);
			break;
		}
		return true;
		/** true -> consumimos el item, no se propaga */
	}

	public void launchAbout(View view) {

		Intent intent = new Intent(this, About.class);
		startActivity(intent);
	}

	public void launchPreferences(View view) {

		Intent intent = new Intent(this, Preferences.class);
		startActivity(intent);
	}

}
