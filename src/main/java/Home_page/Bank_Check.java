package Home_page;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Bank_Check extends BaseTest {
 
	

	
/*	@Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	
	public void Bank_Check_DirectDeposit(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // Bank_Check_DirectDeposit
	{
		driver.get(String.valueOf(URL_Home));
         Thread.sleep(10000);	      
		  WebElement Payfrom = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));
		   Payfrom.click();
		   Thread.sleep(1000);
		    
		   driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
			    
	       WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
        WebElement PayAsCheck =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
        PayAsCheck.click();
        WebElement amount = driver.findElement(By.id("amount-input"));
	    amount.sendKeys(String.valueOf(amountvalue));
	    WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   BankAccount.sendKeys(String.valueOf(Bank_Name1));		   
	       Thread.sleep(2000);
	       
		   BankAccount.sendKeys(String.valueOf(Bank_Name2));	  
	       Thread.sleep(2000);
	      
		   BankAccount.sendKeys(String.valueOf(Bank_Name3));
		   Thread.sleep(4000);
	       
		   driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]")).click();
	        Thread.sleep(1000);
	        WebElement payee = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	        payee.click();

	        WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]"));
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
	            Bank_Check_DirectDeposit(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	  if(flag==0)  
	  {
     
	   WebElement DD = driver.findElement(By.xpath("//span[contains(text(),'Direct Deposit')]"));
	   DD.click();
	   Thread.sleep(3000);
	   WebElement ProcessNow= driver.findElement(By.xpath("//span[contains(text(),'Process Now')]"));
	   ProcessNow.click();
	   Thread.sleep(8000);
	   
	    PayeeDelete payeeDelete = new PayeeDelete();
		payeeDelete.Payee_Delete(URL_Home);
		
	   
	}

*/

	@Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	public void Bank_Check_Email(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // Bank_Check_send email
	{
		driver.get(String.valueOf(URL_Home));
	    Thread.sleep(5000);
	    WebElement Payfrom = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));
		   Payfrom.click();
		   Thread.sleep(1000);
		    
		   driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
			    
	       WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
     WebElement PayAsCheck =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
     PayAsCheck.click();
     WebElement amount = driver.findElement(By.id("amount-input"));
	    amount.sendKeys(String.valueOf(amountvalue));
	    WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   BankAccount.sendKeys(String.valueOf(Bank_Name1));		   
	       Thread.sleep(2000);
	       
		   BankAccount.sendKeys(String.valueOf(Bank_Name2));	  
	       Thread.sleep(2000);
	      
		   BankAccount.sendKeys(String.valueOf(Bank_Name3));
		   Thread.sleep(4000);
	       
		   driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]")).click();
	        Thread.sleep(1000);
	        WebElement payee = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	        payee.click();

	        WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]"));
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
	            Bank_Check_Email(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	  if(flag==0)  
	  {
     
	   WebElement Send = driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
	   Send.click();
	   WebElement Email1 = driver.findElement(By.xpath("//span[contains(text(),'Email')]"));
	   Email1.click();
	   Thread.sleep(5000);
	   WebElement SendEmail= driver.findElement(By.xpath("//span[contains(text(),'Send Email')]"));
	   SendEmail.click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	   Thread.sleep(10000);
	    PayeeDelete payeeDelete = new PayeeDelete();
		payeeDelete.Payee_Delete(URL_Home);
		
	   
	}
	  }
	
}
	
