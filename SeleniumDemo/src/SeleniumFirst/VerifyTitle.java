package SeleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyTitle {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.enxcl.com/"); //Calling the application
		
		String ExpectedTitle="Home - enxcl Business Solutions, Trivandrum, Kochi, Haripad";
		
		String ActualTitle=driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Test case passed");
		}else
		{
			System.out.println("Test case failed");
		}
	}

}
