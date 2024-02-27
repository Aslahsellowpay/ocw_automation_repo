package Home_page;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Bank_WIre extends BaseTest {

	
	
	@Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	public void Bank_Wire_Processing(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // BANK - Wire - Processing
	{
		driver.get(String.valueOf(URL_Home));
		Thread.sleep(10000);
		WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
	    Payfrom.click();
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
		    
        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
        PayAs.click();
        Thread.sleep(1000);
        WebElement PayAsWire =driver.findElement(By.xpath("//span[contains(text(),'Wire')]"));
        PayAsWire.click();
        WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-acc-wire-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
	    amount.sendKeys(String.valueOf(amountvalue));
	  
	    WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-acc-wire-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	    BankAccount.sendKeys(String.valueOf(Bank_Name1));
	    Thread.sleep(2000);
		   BankAccount.sendKeys(String.valueOf(Bank_Name2));
		   Thread.sleep(2000);
		   BankAccount.sendKeys(String.valueOf(Bank_Name3));
		   Thread.sleep(4000);
	   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	   
	  
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-acc-wire-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   payee.click();
	   WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
	   New.click();
	   Thread.sleep(2000);
	   Payee_Add PayeeAdd = new Payee_Add();
	   PayeeAdd.Payee_Add();
	    
	    int flag=0; 
	    try {
	    	 WebElement oops = driver.findElement(By.xpath("//h2[contains(text(),'Oops!')]"));
		        if (oops.isDisplayed()) {
		        	flag = 1;

	         if(flag==1) {
	            WebElement Ok = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));      
	            Ok.click();
	            WebElement Close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
	            Close.click();	 
	            PayeeDelete payeeDelete = new PayeeDelete();
	    		payeeDelete.Payee_Delete(URL_Home);
	            driver.navigate().back();
	            Bank_Wire_Processing(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	  if(flag==0)  
	  {
	    WebElement Memo=driver.findElement(By.id("memo"));
	    Memo.sendKeys("Test");
	    WebElement Edit = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[3]/div[4]/div[1]/button[1]")); //clicking Bank account edit button
		   Edit.click();
		   Thread.sleep(3000);
		   WebElement ConfirmAccNo1 = driver.findElement(By.cssSelector("#AccNumber"));
		   ConfirmAccNo1.sendKeys("12345");
		   WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]")); //clicking Next button
		   Next.click();
		   Thread.sleep(1000);
		   WebElement Next1 = driver.findElement(By.xpath("//span[contains(text(),'Next')]")); //clicking Next button
		  Next1.click();
		   Thread.sleep(1000);
		   WebElement Update = driver.findElement(By.xpath("//span[contains(text(),'Update')]"));
			 Update.click();
			  Thread.sleep(5000);
	    WebElement wireNow = driver.findElement(By.xpath("//span[contains(text(),'Wire Now')]")); //clicking wire now
		   wireNow.click();
		   Thread.sleep(5000);
		    PayeeDelete payeeDelete = new PayeeDelete();
			payeeDelete.Payee_Delete(URL_Home);
					   
		}
		  }
	
	
	   @Test
	   @Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
		public void Bank_Wire_Save(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // BANK - Wire - Save
	   {
		   driver.get(String.valueOf(URL_Home));
		   Thread.sleep(10000);
			   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
			    Payfrom.click();
			    Thread.sleep(1000);
		        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
				    
		        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
		        PayAs.click();
		        Thread.sleep(1000);
		        WebElement PayAsWire =driver.findElement(By.xpath("//span[contains(text(),'Wire')]"));
		        PayAsWire.click();
		        WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-acc-wire-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
			    amount.sendKeys(String.valueOf(amountvalue));
			  
			    WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-acc-wire-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
			    BankAccount.sendKeys(String.valueOf(Bank_Name1));
			    Thread.sleep(2000);
				   BankAccount.sendKeys(String.valueOf(Bank_Name2));
				   Thread.sleep(2000);
				   BankAccount.sendKeys(String.valueOf(Bank_Name3));
				   Thread.sleep(4000);
			   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
			   
			  
			   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-acc-wire-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
			   payee.click();
			   WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
			   New.click();
			   Thread.sleep(2000);
			   Payee_Add PayeeAdd = new Payee_Add();
			   PayeeAdd.Payee_Add();
			    
			    int flag=0; 
			    try {
			    	 WebElement oops = driver.findElement(By.xpath("//h2[contains(text(),'Oops!')]"));
				        if (oops.isDisplayed()) {
				        	flag = 1;

			         if(flag==1) {
			            WebElement Ok = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));      
			            Ok.click();
			            WebElement Close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
			            Close.click();	 
			            PayeeDelete payeeDelete = new PayeeDelete();
			    		payeeDelete.Payee_Delete(URL_Home);
			            driver.navigate().back();
			            Bank_Wire_Save(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
			        }}
				        
			    }catch (org.openqa.selenium.NoSuchElementException e) {}
			    
			    
			  if(flag==0)  
			  {
			    WebElement Memo=driver.findElement(By.id("memo"));
			    Memo.sendKeys("Test");
			    WebElement Edit = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[3]/div[4]/div[1]/button[1]")); //clicking Bank account edit button
				   Edit.click();
				   Thread.sleep(3000);
			   WebElement ConfirmAccNo1 = driver.findElement(By.cssSelector("#AccNumber"));
			   ConfirmAccNo1.sendKeys("12345");
			   WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]")); //clicking Next button
			   Next.click();
			   Thread.sleep(1000);
			   WebElement Next1 = driver.findElement(By.xpath("//span[contains(text(),'Next')]")); //clicking Next button
			  Next1.click();
			  Thread.sleep(1000);
			   WebElement Update = driver.findElement(By.xpath("//span[contains(text(),'Update')]"));
				 Update.click();
			  Thread.sleep(5000);
	 
		   WebElement save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		   save.click();
		   Thread.sleep(5000);
		    PayeeDelete payeeDelete = new PayeeDelete();
			payeeDelete.Payee_Delete(URL_Home);
					   
		}
		}		  
}