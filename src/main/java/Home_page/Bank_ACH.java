package Home_page;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Bank_ACH extends BaseTest {

    @Test
    @Parameters({"amountvalue", "Bank_Name1", "Bank_Name2", "Bank_Name3", "URL_Home"})
    public void Bank_ACH_Processing(String amountvalue, String Bank_Name1, String Bank_Name2, String Bank_Name3, String URL_Home) throws InterruptedException {
        driver.get(String.valueOf(URL_Home));
        Thread.sleep(10000);

        WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
        Payfrom.click();
        Thread.sleep(1000);

        WebElement Bank_Acc_Selecting = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
        Bank_Acc_Selecting.click();

        WebElement PayAs = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));
        PayAs.click();
        Thread.sleep(1000);

        WebElement PayAsACH = driver.findElement(By.xpath("//span[contains(text(),'ACH / Direct Deposit')]"));
        PayAsACH.click();

        WebElement amount = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
        amount.sendKeys(String.valueOf(amountvalue));

        WebElement BankAccount = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
        BankAccount.sendKeys(String.valueOf(Bank_Name1));
        Thread.sleep(2000);

        BankAccount.sendKeys(String.valueOf(Bank_Name2));
        Thread.sleep(2000);

        BankAccount.sendKeys(String.valueOf(Bank_Name3));
        Thread.sleep(4000);

        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();

        WebElement payee = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
        payee.click();

        WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
        New.click();
        Thread.sleep(2000);

        Payee_Add PayeeAdd = new Payee_Add();
        PayeeAdd.Payee_Add();

        int flag = 0;
        try {
            WebElement oops = driver.findElement(By.xpath("//h2[contains(text(),'Oops!')]"));
            if (oops.isDisplayed()) {
                flag = 1;
                if (flag == 1) {
                    WebElement Ok = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
                    Ok.click();
                    WebElement Close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
                    Close.click();
                    PayeeDelete payeeDelete = new PayeeDelete();
                    payeeDelete.Payee_Delete(URL_Home);
                    driver.navigate().back();
                    Bank_ACH_Processing(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
                }
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle exception if needed
        }

        if (flag == 0) {
            WebElement ACH_Now = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[6]/app-common-button-v35[2]/button[1]"));
            ACH_Now.click();

            Thread.sleep(6000);

            PayeeDelete payeeDelete = new PayeeDelete();
            payeeDelete.Payee_Delete(URL_Home);
        }
    }

	@Test
	@Parameters({"amountvalue","Bank_Name1","Bank_Name2","Bank_Name3","URL_Home"})
	public void Bank_ACH_Save(String amountvalue,String Bank_Name1,String Bank_Name2,String Bank_Name3,String URL_Home) throws InterruptedException // BANK - ACH - save
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
	      
	        WebElement PayAsACH =driver.findElement(By.xpath("//span[contains(text(),'ACH / Direct Deposit')]"));
	        PayAsACH.click();
	        
	        WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
		    amount.sendKeys(String.valueOf(amountvalue));
					    

	       WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   BankAccount.sendKeys(String.valueOf(Bank_Name1));		   
	       Thread.sleep(2000);
	       
		   BankAccount.sendKeys(String.valueOf(Bank_Name2));		  
	       Thread.sleep(2000);
	      
		   BankAccount.sendKeys(String.valueOf(Bank_Name3));
		   Thread.sleep(4000);
	       
		   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	   
		   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
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
		            Bank_ACH_Save(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
		        }}
			        
		    }catch (org.openqa.selenium.NoSuchElementException e) {}
		    
		    
		  if(flag==0)  
		  {
			  WebElement Save = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[6]/app-common-button-v35[1]/button[1]"));
			    Save.click();
		    
		   Thread.sleep(6000);
	       
		    PayeeDelete payeeDelete = new PayeeDelete();
			payeeDelete.Payee_Delete(URL_Home);
		}
		  }
}  
		   
	  
	   
	
	
	/*@Test
	public void TC_4_Checking_payee_Details()    //Check whether the payee details are showing  after selecting the payee
	{
		driver.get("https://release-v35-staging.web.ocw.sebipay.com/v3/manage/home");
		   try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
	       driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]")).click();
			    
	       WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	       PayAs.click();
	       WebElement PayAsACH =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
	       PayAsACH.click();
		   WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   payee.click();
		   payee.sendKeys("AutomationTest");
		   try {
		          Thread.sleep(2000);
		      } catch (InterruptedException e) {
		          e.printStackTrace();
		      }
		   driver.findElement(By.xpath("//div[contains(text(),'AutomationTest')]")).click();
		   try {
		          Thread.sleep(3000);
		      } catch (InterruptedException e) {
		          e.printStackTrace();
		      }
		   WebElement PayeeDetails = driver.findElement(By.xpath("//span[contains(text(),'Payee Details')]"));
		   Assert.assertTrue(PayeeDetails.isDisplayed(),"Expected text is not displayed after selecting the payee");
		     }

	@Test
	public void TC_5_Checking_Payment_Details()  //Check whether the payment details  are showing  after entering amount
    {
	   driver.get("https://release-v35-staging.web.ocw.sebipay.com/v3/manage/home");
	   try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
		    Payfrom.click();
	       driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]")).click();
			    
	       WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	       PayAs.click();
	       WebElement PayAsACH =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
	       PayAsACH.click();
	       WebElement amount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
		    amount.sendKeys("35");
		   try {
		          Thread.sleep(3000);
		      } catch (InterruptedException e) {
		          e.printStackTrace();
		      }
		   WebElement PayementDetails = driver.findElement(By.xpath("//h1[contains(text(),'Payment Details')]"));
		   Assert.assertTrue(PayementDetails.isDisplayed(),"Expected text is not displayed after entering the amount");
	}
	
	@Test
	public void TC_6_popup_checking_Not_Verified_Bank_selection()  //Check whether the popup is showing when selecting not verified  bank accounts
	{
		driver.get("https://release-v35-staging.web.ocw.sebipay.com/v3/manage/home");
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
	    Payfrom.click();
       driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]")).click();
		    
       WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
       PayAs.click();
       WebElement PayAsACH =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
       PayAsACH.click();
       WebElement Selectbank =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	   Selectbank.sendKeys("Au");
	   try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	  WebElement popup = driver.findElement(By.xpath("//h3[contains(text(),'Please verify your bank account')]"));
	  Assert.assertTrue(popup.isDisplayed(),"Expected text is not displayed ");
	  WebElement ClickCancel = driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
	  ClickCancel.click();
	 }

@Test
public void TC_7_popup_checking_Not_Approved_ACH_Bank_selection()  //Check whether the popup is showing when selecting not approved ACH bank accounts
{
	driver.get("https://release-v35-staging.web.ocw.sebipay.com/v3/manage/home");
	try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
   WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
    Payfrom.click();
   driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/span[1]")).click();
	    
   WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
   PayAs.click();
   WebElement PayAsACH =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
   PayAsACH.click();
   WebElement Selectbank =driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
   Selectbank.sendKeys("JCITY");
   try {
       Thread.sleep(5000);
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
   driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
  WebElement popup = driver.findElement(By.xpath("//h3[contains(text(),'This bank account is not approved for ACH. Please ')]"));
  Assert.assertTrue(popup.isDisplayed(),"Expected text is not displayed ");
  WebElement ClickCancel = driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
  ClickCancel.click();
}

*/	

