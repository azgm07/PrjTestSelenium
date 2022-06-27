package Cucumber.PrjTestSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.PrjTestSelenium.PageObjects.*;	

public class StepDefinitions {
	
	//Variables
	WebDriver driver;
	
	//Definitions	
	@Given("^Start browser with Selenium Chrome$")
	public void start_selenium_chrome() throws Throwable
	{
		//Path to chromedriver
		String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
		System.out.println("Filepath");
		System.out.println(filePath);
		System.setProperty("webdriver.chrome.driver", filePath);
		
		//Chrome options
		ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless"); //For test is better with headless option
        options.addArguments("--disable-gpu");
        
		driver= new ChromeDriver(options);					
		driver.manage().window().maximize();			
		driver.get("http://sampleapp.tricentis.com/101/app.php");		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Wait until is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nextenterinsurantdata")));
	}
	
	@When("^Fill all required form fields and submit$")
	public void fill_required_fields() throws Throwable
	{
		//Thread.sleep(1000);
		VehicleDataTab vehicleDataTab = new VehicleDataTab(driver);
		vehicleDataTab.FillRequiredFields();
		vehicleDataTab.ClickEndButton();
		//Thread.sleep(1000);
		InsurantDataTab insurantDataTab = new InsurantDataTab(driver);
		insurantDataTab.FillRequiredFields();
		insurantDataTab.ClickEndButton();
		//Thread.sleep(1000);
		ProductDataTab productDataTab = new ProductDataTab(driver);
		productDataTab.FillRequiredFields();
		productDataTab.ClickEndButton();
		//Thread.sleep(1000);
		PriceOptionTab priceOptionTab = new PriceOptionTab(driver);
		priceOptionTab.FillRequiredFields();
		priceOptionTab.ClickEndButton();
		//Thread.sleep(1000);
		SendQuoteTab sendQuoteTab = new SendQuoteTab(driver);
		sendQuoteTab.FillRequiredFields();
		sendQuoteTab.ClickEndButton();
	}
	
	@Then("^Wait and check the alert for success$")
	public void verify_selector_exists() throws Throwable
	{
		AlertOverlay alertOverlay = new AlertOverlay(driver);
		boolean result = alertOverlay.CheckIfSuccess();
		driver.quit();
		assertEquals(true, result);
	}
}
