import java.time.LocalDate;

public class WalletTesterRocha {

	public static void main(String[] args) {

		YMCACard card1 = new YMCACard("YMCA Card", "123");
		//DebitCard card2 = new DebitCard("Debit Card", "456", "2017");
		DriverLicense card3 = new DriverLicense("George Lucas", "IA789", LocalDate.of(2018, 07, 01));
		
		Wallet myWallet = new Wallet();
		myWallet.addCard(card1);
		myWallet.addCard(card3);

		System.out.println(myWallet.formatCards());
	}

}
