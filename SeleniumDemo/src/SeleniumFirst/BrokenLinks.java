package SeleniumFirst;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	static int invalidLinkCount = 0;

public static void verifyUrl(String link) throws IOException {
	
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(link);
		HttpResponse response = client.execute(request);

		if (response.getCode() != 200) {
			System.out.println("Invalid Link ::" + link);
			invalidLinkCount++;
		}

	}

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// WebElement bottomSection =
		// driver.findElement(By.cssSelector("#pageFooterChildren > ul"));
		// List<WebElement> links = bottomSection.findElements(By.tagName("a"));

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement t : links) {

			String url = t.getAttribute("href");
			if (url != null) {
				verifyUrl(url);
			} else {
				invalidLinkCount++;
			}

		}

		System.out.println("Total invalid links is ::" + invalidLinkCount);

	}
}
