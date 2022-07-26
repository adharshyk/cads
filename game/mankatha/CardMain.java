package game.mankatha;

import java.util.ArrayList;
import java.util.List;

public class CardMain {

	public static void main(String[] args) {
		Player player1 = new Player("Rohit", 50, new Card(Card.EIGHT, Card.CLUBS), "Out", 500, false);
		Player player2 = new Player("Adharsh", 100, new Card(Card.FOUR, Card.HEARTS), "In", 500, false);
		Player player3 = new Player("Kevin", 0, null, null, 500, true);

		List<Player> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);
		players.add(player3);

		Game game = new Game();
		Deck deck = game.getDeck();
		deck.shuffle();

//			System.out.println(shuffledCards);
		Player winner = game.findWinner(players);
		for (Player p : players) {
			System.out.println(p.isHost() + " " + p.getBetValue() + " " + p.getCoins() + " " + p.getPlayerName());
		}
		System.out.println(
				winner.isHost() + " " + winner.getBetValue() + " " + winner.getCoins() + " " + winner.getPlayerName());

		deck.reset();

	}

}
