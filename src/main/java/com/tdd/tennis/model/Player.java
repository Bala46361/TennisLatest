package com.tdd.tennis.model;

public class Player {

	private int scoredPoint;
	private String name;

	public int getScoredPoint() {
		return scoredPoint;
	}

	public void setScoredPoint(int scoredPoint) {
		this.scoredPoint = scoredPoint;
	}

	public String getPlayerName() {
		return name;
	}

	public void setPlayerName(String name) {
		this.name = name;
	}
}