package Teaching;

public class City_Bank implements US_Bank {

	@Override
	public void credit() {
		System.out.println("credit method from city_Bank");
	}

	@Override
	public void debit() {
		System.out.println("debit method from city_bank");
		
	}

	@Override
	public void Transfermoney() {
		System.out.println("Transfermoney from city bank ");
		
	}
	
	public void cashback() {
		
	}
     
}
