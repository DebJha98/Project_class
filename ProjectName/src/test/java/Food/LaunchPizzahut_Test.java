package Food;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchPizzahut_Test {
	@Test
	public void pizza() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(" Window maximised");
		driver.get("https://www.pizzahut.co.in/");
		Thread.sleep(2000);
		driver.quit();
	}

}
