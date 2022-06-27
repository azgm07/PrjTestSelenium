package Cucumber.PrjTestSelenium.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuoteTab extends FormPageTab{
	
	//CONSTRUCTOR
	public SendQuoteTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<input id="email" name="E-Mail" type="email">
	//<input id="phone" name="Phone" type="text">
	//<input id="username" name="Username" type="text">
	//<input id="password" name="Password" type="password">
	//<input id="confirmpassword" name="Confirm Password" type="password">
	//<textarea id="Comments" name="Comments" cols="50" rows="5"></textarea>
	
	//Button send email
	//<button id="sendemail" name="Send E-Mail" data-type="S" type="button">« Send »</button>
	
	//Finished overlay root
	//<div class="sweet-alert showSweetAlert visible">

	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		// TODO Auto-generated method stub
	}

	@Override
	public void ClickFinishButton() {
		// TODO Auto-generated method stub		
	}
}
