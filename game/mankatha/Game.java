package game.mankatha;

import java.util.List;

public class Game {

	/*
	 * You probably also need a Game class that contains a findWinner() method that
	 * checks if the current dealt card represents any player winning, which can
	 * help you decide the winner of the current round, set the new host, and
	 * continue the game.
	 */

	private Deck deck;

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Game() {
		super();
		deck = new Deck();
	}

	public Player findWinner(List<Player> players) {

		Player hostPlayer = findHostPlayer(players);

//		Card topCard = deck.deal();
		int size = deck.getDeckOfCards().size();
		System.out.println(size);
		boolean isFoundWinner = false;

		while (size-- > 0) {
			Card card = deck.deal();
			for (Player p : players) {
				if (!p.equals(hostPlayer)) {
					if (size % 2 == 1 && p.getChosenOrientation().equalsIgnoreCase("In")) {
						if (card.getRank() == card.getRank() && card.getSuit() == card.getSuit()) {
							isFoundWinner = true;
							System.out.println(p.getPlayerName() + " Wins");
							hostPlayer.setHost(false);
							p.setHost(true);
							int updatedCoin = findUpdatedCoin(players, p);
							p.setBetValue(0);
							p.setCoins(updatedCoin);
							return p;

						}
					} else if (size % 2 == 0 && p.getChosenOrientation().equalsIgnoreCase("Out")) {
						if (card.getRank() == card.getRank() && card.getSuit() == card.getSuit()) {
							isFoundWinner = true;
							System.out.println(p.getPlayerName() + " Wins");
							hostPlayer.setHost(false);
							p.setHost(true);
							int updatedCoin = findUpdatedCoin(players, p);
							p.setBetValue(0);
							p.setCoins(updatedCoin);
							return p;

						}
					}

				}
			}
		}

		if (isFoundWinner == false) {
			System.out.println(hostPlayer.getPlayerName() + " Wins");

			int updatedCoin = findUpdatedCoin(players, hostPlayer);
			hostPlayer.setBetValue(0);
			hostPlayer.setCoins(updatedCoin);
			return hostPlayer;
		} else
			return null;

	}

	private int findUpdatedCoin(List<Player> players, Player p) {
		int currentCoin = p.getCoins();
		for (Player p1 : players) {
			if (!p.equals(p1)) {
				int playerBetValue = p1.getBetValue();
				p1.setBetValue(0);
				currentCoin += playerBetValue;
				p1.setCoins(p1.getCoins() - playerBetValue);

			}
		}
		return currentCoin;
	}

	private Player findHostPlayer(List<Player> players) {
		for (Player p : players) {
			if (p.isHost())
				return p;
		}
		return null;
	}

}
