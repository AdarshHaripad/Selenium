package SeleniumSecond;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstJUnitTestCase {
	
	public static WebDriver driver=new EdgeDriver();

	@Test
	public void test() {
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();

		driver.findElement(By.id("Button2")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String exptdMsg = "Enter username";

		String actualMsg = driver.switchTo().alert().getText(); //Switching to the alert window

		if (exptdMsg.equals(actualMsg)) {

			driver.switchTo().alert().accept();
			System.out.println("Test case passed for accept");
		} else {
			 driver.switchTo().alert().dismiss();
			 System.out.println("Test case passed for dismiss");
		}
		
		
	}
	@Before
	public void Openbrowser() {
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@After
	public void Closebrowser() {
		driver.close();	
	}

}
