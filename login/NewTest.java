package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr147457");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qYgapaz");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
  }
  
  @BeforeMethod
	public void launchBrowser(){	
	System.setProperty("webdriver.gecko.driver","C:\\Selenium Files\\Drivers\\geckodriver.exe");
	driver =new FirefoxDriver();
	
	driver.get("http://www.demo.guru99.com/V4/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
  @AfterMethod
	public void closeBrowser(){
		
		driver.close();
	}
}
