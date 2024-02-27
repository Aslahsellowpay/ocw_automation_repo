package Home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudBnak_Wire_Domestic extends BaseTest{
	
	
	@Test
	@Parameters({"amountvalue","Bank_Name1","URL_Home"})
	public void CloudBank__Wire_Domestic(String amountvalue,String Bank_Name1,String URL_Home) throws InterruptedException 
	{
		
		driver.get(String.valueOf(URL_Home));
		   
	    Thread.sleep(10000);
	        
		WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
	    Payfrom.click();
	    
        Thread.sleep(1000);
     
        WebElement Cloudbank= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]/div[1]/span[1]"));
        Cloudbank.click(); 
        
        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
        PayAs.click(); 
       
        Thread.sleep(1000);
        
        WebElement PayAs_Wire_Domestic =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]"));
        PayAs_Wire_Domestic.click();
        
        WebElement amount=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cloud-wire-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
	    amount.sendKeys(String.valueOf(amountvalue));
	    WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cloud-wire-v3[1]/div[1]/div[3]/div[1]/app-cloud-account-dropdown-v35[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		BankAccount.sendKeys(String.valueOf(Bank_Name1));		 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//p[contains(text(),'Tyler petrolium')]")).click();
	    
	    WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cloud-wire-v3[1]/div[1]/div[3]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   payee.click(); 
		   WebElement New = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
		   New.click();
		   try {
	           Thread.sleep(2000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }	
		   
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
		            CloudBank__Wire_Domestic(amountvalue, Bank_Name1, URL_Home);
		        }}
			        
		    }catch (org.openqa.selenium.NoSuchElementException e) {}
		    
		    
		  if(flag==0)  
		  {
			 WebElement Memo = driver.findElement(By.xpath("//input[@id='memo']"));
			 Memo.sendKeys("Test");
		   WebElement Wire_Now = driver.findElement(By.xpath("//span[contains(text(),'Wire Now')]"));
		    Wire_Now.click();
	   	    Thread.sleep(6000);
	       
		    PayeeDelete payeeDelete = new PayeeDelete();
			payeeDelete.Payee_Delete(URL_Home);
			
		   
		}
	}}