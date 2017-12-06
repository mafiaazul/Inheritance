
public class DebitCard extends Card {

	private String CardNumber;
	private String PIN;
	
	public DebitCard() {
		super();
	}
	
	public DebitCard(String n, String CardNumber, String PIN) {
		super(n);
		setCardNumber(CardNumber);
		setPIN(PIN);
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String CardNumber) {
		this.CardNumber = CardNumber;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String PIN) {
		this.PIN = PIN;
	}
	
	public String format() {
		return super.format() + ", Card Number: " + CardNumber + ", PIN: " + PIN;
	}
}
