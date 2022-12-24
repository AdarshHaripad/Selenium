package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		// implicit wait(checking the availability of elements which should be filled&applicable to all elements)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		

		driver.findElement(By.cssSelector("#start > button")).click();

		String exptdMsg = "Hello World!";
		

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
