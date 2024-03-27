package Home_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	static WebDriver driver;
	
	@BeforeClass
	@Parameters({"URL_Home"})
	public void setup(String URL_Home)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASLAH KHAN\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(String.valueOf(URL_Home));
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
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