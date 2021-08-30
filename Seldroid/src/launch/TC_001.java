package launch;

public class TC_001 extends BaseTest {

	public static void main(String[] args) throws Exception {
		
		init();
		launchBrowser("chromeDriver");
		navigateUrl("url");
	}

}
