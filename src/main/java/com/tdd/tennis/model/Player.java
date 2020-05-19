package com.tdd.tennis.model;

public class Player {

	private int scoredPoint;
	private String playerName;

	public Player(String name) {
		this.playerName = name;
	}

	public int getScoredPoint() {
		return scoredPoint;
	}

	public void setScoredPoint(int scoredPoint) {
		this.scoredPoint = scoredPoint;
	}

	public String getPlayerName() {
		return playerName;
	}

}