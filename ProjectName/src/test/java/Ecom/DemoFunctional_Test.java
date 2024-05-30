package Ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFunctional_Test {
@Test
public void click() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(" Window maximised");
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.name("pollanswers-1")).click();
	driver.findElement(By.id("vote-poll-1")).click();
	Thread.sleep(2000);
	driver.close();
}
}
