package Cucumber.PrjTestSelenium.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsurantDataTab extends FormPageTab{
	
	//CONSTRUCTOR
	public InsurantDataTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<input id="firstname" name="First Name" type="text">
	//<input id="lastname" name="Last Name" type="text">
	//<input id="birthdate" name="Date of Birth" type="text" placeholder="MM/DD/YYYY" class="datepicker hasDatepicker">
	
	//Gender Radios
	//<input id="gendermale" name="Gender" type="radio" value="Male" style="position: absolute; left: -9999px;">
	//<input id="genderfemale" name="Gender" type="radio" value="Female" style="position: absolute; left: -9999px;">
	
	//<input id="streetaddress" name="Street Address" type="text">
	//<select id="country" name="Country">
	//<input id="zipcode" name="Zip Code" type="text">
	//<input id="city" name="City" type="text">
	//<select id="occupation" name="Occupation">
	
	//Hobbies Checkboxes
	//<input id="speeding" name="Hobbies" type="checkbox" value="Speeding" style="position: absolute; left: -9999px;">
	//<input id="bungeejumping" name="Hobbies" type="checkbox" value="BungeeJumping" style="position: absolute; left: -9999px;">
	//<input id="cliffdiving" name="Hobbies" type="checkbox" value="CliffDiving" style="position: absolute; left: -9999px;">
	//<input id="skydiving" name="Hobbies" type="checkbox" value="Skydiving" style="position: absolute; left: -9999px;">
	//<input id="other" name="Hobbies" type="checkbox" value="Other" style="position: absolute; left: -9999px;">
	
	//<input id="website" name="Website" type="text">
	//<input type="text" class="ideal-file-filename" name="Picture" id="picture" title>
	
	//Button next for second form
	//<button id="nextenterproductdata" name="Next (Enter Product Data)" type="button" class="next">Next »</button>
	
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
