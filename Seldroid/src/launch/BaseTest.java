package launch;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static WebDriver driver;
	public static String projPath = System.getProperty("user.dir");
	public static Properties prop;
	
	public static void init() throws Exception {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(projPath+"\\data.properties");
		prop.load(fis);
	}
	
	public static void launchBrowser(String browser) {
		
		if(prop.getProperty(browser).equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projPath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(prop.getProperty(browser).equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projPath+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String Url) {
		driver.get(prop.getProperty(Url));
	}
}
