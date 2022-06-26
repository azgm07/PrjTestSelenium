package Cucumber.PrjTestSelenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

import org.openqa.selenium.By;		
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
	
	@Given("^Check opened form page$")
	public void check_form_page() throws Throwable
	{
		System.out.println("This Step checks if the page is opened in a form page");
	}

	@Given("^Check opened option page$")
	public void check_option_page() throws Throwable
	{
		System.out.println("This Step checks if the page is opened in the option page");
	}

	@Given("^Check opened email page$")
	public void check_email_page() throws Throwable
	{
		System.out.println("This Step checks if the page is opened in the email page");
	}	
	@When("^Navigate to url$")
	public void navigate_to_url() throws Throwable
	{
		System.out.println("This step to url and open the page.");
	}
	
	@When("^Fill all required form fields$")
	public void fill_form_fields() throws Throwable
	{
		System.out.println("This step fill form required fields.");
	}

	@When("^Select any option$")
	public void select_any_option() throws Throwable
	{
		System.out.println("This step select any option.");
	}

	@When("^Fill all required email fields$")
	public void fill_email_fields() throws Throwable
	{
		System.out.println("This step fill all email required fields.");
	}
	
	@Then("^Verify the existence of a selector$")
	public void verify_selector_exists() throws Throwable
	{
		System.out.println("This step verifies if the selector exists.");
	}
	 
	@Then("^Click next button$")
	public void click_next_button() throws Throwable
	{
		System.out.println("This step clicks on the next button.");
	}
	
	@Then("^Wait for success message$")
	public void wait_success_message() throws Throwable
	{
		System.out.println("This step waits until the success message show.");
	}

}
