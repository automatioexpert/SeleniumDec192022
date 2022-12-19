package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uptodown-android.en.uptodown.com/android");
		System.out.println(driver.findElement(By.xpath("//img[contains(@alt,'Download')]")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("h1#detail-app-name")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.detail")).getText());
		driver.quit();

	}

}
