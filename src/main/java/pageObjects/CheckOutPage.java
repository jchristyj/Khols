package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class CheckOutPage extends AbstractComponents{
	
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		//initialization code
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	/*@FindBy(xpath="//button[@id='button-panel1099")
	WebElement guestCheckOutButton;
	
	By guestCheckOutButtonBy=By.xpath("//button[@id='button-panel1099']");
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName ;
	
	@FindBy(name="phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(name="emailId")
	WebElement emailId;*/
	
	
	@FindBy(id="signinEmail")
	WebElement loginEmail;
	
	@FindBy(id="panel1096")
	WebElement loginPassword;
	
	
		public void userDetails(String userEmail,String userPassword) throws InterruptedException {
		
			//waitUntilElementIsClickable(guestCheckOutButtonBy);
			//guestCheckOutButton.click();
			//firstName.sendKeys(userFirstName);
			//lastName.sendKeys(userSecNamr);
			//phoneNumber.sendKeys(phNum);
			//emailId.sendKeys(ID);
			Thread.sleep(5000);
			loginEmail.sendKeys(userEmail);
			loginPassword.sendKeys(userPassword);
			
			
			
	}
}
