package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe" );
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikr\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.quit();
}
}
