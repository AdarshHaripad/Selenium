package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize(); // maximizes the window

		WebElement drpdowncountry = driver.findElement(By.name("country"));

		Select value = new Select(drpdowncountry);
		
		
		value.selectByVisibleText("BAHRAIN");// used for both small and lengthy dropdown
		value.selectByIndex(8); // Used with small drop down
		value.selectByValue("AUSTRIA"); // used for both small and lengthy dropdown
	}

}
