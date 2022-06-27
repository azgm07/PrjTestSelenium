package Cucumber.PrjTestSelenium.PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuoteTab extends FormPageTab{
	
	//CONSTRUCTOR
	public SendQuoteTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<input id="email" name="E-Mail" type="email">
	private By inputEmailBy = By.id("email");
	
	//<input id="phone" name="Phone" type="text"> 
	//private By inputPhoneBy = By.id("phone"); //Not Required
	
	//<input id="username" name="Username" type="text">
	private By inputUsernameBy = By.id("username");
	
	//<input id="password" name="Password" type="password">
	private By inputPasswordBy = By.id("password");
	
	//<input id="confirmpassword" name="Confirm Password" type="password">
	private By inputConfirmPasswordBy = By.id("confirmpassword");
	
	//<textarea id="Comments" name="Comments" cols="50" rows="5"></textarea>
	//private By textareaCommentsBy = By.id("Comments"); //Not Required
	
	//Button send email
	//<button id="sendemail" name="Send E-Mail" data-type="S" type="button">« Send »</button>
	private By buttonSendEmailBy = By.id("sendemail");
	
	//Finished overlay root
	//<div class="sweet-alert showSweetAlert visible">

	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		InsertText(inputEmailBy,"test@test.info");
		InsertText(inputUsernameBy,"testuser");
		InsertText(inputPasswordBy,"TestPass123");
		InsertText(inputConfirmPasswordBy,"TestPass123");
	}

	@Override
	public void ClickEndButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(buttonSendEmailBy));
		ClickElement(buttonSendEmailBy);
	}
}
