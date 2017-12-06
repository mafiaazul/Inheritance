
public class YMCACard extends Card {

	private String IDNumber;

	public YMCACard() {
		super();
	}

	public YMCACard(String n, String IDNumber) {
		super(n);
		setIDNumber(IDNumber);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String IDNumber) {
		this.IDNumber = IDNumber;
	}
	
	public String format() {
		return super.format() + ", ID: " + IDNumber;
	}
	
}