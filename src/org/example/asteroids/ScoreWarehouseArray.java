package org.example.asteroids;

import java.util.Vector;

public class ScoreWarehouseArray implements IScoreWarehouse {

	private Vector<String> puntuaciones;

	public ScoreWarehouseArray() {
		puntuaciones = new Vector<String>();
		puntuaciones.add("656700 Homer Simpson");
		puntuaciones.add("200005 Darth Vader");
		puntuaciones.add("000015 Tyrion Lannister");

	}

	@Override
	public void saveScore(int points, String name, long date) {
		puntuaciones.add(0, points + " " + name);
	}

	@Override
	public Vector<String> scoreList(int quantity) {
		return puntuaciones;
	}

}
