package Ecom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoEndToEnd_Test {
@Test
public void order() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
	System.out.println(" Window maximised");
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("d12345j@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("toppa123456");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
	Actions a = new Actions(driver);
	Thread.sleep(2000);
	WebElement sc = driver.findElement(By.xpath("//a[text()='Facebook']"));
	a.scrollToElement(sc);
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-500);"); 
	driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,500);"); 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	
	/*WebElement drop1 = driver.findElement(By.xpath("//select[@id='billing-address-select']"));
	Select ss = new Select(drop1);
	
	ss.selectByValue("New Address");
	
	WebElement drop = driver.findElement(By.xpath("//select[@name='BillingNewAddress.CountryId']"));
	Select s = new Select(drop);
	
	s.selectByValue("41");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Siliguri");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Subhaspally , Rajganj ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("789456");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("9800815039");
	Thread.sleep(1000);*/
	driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,500);"); 
	
	driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,100);"); 
	driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,100);"); 
	driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,900);"); 
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
}
}

