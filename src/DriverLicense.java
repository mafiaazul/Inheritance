import java.time.LocalDate;

public class DriverLicense extends Card {

	private String DLNumber;
	private LocalDate ExpirationDate;

	public DriverLicense() {
		super();
	}

	public DriverLicense(String n, String DLNumber, LocalDate ExpirationDate) {
		super(n);
		setDLNumber(DLNumber);
		setExpirationDate(ExpirationDate);
	}

	public String getDLNumber() {
		return DLNumber;
	}

	public void setDLNumber(String dLNumber) {
		this.DLNumber = dLNumber;
	}

	public LocalDate getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.ExpirationDate = expirationDate;
	}

	public String format() {
		return super.format() + ", DL Number: " + DLNumber + ", Expiration Date: " + ExpirationDate;
	}

}
