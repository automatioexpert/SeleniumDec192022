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

public class T3 {

	@Test
	public void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uptodown-android.en.uptodown.com/android");
		driver.findElement(By.xpath("//a[contains(text(),'Publish your app')]")).click();
		System.out.println(driver.findElement(By.cssSelector("span.title")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Publish')]")).click();
		driver.findElement(By.cssSelector("a:nth-child(1) div:nth-child(1)")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'LOGIN')]")).getText());
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("steve3849347347");
		System.out.println(driver.findElement(By.cssSelector("input[name='username']")).getAttribute("value"));
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("P@3893437757375");
		System.out.println(driver.findElement(By.cssSelector("input[name='password']")).getAttribute("value"));
		System.out.println(driver.findElement(By.cssSelector("button[data-testid='big-button'] canvas")).getText());
		System.out.println("Test Case Passed");
		driver.quit();
	}

}
