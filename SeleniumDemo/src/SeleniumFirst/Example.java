package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example {

public static void main(String[] args) {
	System.setProperty("WebDriver.Edge.driver", ".\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Adarsh");
}
	
}