/*	@Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	
	public void Bank_Check_Save(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // Bank-check- save
	{
		   driver.get(String.valueOf(URL_Home));
		   Thread.sleep(5000);
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
		    Thread.sleep(1000);
		   
	        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
			    
	        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
       WebElement PayAsCheck =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
       PayAsCheck.click();
       WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
       amount.sendKeys(String.valueOf(amountvalue));
	   WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   BankAccount.sendKeys(String.valueOf(Bank_Name1));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name2));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name3));
	   Thread.sleep(4000);
	   
	   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   payee.click(); 
	   WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
	   New.click();
	   Thread.sleep(4000);
	   
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
	            Bank_Check_Save(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	  if(flag==0)  
	  {
     
	   WebElement Save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
	   Save.click();
	   Thread.sleep(5000);
	   PayeeDelete payeeDelete = new PayeeDelete();
	    payeeDelete.Payee_Delete(URL_Home);
			
		   
		}
		  }
	
	
	@Test
    @Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	public void Bank_Print_Check_Paper(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // Bank to print - print check paper
	{
		  driver.get(String.valueOf(URL_Home));
		  Thread.sleep(5000);
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
		    Thread.sleep(1000);
	        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
			    
	        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
       WebElement PayAsCheck =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
       PayAsCheck.click();
       WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
       amount.sendKeys(String.valueOf(amountvalue));
	   WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   BankAccount.sendKeys(String.valueOf(Bank_Name1));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name2));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name3));
	   Thread.sleep(4000);
	   
	   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
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
	            Bank_Print_Check_Paper(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}      
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	    if(flag==0)  
	  {
	    WebElement Print =driver.findElement(By.xpath("//span[contains(text(),'Print')]"));
	    Print.click();
	    Thread.sleep(2000);
	   WebElement PrintCheckPaper= driver.findElement(By.xpath("//span[contains(text(),'Print-Check Paper')]"));
	   PrintCheckPaper.click();
	   Thread.sleep(14000);
	    Set<String> handles = driver.getWindowHandles();
       
        for (String handle : handles) {
            driver.switchTo().window(handle);
        }

        // Perform actions in the new tab (if needed)
        // Close the new tab
        
        driver.switchTo().window(handles.toArray()[0].toString());
        Thread.sleep(2000);
	    PayeeDelete payeeDelete = new PayeeDelete();
		payeeDelete.Payee_Delete(URL_Home);
		
	   
	}
	  }
	
	@Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	public void Bank_Print_White_Paper(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // Bank to print - print White paper
	{
		driver.get(String.valueOf(URL_Home));
		 Thread.sleep(5000);
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
		    Thread.sleep(1000);
		   
	        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
			    
	        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
       WebElement PayAsCheck =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
       PayAsCheck.click();
       WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
       amount.sendKeys(String.valueOf(amountvalue));
	   WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   BankAccount.sendKeys(String.valueOf(Bank_Name1));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name2));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name3));
	   Thread.sleep(4000);
	   
	   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
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
	            Bank_Print_White_Paper(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}      
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	    if(flag==0)  
	  {
     
	   WebElement Print = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[5]/app-common-button-v35[3]/button[1]/div[1]/span[1]"));
	   Print.click();
	   try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	   WebElement PrintWhitePaper= driver.findElement(By.xpath("//span[contains(text(),'Print-White Paper')]"));
	   PrintWhitePaper.click();
	    try {
            Thread.sleep(14000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    Set<String> handles = driver.getWindowHandles();
	       
        for (String handle : handles) {
            driver.switchTo().window(handle);
        }
        
        driver.switchTo().window(handles.toArray()[0].toString());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    PayeeDelete payeeDelete = new PayeeDelete();
		payeeDelete.Payee_Delete(URL_Home);
		
	   
	}
	  }

    @Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	public void Bank_Check_Mail(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // Bank_Check_send Mail
	{
		driver.get(String.valueOf(URL_Home));
		Thread.sleep(5000);
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
		    Thread.sleep(1000);
		   
	        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]")).click();
			    
	        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
       WebElement PayAsCheck =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
       PayAsCheck.click();
       WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
       amount.sendKeys(String.valueOf(amountvalue));
	   WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   BankAccount.sendKeys(String.valueOf(Bank_Name1));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name2));
	   Thread.sleep(2000);
	   
	   BankAccount.sendKeys(String.valueOf(Bank_Name3));   
	   Thread.sleep(4000);
	   
	   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-check[1]/form[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
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
	            Bank_Check_Mail(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
	        }}      
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	    if(flag==0)  
	  {
     
     
	   WebElement Send = driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
	   Send.click();
	   WebElement Mail = driver.findElement(By.xpath("//span[contains(text(),'Mail')]"));
	   Mail.click();
	   Thread.sleep(8000);
	   WebElement MailNow= driver.findElement(By.xpath("//span[contains(text(),'Mail Now')]"));
	   MailNow.click();
	   driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	   Thread.sleep(20000);
	   
	    PayeeDelete payeeDelete = new PayeeDelete();
		payeeDelete.Payee_Delete(URL_Home);
		
	   
	}
	}
	}
	*/