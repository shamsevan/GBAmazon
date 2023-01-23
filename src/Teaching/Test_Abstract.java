package Teaching;

public class Test_Abstract extends Shape {

	public Test_Abstract() { System.out.println("Constructor of Test_Abstract Class");
	
	}


	
	public static void main(String[] args) {
	
		System.out.println("inside Main method of Test Abstract");
		Test_Abstract ob = new Test_Abstract();
		ob.drawing();
		
		
		
		
	}

	@Override
	void drawing() {
		// TODO Auto-generated method stub
		
	}
	
	

}
