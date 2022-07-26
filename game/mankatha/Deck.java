package game.mankatha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private static final int TOTAL_CARD_NUMBER = 52;
	private List<Card> deckOfCards;

	public Deck() {
		deckOfCards = new ArrayList<>(TOTAL_CARD_NUMBER);
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deckOfCards.add(new Card(j, i));
			}
		}

	}

	public List<Card> getDeckOfCards() {
		return deckOfCards;
	}

	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}

	public Card deal() {
		Card card = deckOfCards.remove(0);
		return card;

	}

	public void reset() {

		deckOfCards = new ArrayList<>(TOTAL_CARD_NUMBER);
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deckOfCards.add(new Card(j, i));
			}
		}

	}
}
