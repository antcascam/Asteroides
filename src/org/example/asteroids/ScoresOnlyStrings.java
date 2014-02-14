package org.example.asteroids;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ScoresOnlyStrings extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score_only_strings);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,
				Asteroids.scoreWarehouse.scoreList(10)));
	}

}
