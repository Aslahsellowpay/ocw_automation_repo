package Home_page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PayeeDelete extends BaseTest{
	
	@Test
	@Parameters({"URL_Home"})
	public void Payee_Delete(String URL_Home) 
	{
		driver.get(String.valueOf(URL_Home));
		   try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		   WebElement payees = driver.findElement(By.xpath("//span[contains(text(),'Payees')]"));
		   payees.click();
		   try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    WebElement Search = driver.findElement(By.id("search"));
		    Search.sendKeys("Zilmoney");
		    try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-payee-ocw-v35[1]/app-common-layout-v35[1]/div[1]/div[1]/app-payee-list-ocw-v35[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/i[1]")).click(); //clicking action button
		    driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();     //clicking Delete button
		    driver.findElement(By.xpath("//button[contains(text(),'Yes, Delete it!')]")).click();  //clicking "yes delete it"    
		    try {
		         Thread.sleep(2000);
		     } catch (InterruptedException e) {
		         e.printStackTrace();
		     }
		    int flag=0;
		   
		    try {
		    	 WebElement Confirm = driver.findElement(By.xpath("//h2[contains(text(),'Confirm')]"));
			        if (Confirm .isDisplayed()) {
			        	flag=1;
			        	
			        if (flag==1) {
			        	
		           
		        }}
			        
		    }catch (org.openqa.selenium.NoSuchElementException e) {}
		    		    		 	    		    
		 try {
	         Thread.sleep(5000);
	     } catch (InterruptedException e) {
	         e.printStackTrace();
	     }
		 
	}

	}

	
	