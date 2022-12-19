package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import rough.Reader;

public class TestBase {
	public static WebDriver driver;
	public static String browser=Reader.configReader("browser");
	public static String url=Reader.configReader("url");
	public static String username=Reader.configReader("username");
	public static String password=Reader.configReader("password");

	@BeforeSuite
	public void setUp() {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		System.out.println("Browser setup completed");

	}

	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}

	}
}
