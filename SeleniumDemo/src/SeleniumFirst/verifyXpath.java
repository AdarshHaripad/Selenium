package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class verifyXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.orbitz.com/");
		
		//By Xpath:Syntax:::>(//tagName[contains(@attributes, "value")[index]])
		driver.findElement(By.xpath("(//button[contains(@data-test-id,'select-link')])[1]")).getText();
		
		
	}

}
