package Home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Payee_Add extends BaseTest {
	
	@Test
	public void Payee_Add() throws InterruptedException 
	{
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
	        Thread.sleep(2000);
	        AddressWire.sendKeys("apple");
            Thread.sleep(2000);	      
		    AddressWire.sendKeys(Keys.ARROW_DOWN);
		    AddressWire.sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
	   	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); // clicking next
		    driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[3]/mat-dialog-actions[1]/button[2]/span[1]")).click();  //clicking save	    
	        Thread.sleep(2000);


}
}