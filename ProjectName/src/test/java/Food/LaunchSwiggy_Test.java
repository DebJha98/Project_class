package Food;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchSwiggy_Test {
@Test
public void swiggy() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(" Window maximised");
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	driver.quit();
}
}
