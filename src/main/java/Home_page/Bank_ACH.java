package Home_page;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Bank_ACH extends BaseTest {

    @Test
    @Parameters({"amountvalue", "Bank_Name1", "Bank_Name2", "Bank_Name3", "URL_Home"})
    public void Bank_ACH_Processing(String amountvalue, String Bank_Name1, String Bank_Name2, String Bank_Name3, String URL_Home) throws InterruptedException {
        driver.get(String.valueOf(URL_Home));
        Thread.sleep(11000);

        WebElement Payfrom = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));
        Payfrom.click();
        Thread.sleep(1000);

        WebElement Bank_Acc_Selecting = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
        Bank_Acc_Selecting.click();

        WebElement PayAs = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));
        PayAs.click();
        Thread.sleep(1000);

        WebElement PayAsACH = driver.findElement(By.xpath("//span[contains(text(),'ACH / Direct Deposit')]"));
        PayAsACH.click();

        WebElement amount = driver.findElement(By.id("amount-input"));
        amount.sendKeys(String.valueOf(amountvalue));

        WebElement BankAccount = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
        BankAccount.sendKeys(String.valueOf(Bank_Name1));
        Thread.sleep(2000);

        BankAccount.sendKeys(String.valueOf(Bank_Name2));
        Thread.sleep(2000);

        BankAccount.sendKeys(String.valueOf(Bank_Name3));
        Thread.sleep(4000);

        driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]")).click();
        Thread.sleep(1000);
        WebElement payee = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/span[1]"));
        payee.click();

        WebElement New = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]"));
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
            
        }

        if (flag == 0) {
            WebElement ACH_Now = driver.findElement(By.xpath("//span[contains(text(),'ACH / DD Now')]"));
            ACH_Now.click();

            Thread.sleep(7000);

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
	       
			WebElement Payfrom = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));
		    Payfrom.click();		    
	        Thread.sleep(1000);
	    
	        WebElement Bank_Acc_Selecting = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]/div[1]/span[1]"));
	        Bank_Acc_Selecting.click();
			    
	        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
	        PayAs.click(); 
	        Thread.sleep(1000);
	      
	        WebElement PayAsACH =driver.findElement(By.xpath("//span[contains(text(),'ACH / Direct Deposit')]"));
	        PayAsACH.click();
	        
	        WebElement amount = driver.findElement(By.id("amount-input"));
		    amount.sendKeys(String.valueOf(amountvalue));
					    

	       WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[1]/app-bank-ac-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		   BankAccount.sendKeys(String.valueOf(Bank_Name1));		   
	       Thread.sleep(2000);
	       
		   BankAccount.sendKeys(String.valueOf(Bank_Name2));	  
	       Thread.sleep(2000);
	      
		   BankAccount.sendKeys(String.valueOf(Bank_Name3));
		   Thread.sleep(4000);
	       
		   driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]")).click();
	        Thread.sleep(1000);
	        WebElement payee = driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-bank-ac-ach-v3[1]/div[1]/div[2]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/span[1]"));
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
		            Bank_ACH_Save(amountvalue, Bank_Name1, Bank_Name2, Bank_Name3, URL_Home);
		        }}
			        
		    }catch (org.openqa.selenium.NoSuchElementException e) {}
		    
		    
		  if(flag==0)  
		  {
			  WebElement Save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			    Save.click();
		    
		   Thread.sleep(7000);
	       
		    PayeeDelete payeeDelete = new PayeeDelete();
			payeeDelete.Payee_Delete(URL_Home);
		}
		  }
}  
		   
	  
	   
	
	
	
