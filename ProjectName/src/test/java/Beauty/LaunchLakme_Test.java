package Beauty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchLakme_Test {
@Test
public void lakmee() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(" Window maximised");
	driver.get("https://www.lakmeindia.com/");
	Thread.sleep(2000);
	driver.quit();
}
}
