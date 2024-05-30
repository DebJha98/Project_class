package ExtendsReport;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Script1 {
	@Test
	public void launch() {
		WebDriver driver;
		LocalDateTime dateTime= LocalDateTime.now();
		String date = dateTime.toString().replace(":", "-");
		Screenshot ss= new Screenshot();  // Screenshot is coming from Screenshot Class so here we are creating a object of Screenshot to use here
		ExtentReports reports= new ExtentReports();
		ExtentSparkReporter extentSparkReporter= new ExtentSparkReporter("./Report/"+date+".html");
		reports.attachReporter(extentSparkReporter);
		ExtentTest test= reports.createTest("Login_Check");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO, "browser is maximised");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "demowebshop application is launched");
		driver.findElement(By.partialLinkText("Log in")).click();
		test.log(Status.INFO, "login page is displayed");
		driver.findElement(By.id("Email")).sendKeys("d12345j@gmail.com");
		test.log(Status.INFO, "user entered email");
		driver.findElement(By.id("Password")).sendKeys("toppa123456");
		test.log(Status.INFO, "user has entered password");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		test.log(Status.INFO, "user has clicked on login button");
		try {
			if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());
			}
		}catch(Exception e) {
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());
			}
		reports.flush();
		driver.close();
		}
	

}
