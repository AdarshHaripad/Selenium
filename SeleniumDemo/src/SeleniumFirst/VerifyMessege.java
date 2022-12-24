package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyMessege {

	public static void main(String[] args) {
		
	//Environment setup
		
		WebDriver driver = new EdgeDriver();

		// web application called
		driver.get("https://www.facebook.com/login/");
		
		//WEbelement located
		driver.findElement(By.id("email")).sendKeys("adarsh@123");
		driver.findElement(By.id("pass")).sendKeys("aadarsh@1");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		/*
		
		
		
		
		

		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		

		
		
		
		// enter user name
		driver.findElement(By.id("email")).sendKeys("adarsh@123");

		// enter password
		driver.findElement(By.id("pass")).sendKeys("pass1");

		// click on login
		driver.findElement(By.name("login")).click();
        
		
		
		// message
		String exptdMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		
		String actMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		
		
		
		if (exptdMsg.equals(actMsg)) {
			System.out.println("Test case Passed");
		} else {
			System.out.println("Test case failed");
		}
		
		driver.close(); */
		
	}
}
