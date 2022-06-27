package Cucumber.PrjTestSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Cucumber.PrjTestSelenium.PageObjects.*;	

public class StepDefinitions {
	
	//Variables
	WebDriver driver;
	
	//Definitions	
	@Given("^Start Selenium Chrome Driver$")
	public void start_selenium_chrome_driver() throws Throwable
	{
		//Path to chromedriver
		String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
		System.out.println("Filepath");
		System.out.println(filePath);
		System.setProperty("webdriver.chrome.driver", filePath);
		
		//Chrome options
		ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");     
        //options.addArguments("--disable-gpu");
        //options.addArguments("--window-size=1400,800"); 
        
		driver= new ChromeDriver(options);					
		driver.manage().window().maximize();			
		driver.get("http://sampleapp.tricentis.com/101/app.php");		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@When("^For each tab fill all required form fields and click next button$")
	public void navigate_to_url() throws Throwable
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
	
	@Then("^Wait and check for result message$")
	public void verify_selector_exists() throws Throwable
	{
		CheckWarning checkWarning = new CheckWarning(driver);
		boolean result = checkWarning.CheckIfSuccess();
		driver.quit();
		assertEquals(true, result);
	}
}
