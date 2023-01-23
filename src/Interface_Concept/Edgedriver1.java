package Interface_Concept;


public class Edgedriver1 implements WebDriver1 {

	
	public Edgedriver1() {
		System.out.println("Edge browser opened ");
	}


	@Override
	public void get_ulr(String URL) {
		System.out.println("Url will be opened in EDGeBRowser");
		
	}

	@Override
	public void click() {
		System.out.println("Click will be executed in EdgeBRowser");
		
		
	}

	@Override
	public void close() {
		System.out.println("EDGEbrowser will be called");
		
		
	}

}
