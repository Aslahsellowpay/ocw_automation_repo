package Home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudBank_InstantCloudTransfer extends BaseTest{
	
	@Test
	@Parameters({"amountvalue","Bank_Name1","URL_Home"})
	public void CloudBank_Instant_Transfer(String amountvalue,String Bank_Name1,String URL_Home) throws InterruptedException
	{
		driver.get(String.valueOf(URL_Home));
		   
	    Thread.sleep(10000);
	        
		WebElement Payfrom = driver.findElement(By.xpath("/html/body/app-root/app-content-layout-v35/div/div[2]/div[2]/app-home-v35/div/div/div/div[1]/app-payments-main-v35/div/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/ng-select/div/div/div[3]"));
	    Payfrom.click();
	          
        WebElement Cloudbank= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]/span[1]/div[1]/span[1]"));
        Cloudbank.click(); 
        
        WebElement PayAs= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[3]"));   
        PayAs.click();      
        
        WebElement PayAs_Cloud_instant =driver.findElement(By.xpath("//span[contains(text(),'Instant Cloud Transfer')]"));
        PayAs_Cloud_instant.click();
        
        WebElement amount=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cloud-intra-v3[1]/div[1]/div[1]/app-amount-input[1]/div[1]/input[1]"));
	    amount.sendKeys(String.valueOf(amountvalue));
	    WebElement BankAccount= driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cloud-intra-v3[1]/div[1]/div[3]/div[1]/app-cloud-account-dropdown-v35[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		BankAccount.sendKeys(String.valueOf(Bank_Name1));		 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//p[contains(text(),'Tyler petrolium')]")).click();
	    WebElement payee=driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-cloud-intra-v3[1]/div[1]/div[3]/div[3]/app-payee-dropdown-v3[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
		payee.sendKeys("XYZ");		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//body/app-root[1]/app-content-layout-v35[1]/div[1]/div[2]/div[2]/app-home-v35[1]/div[1]/div[1]/div[1]/div[1]/app-payments-main-v35[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]/div[1]/div[2]/div[1]")).click();
	    WebElement Memo=driver.findElement(By.id("memo"));
	    Memo.sendKeys("TEST");
	    Thread.sleep(4000);
	    WebElement PayNow=driver.findElement(By.xpath("//span[contains(text(),'Pay Now')]"));
	    PayNow.click();
	    Thread.sleep(8000);
	    
	}

}
