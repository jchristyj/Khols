package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class SearchPage extends AbstractComponents{
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		//initialization code
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement userSearchText = driver.findElement(By.xpath("//input[@class='input-text']"));
	@FindBy(xpath="//input[@class='input-text']")
	WebElement userSearchText;
	
	@FindBy(css="div[class='dy-lb-close']")
	WebElement popup;
	
	By popUpBy=By.cssSelector("div[class='dy-lb-close']");
	
	@FindBy(xpath="//li[@id='K1000_1']")
	WebElement secondAutoSuggesstiveOption;
	
	public void SearchFunc(String userText) throws InterruptedException {
		Actions a=new Actions(driver);
		a.sendKeys(userSearchText, userText).build().perform();
		Thread.sleep(2000);
		secondAutoSuggesstiveOption.click();
		waitUntilElementIsVisible(popUpBy);
		popup.click();
		
		
	}
	
	public void goToUrl() {
		
		driver.get("https://www.kohls.com");
	}

}
