package SeleniumSecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class auto {

	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://forms.gle/DPieE3e9Eiu7iUTt7");
		driver.findElement(By.cssSelector("#mG61Hd > div.RH5hzf.RLS9Fe > div > div.o3Dpx > div:nth-child(1) > div > div > div.AgroKb > div > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("devika");
		driver.findElement(By.cssSelector("#mG61Hd > div.RH5hzf.RLS9Fe > div > div.o3Dpx > div:nth-child(2) > div > div > div.AgroKb > div > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Haripad");
		driver.findElement(By.cssSelector("#mG61Hd > div.RH5hzf.RLS9Fe > div > div.o3Dpx > div:nth-child(3) > div > div > div.AgroKb > div > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("7902926536");
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span/span")).click();
		
		driver.close();
	}
}
