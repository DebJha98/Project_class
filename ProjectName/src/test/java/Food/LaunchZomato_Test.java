package Food;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchZomato_Test {
	@Test
	public void zomato() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(" Window maximised");
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
