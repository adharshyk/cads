package game.mankatha;

public class Player {

	private String playerName;
	private int betValue;
	private Card chosenCard;
	private String chosenOrientation;
	private int coins;

	private boolean isHost;

	public Player() {
		super();
	}

	public Player(String playerName, int betValue, Card chosenCard, String chosenOrientation, int coins,
			boolean isHost) {
		super();
		this.playerName = playerName;
		this.betValue = betValue;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
		this.coins = coins;
		this.setHost(isHost);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getBetValue() {
		return betValue;
	}

	public void setBetValue(int betValue) {
		this.betValue = betValue;
	}

	public Card getChosenCard() {
		return chosenCard;
	}

	public void setChosenCard(Card chosenCard) {
		this.chosenCard = chosenCard;
	}

	public String getChosenOrientation() {
		return chosenOrientation;
	}

	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", betValue=" + betValue + ", chosenCard=" + chosenCard
				+ ", chosenOrientation=" + chosenOrientation + ", coins=" + coins + "]";
	}

	public boolean isHost() {
		return isHost;
	}

	public void setHost(boolean isHost) {
		this.isHost = isHost;
	}

}
