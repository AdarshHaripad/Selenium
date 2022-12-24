package SeleniumFirst;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyByPrimaryAndSec {

	public static void main(String[] args) {
		
	//	System.setProperty(null, null)
		
		System.setProperty("WebDriver.Edge.driver", ".\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		// web application
		driver.get("https://www.facebook.com/");
		
		//Primary and Secondary locator.
		
		// by id
		driver.findElement(By.id("email")).sendKeys("Renjith1@gmail.com");
		
		//by name
		driver.findElement(By.name("pass")).sendKeys("iuii");
		
		// by css selector
		driver.findElement(By.name("login")).click();
		
		//by linktext
		boolean Link= driver.findElement(By.linkText("Forgotten password?")).isDisplayed();
		
		
		
		if(Link==true) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images);
		
		driver.quit();
		
		
		
		
		
	}
}
