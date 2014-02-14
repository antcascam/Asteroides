package org.example.asteroids;

import java.util.Vector;

public interface IScoreWarehouse {

	public void saveScore(int points, String name, long date);

	public Vector<String> scoreList(int quantity);

}