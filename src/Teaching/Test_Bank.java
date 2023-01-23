package Teaching;

public class Test_Bank {
   static US_Bank ob1;
	public static void main(String[] args) {
		US_Bank ob1= new City_Bank();
		
		
		ob1.credit();
		ob1.debit();	
		ob1.Transfermoney();
		
		sum();


	}
	
	
	public static void sum() {
		US_Bank ob1= new TD_Bank();
		ob1.credit();
	}

}
