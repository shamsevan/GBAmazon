package Interface_Concept;

public class ChromeDriver1 implements WebDriver1 {
	
	public ChromeDriver1() {
		System.out.println("Chrome BRowser Opened");
	}

	@Override
	public void get_ulr(String URL) {
		System.out.println("Url will be opened in ChromeBRowser");
		
	}

	@Override
	public void click() {
		System.out.println("Click will be executed in ChromeBRowser");
		
		
	}

	@Override
	public void close() {
		System.out.println("chromebrowser will be called");
		
		
	}
	
	
}