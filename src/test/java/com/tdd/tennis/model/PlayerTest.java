package com.tdd.tennis.model;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import com.tdd.tennis.TennisGame;

public class PlayerTest {

	Player playerOne;
	Player playerTwo;

	@Before
	public void initialize() {
		playerOne = new Player();
		playerOne.setPlayerName("Player One");
		playerTwo = new Player();
		playerTwo.setPlayerName("Player Two");
	}

	@Test
	public void shouldBeAbleToSetAndRetrieveThePlayerOneScore() {

		playerOne.setScoredPoint(0);

		assertThat(playerOne.getScoredPoint(), CoreMatchers.is(0));
	}

	@Test
	public void shouldBeAbleToSetAndRetrieveThePlayerTwoScore() {

		playerTwo.setScoredPoint(0);

		assertThat(playerTwo.getScoredPoint(), CoreMatchers.is(0));
	}

	@Test
	public void shouldBeAbleToRetrieveThePlayerName() {

		assertThat(playerOne.getPlayerName(), CoreMatchers.is("Player One"));

		assertThat(playerTwo.getPlayerName(), CoreMatchers.is("Player Two"));

	}
}
