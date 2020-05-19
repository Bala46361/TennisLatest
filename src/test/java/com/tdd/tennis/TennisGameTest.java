package com.tdd.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import com.tdd.tennis.model.Player;

public class TennisGameTest {

	TennisGame tennisGame;

	@Before
	public void initialize() {
		tennisGame = new TennisGame();
	}

	@Test
	public void playerScoreShouldBeZeroBeforeGameStarts() {

		assertThat(tennisGame.getPlayerOne().getScoredPoint(), CoreMatchers.is(0));
	}

	@Test
	public void firstPlayerNameShouldBeInitializedAsPlayerOneWhenGameStarts() {

		assertThat(tennisGame.getPlayerOne().getPlayerName(), CoreMatchers.is("Player One"));

	}

	@Test
	public void secondPlayerNameShouldBeInitializedAsPlayerTwoWhenGameStarts() {

		assertThat(tennisGame.getPlayerTwo().getPlayerName(), CoreMatchers.is("Player Two"));

	}

	@Test
	public void gameScoreShouldBeLoveAllWhenGameStarts() {
		assertThat(tennisGame.calculateGameScore(), CoreMatchers.is("Love-All"));

	}

	@Test
	public void gameScoreShouldBeFifteenLoveWhenPlayerOneTakesTheFirstPoint() {

		updatePlayerScoreBasedOnNumberOfPointsTaken(tennisGame.getPlayerOne(), 1);

		assertThat(tennisGame.calculateGameScore(), CoreMatchers.is("Fifteen-Love"));

	}

	@Test
	public void gameScoreShouldBeLoveThirtyWhenPlayerTwoWonTwoPointsAndPlayerOneHasNotTakenAnyPoints() {

		updatePlayerScoreBasedOnNumberOfPointsTaken(tennisGame.getPlayerTwo(), 2);

		assertThat(tennisGame.calculateGameScore(), CoreMatchers.is("Love-Thirty"));
	}

	@Test
	public void gameScoreShouldBeFortyThirtyWhenPlayerOneHasTakenThreePointsAndPlayerTwoHasTakenTwoPoints() {

		updatePlayerScoreBasedOnNumberOfPointsTaken(tennisGame.getPlayerOne(), 3);
		updatePlayerScoreBasedOnNumberOfPointsTaken(tennisGame.getPlayerTwo(), 2);

		assertThat(tennisGame.calculateGameScore(), CoreMatchers.is("Forty-Thirty"));

	}

	@Test
	public void playerOneShouldBeDeclaredAsWinnerWhenHeTakesMin4PointsInTotalAndMin2PointsMoreThanThePlayerTwo() {

		updatePlayerScoreBasedOnNumberOfPointsTaken(tennisGame.getPlayerOne(), 4);
		updatePlayerScoreBasedOnNumberOfPointsTaken(tennisGame.getPlayerTwo(), 2);

		assertThat(tennisGame.calculateGameScore(), CoreMatchers.is("Player One Wins"));

	}

	public void updatePlayerScoreBasedOnNumberOfPointsTaken(Player player, int numberOfPoints) {
		for (int index = 0; index < numberOfPoints; index++) {
			player.incrementPlayerScore();
		}
	}

}
