package Home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Adding_International_BankAccount extends BaseTest {
	
	@Test
	public void Adding__International_BankAccount() throws InterruptedException {
		    WebElement International_Account =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[2]/section[1]/div[2]/button[1]"));
		    International_Account.click();
		    WebElement AccountNo_IBAN =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		    AccountNo_IBAN.sendKeys("123456");		    
		    WebElement Bank_Identifier =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[1]/div[2]/select[1]"));		    
		    Select Swift = new Select(Bank_Identifier);	 
		    Swift.selectByVisibleText("Swift");
		    WebElement Bank_Identifier_Code =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[1]/div[3]/input[1]"));
		    Bank_Identifier_Code.sendKeys("AXISINBB");			  
		    WebElement Account_Type =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[1]/div[4]/select[1]"));
		    Select Personal = new Select(Account_Type);	 
		    Personal.selectByVisibleText("Personal");		    
		    WebElement Bank_Name =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]"));
		    Bank_Name.sendKeys("Test");
		    
		    WebElement Address_Line1 =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]"));
		    Address_Line1.sendKeys("Kartavya path");
		    WebElement City=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[2]/div[3]/input[1]"));
		    City.sendKeys("New Delhi");
		    WebElement state=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[2]/div[4]/input[1]"));
		    state.sendKeys("DL");
		    WebElement Zip=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[2]/div[5]/input[1]"));
		    Zip.sendKeys("110001");
		    WebElement Country =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[2]/div[6]/select[1]"));		    
		    Select India = new Select(Country);	 
		    India.selectByVisibleText("India");
		    
		    WebElement Address_Line11 =driver.findElement(By.id("addressLine1"));
		    Address_Line11.sendKeys("Kartavya path");
		    WebElement City1=driver.findElement(By.id("city"));
		    City1.sendKeys("New Delhi");
		    WebElement state1=driver.findElement(By.id("state"));
		    state1.sendKeys("DL");
		    WebElement Zip1=driver.findElement(By.id("zip"));
		    Zip1.sendKeys("110001");
		    WebElement Country1 =driver.findElement(By.id("country"));
		    Select India1 = new Select(Country1);	 
		    India1.selectByVisibleText("India");
		    WebElement IFSC_code =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[2]/div[1]/div[6]/input[1]"));
		    IFSC_code.sendKeys("12345");		    		    
		    WebElement Add=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/app-add-payee-international-bank-account[1]/div[1]/form[1]/div[3]/mat-dialog-actions[1]/button[1]"));
		    Add.click();
		    WebElement Update=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-add-payee-modal[1]/div[1]/form[1]/div[1]/div[3]/mat-dialog-actions[1]/button[2]"));
		    Update.click();
		    Thread.sleep(2000);
		  
		    
		
	}
}
