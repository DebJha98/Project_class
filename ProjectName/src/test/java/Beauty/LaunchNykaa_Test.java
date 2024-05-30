package Beauty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LaunchNykaa_Test {
	@Test
	public void nyka() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(" Window maximised");
		driver.get("https://www.nykaa.com/?root=logo");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
