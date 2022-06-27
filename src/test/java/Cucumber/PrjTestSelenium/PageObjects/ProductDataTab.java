package Cucumber.PrjTestSelenium.PageObjects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDataTab extends FormPageTab{
	
	//CONSTRUCTOR
	public ProductDataTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<input id="startdate" name="Start Date" type="text" placeholder="MM/DD/YYYY" class="datepicker hasDatepicker">
	private By inputStartDateBy = By.id("startdate");
	
	//<select id="insurancesum" name="Insurance Sum">
	private By selectInsuranceSumBy = By.id("insurancesum");
	//<select id="meritrating" name="Merit Rating">
	private By selectMeritRatingBy = By.id("meritrating");
	//<select id="damageinsurance" name="Damage Insurance">
	private By selectDamageInsuranceBy = By.id("damageinsurance");
	
	//Optional Products Checkboxes
	//<input id="EuroProtection" name="Optional Products[]" type="checkbox" value="Yes" style="position: absolute; left: -9999px;">
	private By inputEuroProtectionBy = By.id("EuroProtection");
	//<input id="LegalDefenseInsurance" name="Optional Products[]" type="checkbox" value="Yes" style="position: absolute; left: -9999px;">
	private By inputLegalDefenseInsuranceBy = By.id("LegalDefenseInsurance");
	
	//<select id="courtesycar" name="Courtesy Car">
	private By selectCourtesyCarBy = By.id("courtesycar");
	
	//Button next
	//<button id="nextselectpriceoption" name="Next (Select Price Option)" type="button" class="next">Next »</button>
	private By buttonNextSelectPriceOptionBy = By.id("nextselectpriceoption");
		
	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		
		//Generate new date from today plus three months
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.MONTH, 3);
        Date newDate = c.getTime();
        
		InsertText(inputStartDateBy,dateFormat.format(newDate));
		SelectOption(selectInsuranceSumBy, 2);
		SelectOption(selectMeritRatingBy, 1);
		SelectOption(selectDamageInsuranceBy, 1);
		CheckElement(inputEuroProtectionBy);
		CheckElement(inputLegalDefenseInsuranceBy);
		SelectOption(selectCourtesyCarBy, 1);
	}

	@Override
	public void ClickEndButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(buttonNextSelectPriceOptionBy));
		ClickElement(buttonNextSelectPriceOptionBy);		
	}
}
