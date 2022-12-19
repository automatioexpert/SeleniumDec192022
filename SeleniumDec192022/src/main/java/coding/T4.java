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

public class T4 {

	@Test
	public void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en.uptodown.com/developers-zone");
		driver.findElement(By.cssSelector("a[href*='sign'] div.button")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'DEVELOPERS')]")).getText());
		System.out.println(driver.findElement(By.cssSelector("input[name='email']")).getAttribute("value"));
		driver.quit();

	}

}
