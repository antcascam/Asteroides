package org.example.asteroids;

import java.util.Vector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AsteroidsAdapter extends BaseAdapter {

	private final Activity activity;
	private final Vector<String> vector;

	public AsteroidsAdapter(Activity activity, Vector<String> vector) {
		super();
		this.activity = activity;
		this.vector = vector;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		View view = inflater.inflate(R.layout.list_element, null, true);
		TextView textView = (TextView) view.findViewById(R.id.title);
		textView.setText(vector.elementAt(position));
		ImageView imageView = (ImageView) view.findViewById(R.id.icon);
		switch (Math.round((float) Math.random() * 3)) {
		case 0:
			imageView.setImageResource(R.drawable.asteroid1);
			break;
		case 1:
			imageView.setImageResource(R.drawable.asteroid2);
			break;
		default:
			imageView.setImageResource(R.drawable.asteroid3);
			break;
		}
		return view;
	}

	public int getCount() {
		return vector.size();
	}

	public Object getItem(int arg0) {
		return vector.elementAt(arg0);
	}

	public long getItemId(int position) {
		return position;
	}
}
