package Cucumber.PrjTestSelenium.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDataTab extends FormPageTab{
	
	//CONSTRUCTOR
	public ProductDataTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<input id="startdate" name="Start Date" type="text" placeholder="MM/DD/YYYY" class="datepicker hasDatepicker">
	//<select id="insurancesum" name="Insurance Sum">
	//<select id="meritrating" name="Merit Rating">
	//<select id="damageinsurance" name="Damage Insurance">
	
	//Optional Products Checkboxes
	//<input id="EuroProtection" name="Optional Products[]" type="checkbox" value="Yes" style="position: absolute; left: -9999px;">
	//<input id="LegalDefenseInsurance" name="Optional Products[]" type="checkbox" value="Yes" style="position: absolute; left: -9999px;">
	
	//<select id="courtesycar" name="Courtesy Car">
	
	//Button next for third form
	//<button id="nextselectpriceoption" name="Next (Select Price Option)" type="button" class="next">Next »</button>
	
	//----------------------------------------------------
	
	//Forth form tab elements (Select price option)
	
	//<input id="selectsilver" name="Select Option" type="radio" value="Silver" style="position: absolute; left: -9999px;">
	//<input id="selectgold" name="Select Option" type="radio" value="Gold" style="position: absolute; left: -9999px;">
	//<input id="selectplatinum" name="Select Option" type="radio" value="Platinum" style="position: absolute; left: -9999px;">
	//<input id="selectultimate" name="Select Option" type="radio" value="Ultimate" style="position: absolute; left: -9999px;">
		
	
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
