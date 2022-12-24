package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("INDEX")).click();
		Thread.sleep(5000);
		
		//back to default position
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("ActualMain")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		
	}

}
