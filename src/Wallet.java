
public class Wallet {

	private Card card1 = new Card();
	private Card card2 = new Card();
	
	public void addCard(Card n) {
		if (card1 == null) {
			this.card1  = n;
		} else if (card2 == null) {
			card2 = n;
		}		
	}
	
	public String formatCards() {
		return "[ " + card1.format() + " | " + card2.format() + " ]";
	}
}
