package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		

		act.contextClick(driver.findElement(By.cssSelector(
				"#container > div > div.1kfTjk > div._1rH5Jn > div._2Xfa2 > div._3_C9Hx > div > a:nth-child(1) > img")))
				.perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// drag and drop
		WebElement srcpillow = driver.findElement(By.id("pillow"));
		WebElement dessofa = driver.findElement(By.id("sofa"));

		// direct method
		act.dragAndDrop(srcpillow, dessofa).perform();

		// indirect method
	//	act.clickAndHold(srcpillow).moveToElement(dessofa).release().build().perform();
	}
}
