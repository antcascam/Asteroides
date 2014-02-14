package org.example.asteroids;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Scores extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score);
		setListAdapter(new AsteroidsAdapter(this,
				Asteroids.scoreWarehouse.scoreList(10)));
	}

	@Override
	protected void onListItemClick(ListView listView, View view, int position,long id) {
		super.onListItemClick(listView, view, position, id);
		Object object = getListAdapter().getItem(position);
		String selection = getString(R.string.selection);
		Toast.makeText(this,
				selection +" "+Integer.toString(position) + ": "
						+ object.toString(), Toast.LENGTH_LONG).show();
	}
}
