package Ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoIntegration_Test {
@Test
public void search() {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(" Window maximised");
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
	driver.findElement(By.className("search-box-button")).click();
	driver.close();
	
}
}
