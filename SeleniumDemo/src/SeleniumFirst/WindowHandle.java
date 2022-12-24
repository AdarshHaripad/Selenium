package SeleniumFirst;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/"); // parent window
		System.out.println("Window handle of facebook page is::" + driver.getWindowHandle());

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");

		driver.findElement(By.linkText("Instagram")).click(); // child window

		ArrayList<String> allwindow = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(allwindow.get(1));  //Switch the path to the child window

		driver.findElement(By.name("username")).sendKeys("567843");

		driver.switchTo().window(allwindow.get(0)); //Switching back to the parent window

		driver.findElement(By.id("pass")).sendKeys("paswrd789");

		}
	}

