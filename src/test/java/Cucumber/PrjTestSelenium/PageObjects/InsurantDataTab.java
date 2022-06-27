package Cucumber.PrjTestSelenium.PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsurantDataTab extends FormPageTab{
	
	//CONSTRUCTOR
	public InsurantDataTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<input id="firstname" name="First Name" type="text">
	private By inputFirstNameBy = By.id("firstname");
	
	//<input id="lastname" name="Last Name" type="text">
	private By inputLastNameBy = By.id("lastname");
	
	//<input id="birthdate" name="Date of Birth" type="text" placeholder="MM/DD/YYYY" class="datepicker hasDatepicker">
	private By inputDateOfBirthBy = By.id("birthdate");
	
	//Gender Radios
	//<input id="gendermale" name="Gender" type="radio" value="Male" style="position: absolute; left: -9999px;">
	private By inputGenderMaleBy = By.id("gendermale");	
	//<input id="genderfemale" name="Gender" type="radio" value="Female" style="position: absolute; left: -9999px;">
	//private By inputGenderFemaleBy = By.id("genderfemale");
	
	//<input id="streetaddress" name="Street Address" type="text">
	//private By inputStreetAddressBy = By.id("streetaddress"); //Not Required
	
	//<select id="country" name="Country">
	private By selectCountryBy = By.id("country");
	
	//<input id="zipcode" name="Zip Code" type="text">
	private By inputZipCodeBy = By.id("zipcode");
	
	//<input id="city" name="City" type="text">
	//private By inputCityBy = By.id("city"); //Not Required
	
	//<select id="occupation" name="Occupation">
	private By selectOccupationBy = By.id("occupation");
	
	//Hobbies Checkboxes
	//<input id="speeding" name="Hobbies" type="checkbox" value="Speeding" style="position: absolute; left: -9999px;">
	//private By inputSpeedingBy = By.id("speeding");
	//<input id="bungeejumping" name="Hobbies" type="checkbox" value="BungeeJumping" style="position: absolute; left: -9999px;">
	//private By inputBungeeJumpingBy = By.id("bungeejumping");
	//<input id="cliffdiving" name="Hobbies" type="checkbox" value="CliffDiving" style="position: absolute; left: -9999px;">
	//private By inputCliffDivingBy = By.id("cliffdiving");
	//<input id="skydiving" name="Hobbies" type="checkbox" value="Skydiving" style="position: absolute; left: -9999px;">
	//private By inputSkyDivingBy = By.id("skydiving");
	//<input id="other" name="Hobbies" type="checkbox" value="Other" style="position: absolute; left: -9999px;">
	private By inputOtherBy = By.id("other");
	
	//<input id="website" name="Website" type="text">
	//private By inputWebsiteBy = By.id("website"); //Not Required
	
	//<input type="text" class="ideal-file-filename" name="Picture" id="picture" title>
	//private By inputPictureBy = By.id("picture"); //Not Required
	
	//Button next
	//<button id="nextenterproductdata" name="Next (Enter Product Data)" type="button" class="next">Next »</button>
	private By buttonNextProductDataBy = By.id("nextenterproductdata");
	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		InsertText(inputFirstNameBy, "MyFirstName");
		InsertText(inputLastNameBy, "MyLastName");
		InsertText(inputDateOfBirthBy,"01/01/1980");
		CheckElement(inputGenderMaleBy);
		SelectOption(selectCountryBy, 5);
		InsertText(inputZipCodeBy,"010101");
		SelectOption(selectOccupationBy, 1);
		CheckElement(inputOtherBy);
	}

	@Override
	public void ClickEndButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(buttonNextProductDataBy));
		ClickElement(buttonNextProductDataBy);		
	}
}
