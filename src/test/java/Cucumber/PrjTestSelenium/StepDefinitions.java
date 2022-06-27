package Cucumber.PrjTestSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
	
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class StepDefinitions {
	
	//Variables
	WebDriver driver;
	
	//Definitions	
	@Given("^Start Selenium Chrome Driver$")
	public void start_selenium_chrome_driver() throws Throwable
	{
		String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
		System.out.println("Filepath");
		System.out.println(filePath);
		System.setProperty("webdriver.chrome.driver", filePath);					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://sampleapp.tricentis.com/101/app.php");		
	}
	
	@When("^For each tab fill all required form fields and click next button$")
	public void navigate_to_url() throws Throwable
	{
		System.out.println("This step to url and open the page.");
	}
	
	@Then("^Wait for success message in last tab$")
	public void verify_selector_exists() throws Throwable
	{
		System.out.println("This step verifies if the selector exists.");
	}
}
