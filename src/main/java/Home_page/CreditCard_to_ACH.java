package Home_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreditCard_to_ACH extends BaseTest {
	
	
	@Test
	@Parameters({"amountvalue","CreditCard_Name1","CreditCard_Name2","CreditCard_Name3","URL_Home"})
	public void CreditCard_ACH_Processing(String amountvalue,String CreditCard_Name1,String CreditCard_Name2,String CreditCard_Name3,String URL_Home) throws AWTException,InterruptedException // CreditCard - ACH - Processing
	{
		driver.get(String.valueOf(URL_Home));
		Thread.sleep(8000);
		
		WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
	    Payfrom.click();
       WebElement CreditCard = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]"));
       CreditCard.click();   
       Thread.sleep(1000);
       
        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
        PayAs.click();
        WebElement PayAsACH =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
        PayAsACH.click();
        
        WebElement amount=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-ach-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
	    amount.sendKeys(String.valueOf(amountvalue));
	    
	    Thread.sleep(2000);
	    
       WebElement SelectCARD= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-ach-v3[1]/div[1]/div[2]/div[1]/app-cards-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
       SelectCARD.sendKeys(String.valueOf( CreditCard_Name1));            
       Thread.sleep(2000);
       
	   SelectCARD.sendKeys(String.valueOf( CreditCard_Name2));
	   Thread.sleep(2000);
	   
	   SelectCARD.sendKeys(String.valueOf(CreditCard_Name3));
	   Thread.sleep(4000);
	   
	   driver.findElement(By.xpath("//div[contains(text(),'Master Card')]")).click();
	   
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   payee.click();
	   WebElement New = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
	   New.click();
	   Thread.sleep(2000);
	   
	   Payee_Add PayeeAdd = new Payee_Add();
       PayeeAdd.Payee_Add();
       Thread.sleep(2000);
       
	    WebElement Memo=driver.findElement(By.id("memo"));
        Memo.sendKeys("TEST");
        WebElement InvoiceNo=driver.findElement(By.id("invoiceNumber"));
        InvoiceNo.sendKeys("12356");
        Thread.sleep(3000);
        
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
	            CreditCard_ACH_Processing(amountvalue,CreditCard_Name1, CreditCard_Name2, CreditCard_Name3, URL_Home);
	        }}
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	  if(flag==0)  
	  {
	  
		  WebElement ACHnow = driver.findElement(By.xpath("//span[contains(text(),'ACH / DD Now')]"));
	   ACHnow .click();
	   Thread.sleep(5000);
	    	 	    
	    
	    WebElement UploadInvoice=driver.findElement(By.xpath("//span[contains(text(),'Upload Invoice')]"));
	    UploadInvoice.click();
	    String jpgFilePath = "C:\\Users\\ASLAH KHAN\\Downloads\\invoice.jpg";
	    handleFileUpload(jpgFilePath);
	    Thread.sleep(3000);
	    
	    WebElement Next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	    Next.click();
	    WebElement AddSignature=driver.findElement(By.xpath("//p[contains(text(),'Add Signature')]"));
	    AddSignature.click();
	    Thread.sleep(1000);
	    
	    WebElement ExistingSignature=driver.findElement(By.xpath("//span[contains(text(),'Existing Signature')]"));
	    ExistingSignature.click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//body/div[2]/div[4]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-upload-panel[1]/section[1]/div[3]/li[2]/div[1]/div[1]/div[1]/img[1]")).click(); //clicking the signature
	    Thread.sleep(1000);
	    
	    WebElement Verify=driver.findElement(By.xpath("//span[contains(text(),'Verify')]"));
	    Verify.click();
	    Thread.sleep(7000);
	    	   	    
	    PayeeDelete payeeDelete = new PayeeDelete();
		payeeDelete.Payee_Delete(URL_Home);
		
	   
	}
	  }
	
	 private void handleFileUpload(String filePath) throws AWTException, InterruptedException {
	        // Set the file path to the clipboard
	        StringSelection selection = new StringSelection(filePath);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	        // Create Robot instance
	        Robot robot = new Robot();

	        // Delay to ensure that the file dialog has opened
	        Thread.sleep(2000);

	        // Press Ctrl+V to paste the file path
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        // Delay to ensure that the file path is pasted
	        Thread.sleep(2000);

	        // Press Enter to confirm the file upload
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }
	 
	 @Test
		@Parameters({"amountvalue","CreditCard_Name1","CreditCard_Name2","CreditCard_Name3","URL_Home"})
		public void CreditCard_ACH_Save(String amountvalue,String CreditCard_Name1,String CreditCard_Name2,String CreditCard_Name3,String URL_Home) throws InterruptedException  // CreditCard - ACH -Save
		{
		 driver.get(String.valueOf(URL_Home));
		 Thread.sleep(8000);
		 
				WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
			    Payfrom.click();
		       WebElement CreditCard = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]"));
		       CreditCard.click();   
		       Thread.sleep(1000);
		       
		        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
		        PayAs.click();
		        WebElement PayAsACH =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
		        PayAsACH.click();
	        
	        WebElement amount=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-ach-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
		    amount.sendKeys(String.valueOf(amountvalue));
		    
		    Thread.sleep(2000);
		    
	       WebElement SelectCARD= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-ach-v3[1]/div[1]/div[2]/div[1]/app-cards-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	       SelectCARD.sendKeys(String.valueOf( CreditCard_Name1));	       	      
	       Thread.sleep(2000);
	       
		   SelectCARD.sendKeys(String.valueOf( CreditCard_Name2));
		   Thread.sleep(2000);
		   
		   SelectCARD.sendKeys(String.valueOf(CreditCard_Name3));
		   Thread.sleep(4000);
		   
		   driver.findElement(By.xpath("//div[contains(text(),'Master Card')]")).click();
		   
		   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   payee.click();
		   WebElement New = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
		   New.click();
		   Thread.sleep(2000);
		   
		   Payee_Add PayeeAdd = new Payee_Add();
	        PayeeAdd.Payee_Add();
	        Thread.sleep(2000);
	        
	        
		    WebElement Memo=driver.findElement(By.id("memo"));
	        Memo.sendKeys("TEST");
	        WebElement InvoiceNo=driver.findElement(By.id("invoiceNumber"));
	        InvoiceNo.sendKeys("12356");
	        Thread.sleep(3000);
	        
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
		            CreditCard_ACH_Save(amountvalue,CreditCard_Name1, CreditCard_Name2, CreditCard_Name3, URL_Home);
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
		  }
