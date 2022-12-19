package coding;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {

	@Test
	public void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uptodown-android.en.uptodown.com/android");
		driver.findElement(By.cssSelector("div#search-button")).click();
		driver.findElement(By.cssSelector("input#buscador")).sendKeys("services" + Keys.ENTER);
		System.out.println(driver.findElement(By.cssSelector("h1#search-query-text")).getText());

		List<WebElement> items = driver.findElements(By.cssSelector("div.name"));
		for (WebElement item : items) {
			System.out.println(item.getText());
		}

		driver.quit();
	}

}
