package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
		static WebDriver driver; 
		
		@Parameters("browser")
		@BeforeTest
		public WebDriver launchBrowser(String browser){
		String classPath=System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",classPath+"/lib/drivers/geckodriver.exe");
			driver =new FirefoxDriver();
			return driver;
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",classPath+"/lib/drivers/chromedriver.exe");
			driver =new ChromeDriver();
			return driver;
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver",classPath+"/lib/drivers/MicrosoftWebDriver.exe");
			driver =new EdgeDriver();
			return driver;
			}
		return null;
		}
		
		public void navigateToURL(){
			
			
		}
		
		@Test
		public void test(){
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr147457");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qYgapaz");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
		}
		
		@AfterTest
		public void closeBrowser(){
			
			driver.close();
		}
		
		

}
