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

public class CreditCard_to_VirtualCard extends BaseTest {
	
	@Test
	@Parameters({"amountvalue","CreditCard_Name1","CreditCard_Name2","CreditCard_Name3","URL_Home"})
	public void CreditCard_VirtualCard_Processing(String amountvalue,String CreditCard_Name1,String CreditCard_Name2,String CreditCard_Name3,String URL_Home) throws AWTException,InterruptedException // CreditCard - VirtualCard - Processing
	{
		driver.get(String.valueOf(URL_Home));
		   try {
	            Thread.sleep(8000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
	       WebElement CreditCard = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]"));
	       CreditCard.click();   
	       try {
	           Thread.sleep(1000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click();
        WebElement PayAsVirtualCard =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]/div[1]/span[1]"));
        PayAsVirtualCard.click();
        
        WebElement amount=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-virtual-card-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
	    amount.sendKeys(String.valueOf(amountvalue));
	    
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    
       WebElement SelectCARD= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-virtual-card-v3[1]/div[1]/div[2]/div[1]/app-cards-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
       SelectCARD.sendKeys(String.valueOf( CreditCard_Name1)); 
	   try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	   SelectCARD.sendKeys(String.valueOf( CreditCard_Name2));
	   try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	   SelectCARD.sendKeys(String.valueOf(CreditCard_Name3));
	   try {
           Thread.sleep(4000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	   driver.findElement(By.xpath("//div[contains(text(),'Master Card')]")).click();
	   
	   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-virtual-card-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   payee.click();
	   WebElement New = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
	   New.click();
	   try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	   WebElement PayeeName =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[2]/app-add-payee-modal-personal-details-comp[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
	   PayeeName.sendKeys("Zilmoney");
	   WebElement Email =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[2]/app-add-payee-modal-personal-details-comp[1]/form[1]/div[1]/div[2]/input[1]"));
       Email.sendKeys("Zil@gmail.com");	  	   	
	   WebElement Phone=driver.findElement(By.xpath("//input[@id='phone']"));
	   Phone.sendKeys("8585214562");
	   WebElement Address=driver.findElement(By.xpath("//p[contains(text(),'Address')]"));
	   Address.click();	   	
	   WebElement AddressLine1=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
	   AddressLine1.sendKeys("1 apple");
	   AddressLine1.sendKeys(Keys.ARROW_DOWN.ENTER);
	   WebElement BankDetailsButton=driver.findElement(By.xpath("//p[contains(text(),'Bank Account')]"));
	   BankDetailsButton.click();
	    WebElement BankHolderName=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]"));
	    BankHolderName.sendKeys("Tester");
	    WebElement RoutingNo=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[2]/input[1]"));
	    RoutingNo.sendKeys("011000015");
	    WebElement AccNo=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[3]/input[1]"));
	    AccNo.sendKeys("12345");
	    WebElement ConfirmAccNo=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[4]/input[1]"));
	    ConfirmAccNo.sendKeys("12345");
	    WebElement AccType=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[5]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	    AccType.click();
	    driver.findElement(By.xpath("//span[contains(text(),'CHECKING')]")).click(); //selecting  acc type from drop down
	    WebElement checkBox= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[1]/mat-checkbox[2]/div[1]/div[1]/input[1]")); // Wire check box clicking
	    checkBox.click();
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); //Next click
	    WebElement FirstName=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
	    FirstName.sendKeys("Test");
	    WebElement AddressWire=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/input[1]"));
	    AddressWire.sendKeys("1");
	    try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    AddressWire.sendKeys("apple");
	    try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    
	    AddressWire.sendKeys(Keys.ARROW_DOWN);
	    AddressWire.sendKeys(Keys.ENTER);
	    try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); // clicking next
	    driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[3]/mat-dialog-actions[1]/button[2]/span[1]")).click();  //clicking save
	    try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    WebElement Memo=driver.findElement(By.id("memo"));
        Memo.sendKeys("TEST");
        WebElement InvoiceNo=driver.findElement(By.id("invoiceNo"));
        InvoiceNo.sendKeys("12356");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
	            CreditCard_VirtualCard_Processing(amountvalue,CreditCard_Name1, CreditCard_Name2, CreditCard_Name3, URL_Home);
	        }}
		        
	    }catch (org.openqa.selenium.NoSuchElementException e) {}
	    
	    
	  if(flag==0)  
	  {
	   WebElement SendCard = driver.findElement(By.xpath("//span[contains(text(),'Send Card')]"));
	    SendCard.click();
	    try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
	    
	    
	    
	    
	    WebElement UploadInvoice=driver.findElement(By.xpath("//span[contains(text(),'Upload Invoice')]"));
	    UploadInvoice.click();
	    String jpgFilePath = "C:\\Users\\ASLAH KHAN\\Downloads\\invoice.jpg";
	    handleFileUpload(jpgFilePath);
	    try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    
	    WebElement Next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	    Next.click();
	    WebElement AddSignature=driver.findElement(By.xpath("//p[contains(text(),'Add Signature')]"));
	    AddSignature.click();
	    try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    WebElement ExistingSignature=driver.findElement(By.xpath("//span[contains(text(),'Existing Signature')]"));
	    ExistingSignature.click();
	    try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }	  
	    driver.findElement(By.xpath("//body/div[2]/div[4]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-upload-panel[1]/section[1]/div[3]/li[2]/div[1]/div[1]/div[1]/img[1]")).click(); //clicking the signature
	    try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }	  
	    WebElement Verify=driver.findElement(By.xpath("//span[contains(text(),'Verify')]"));
	    Verify.click();
	    try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    
	    
	    
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
		public void CreditCard_VirtualCard_Save(String amountvalue,String CreditCard_Name1,String CreditCard_Name2,String CreditCard_Name3,String URL_Home)  // CreditCard - VirtualCard -Save
		{
		 driver.get(String.valueOf(URL_Home));
			   try {
		            Thread.sleep(8000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
			    Payfrom.click();
		       WebElement CreditCard = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]"));
		       CreditCard.click();   
		       try {
		           Thread.sleep(1000);
		       } catch (InterruptedException e) {
		           e.printStackTrace();
		       }
		        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
		        PayAs.click();
	        WebElement PayAsVirtualCard =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]/div[1]/span[1]"));
	        PayAsVirtualCard.click();
	        
	        WebElement amount=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-virtual-card-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
		    amount.sendKeys(String.valueOf(amountvalue));
		    
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    
	       WebElement SelectCARD= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-virtual-card-v3[1]/div[1]/div[2]/div[1]/app-cards-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	       SelectCARD.sendKeys(String.valueOf( CreditCard_Name1));	      
		   try {
	           Thread.sleep(2000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
		   SelectCARD.sendKeys(String.valueOf( CreditCard_Name2));
		   try {
	           Thread.sleep(2000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
		   SelectCARD.sendKeys(String.valueOf(CreditCard_Name3));
		   try {
	           Thread.sleep(4000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
		   driver.findElement(By.xpath("//div[contains(text(),'Master Card')]")).click();
		   
		   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cards-virtual-card-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   payee.click();
		   WebElement New = driver.findElement(By.xpath("//span[contains(text(),'New')]"));
		   New.click();
		   try {
	           Thread.sleep(2000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
		   WebElement PayeeName =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[2]/app-add-payee-modal-personal-details-comp[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		   PayeeName.sendKeys("Zilmoney");
		   WebElement Email =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[2]/app-add-payee-modal-personal-details-comp[1]/form[1]/div[1]/div[2]/input[1]"));
	       Email.sendKeys("Zil@gmail.com");	  	   	
		   WebElement Phone=driver.findElement(By.xpath("//input[@id='phone']"));
		   Phone.sendKeys("8585214562");
		   WebElement Address=driver.findElement(By.xpath("//p[contains(text(),'Address')]"));
		   Address.click();	   	
		   WebElement AddressLine1=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		   AddressLine1.sendKeys("1 apple");
		   AddressLine1.sendKeys(Keys.ARROW_DOWN.ENTER);
		   WebElement BankDetailsButton=driver.findElement(By.xpath("//p[contains(text(),'Bank Account')]"));
		   BankDetailsButton.click();
		    WebElement BankHolderName=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]"));
		    BankHolderName.sendKeys("Tester");
		    WebElement RoutingNo=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[2]/input[1]"));
		    RoutingNo.sendKeys("011000015");
		    WebElement AccNo=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[3]/input[1]"));
		    AccNo.sendKeys("12345");
		    WebElement ConfirmAccNo=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[4]/input[1]"));
		    ConfirmAccNo.sendKeys("12345");
		    WebElement AccType=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[2]/div[5]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		    AccType.click();
		    driver.findElement(By.xpath("//span[contains(text(),'CHECKING')]")).click(); //selecting  acc type from drop down
		    WebElement checkBox= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[2]/div[1]/mat-checkbox[2]/div[1]/div[1]/input[1]")); // Wire check box clicking
		    checkBox.click();
		    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); //Next click
		    WebElement FirstName=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		    FirstName.sendKeys("Test");
		    WebElement AddressWire=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-bank-detail-modal[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/input[1]"));
		    AddressWire.sendKeys("1");
		    try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    AddressWire.sendKeys("apple");
		    try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    
		    AddressWire.sendKeys(Keys.ARROW_DOWN);
		    AddressWire.sendKeys(Keys.ENTER);
		    try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); // clicking next
		    driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[3]/mat-dialog-actions[1]/button[2]/span[1]")).click();  //clicking save
		    try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    WebElement Memo=driver.findElement(By.id("memo"));
	        Memo.sendKeys("TEST");
	        WebElement InvoiceNo=driver.findElement(By.id("invoiceNo"));
	        InvoiceNo.sendKeys("12356");
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
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
		            CreditCard_VirtualCard_Save(amountvalue,CreditCard_Name1, CreditCard_Name2, CreditCard_Name3, URL_Home);
		        }}
			        
		    }catch (org.openqa.selenium.NoSuchElementException e) {}
		    
		    
		  if(flag==0)  
		  {
		   WebElement Save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		   Save.click();
		    try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    		    		    		 		    		    		    
		    PayeeDelete payeeDelete = new PayeeDelete();
			payeeDelete.Payee_Delete(URL_Home);
			
		   
		}
		  }

}
