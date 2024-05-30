package Beauty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchSugar_Test {
@Test
public void sugar() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(" Window maximised");
		driver.get("https://in.sugarcosmetics.com/");
		Thread.sleep(2000);
		driver.quit();
}
}
