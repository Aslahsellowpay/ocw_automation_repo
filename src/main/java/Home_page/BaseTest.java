package Home_page;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected static WebDriver driver;
	
	@BeforeClass
	@Parameters({"URL_Home"})
	public void setup(String URL_Home) throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASLAH KHAN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//driver=new ChromeDriver();
		
		 ChromeOptions options = new ChromeOptions();        
         URL hubUrl = new URL("http://localhost:4444/wd/hub");  
          driver = new RemoteWebDriver(hubUrl, options);
		
		driver.get(String.valueOf(URL_Home));
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(17));
	        wait.until(ExpectedConditions.urlToBe(URL_Home));
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		  WebElement email =  driver.findElement(By.xpath("//*[@id=\"sign_up_left_body\"]/div/div[1]/form/div[1]/input"));
	      WebElement password =  driver.findElement(By.xpath("//*[@id=\"password\"]"));
	      WebElement signinButton =  driver.findElement(By.xpath("//*[@id=\"sign_up_left_body\"]/div/div[2]/button"));
		email.sendKeys("Aslah786@gmail.com");
		password.sendKeys("Tyler!123");
		signinButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	            
	        }
		 WebElement Dark = driver.findElement(By.xpath("//app-header-v35/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]/fa-icon[1]"));
		 Dark.click();
		 try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	            
	        }
		 
		 
		 /*	 WebElement companyselect = driver.findElement(By.id("name"));
			companyselect.click();	
			*/

}
	@AfterClass
	public void tearDown()
	{
		
	
	        driver.quit();
		
}
}