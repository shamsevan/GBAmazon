package Interface_Concept;

public class TestBRowser {
	
	static WebDriver1 driver;

	public static void main(String[] args) {
		
		chromebrowser();
		EdgeBrowser();
		
	}
	
	
	public static void chromebrowser () {
		driver = new ChromeDriver1();
		driver.get_ulr("www.amazon.com");;
	
	}
	
	
	public static void EdgeBrowser() {
		driver = new Edgedriver1();
		driver.get_ulr("www.amazon.com");
		
	}

}
