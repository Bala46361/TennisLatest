package com.tdd.tennis;

import com.tdd.tennis.model.Player;

public class TennisGame {

	private Player playerOne;
	private Player playerTwo;

	public TennisGame() {
		playerOne = new Player();
		playerOne.setPlayerName("Player One");

		playerTwo = new Player();
		playerTwo.setPlayerName("Player Two");
	}

	protected Player getPlayerOne() {
		return playerOne;
	}

	protected Player getPlayerTwo() {
		return playerTwo;
	}
}
