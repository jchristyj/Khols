package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddToCartPage;
import pageObjects.CheckOutPage;
import pageObjects.MyCartPage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;

public class StepDefinition {
	
	public WebDriver driver;
	
		@Given("user is on the search page")
		public void user_is_on_the_search_page() {					
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		SearchPage searchpage=new SearchPage(driver);
		searchpage.goToUrl();	
		}
		
		@When("user enter the searchText")
		public void user_enter_the_search_text() throws InterruptedException {
		String userText="womens dress";
		SearchPage searchpage=new SearchPage(driver);
		searchpage.SearchFunc(userText);
		searchpage.waitPeriod();
		}
		
		@When("user selects the second item from the product page")
		public void user_selects_the_second_item_from_the_product_page() {
		ProductPage productPage=new ProductPage(driver);
		productPage.scrollPageDown(); 
		productPage.product();
		
		}
		@When("user clicks on add to cart page")
		public void user_clicks_on_add_to_cart_page() {
		AddToCartPage addToCartPage=new AddToCartPage(driver);
		addToCartPage.scrollPageDown();
		addToCartPage.addTocart();
		}
		
		@When("user clicks on view my cart page")
		public void user_clicks_on_view_my_cart_page() throws InterruptedException {
		MyCartPage myCartPage=new MyCartPage(driver);
		myCartPage.waitPeriod();
		myCartPage.proceedToCheckOut();
		}
		
		@Then("user provides user details and payment option")
		public void user_provides_user_details_and_payment_option() {
		CheckOutPage  checkOutPage=new CheckOutPage(driver);
		checkOutPage.userDetails("Jancy","Johnson","123456789","jj@gmail.com");
		}




}
