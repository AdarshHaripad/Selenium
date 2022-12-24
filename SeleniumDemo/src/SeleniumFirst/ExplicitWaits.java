package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		// implicit wait===========> continously wait for 20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.cssSelector("#start > button")).click();

		String exptdMsg = "Hello World!";
		

		//Explicit Wait
		
		//  0.5sec....1sec.....1.5sec.....2.0sec
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(By.id("value")));
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		//0 ... 0.5 ..1 ...1.5 .... 10
		// pooling frequency .. .5 seconds
		
		String actMsg = driver.findElement(By.cssSelector("#finish > h4")).getText();
		System.out.println("Actual Message is :::::" + actMsg);
		if (exptdMsg.equals(actMsg)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

}
