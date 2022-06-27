package Cucumber.PrjTestSelenium.PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleDataTab extends FormPageTab{
	
	//CONSTRUCTOR
	public VehicleDataTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<select id="make" name="Make">
	private By selectMakeBy = By.id("make");
	
	//<select id="model" name="Model">
	private By selectModelBy = By.id("model");
	
	//<input id="cylindercapacity" name="Cylinder Capacity" type="text">
	private By inputCylinderCapacityBy = By.id("cylindercapacity");
	
	//<input id="engineperformance" name="[kW]" type="text">
	private By inputEnginePerformanceBy = By.id("engineperformance");
	
	//<input id="dateofmanufacture" name="Date of Manufacture" type="text" placeholder="MM/DD/YYYY" class="datepicker hasDatepicker">
	private By inputDateOfManufactureBy = By.id("dateofmanufacture");
	
	//<select id="numberofseats" name="Number of Seats">
	private By selectNumberOfSeatsBy = By.id("numberofseats");
	
	//<input id="righthanddriveyes" name="Right Hand Drive" type="radio" value="Yes" style="position: absolute; left: -9999px;">
	private By inputRightHandDriveYesBy = By.id("righthanddriveyes");	
	//<input id="righthanddriveno" name="Right Hand Drive" type="radio" value="No" style="position: absolute; left: -9999px;">
	//private By inputRightHandDriveNoBy = By.id("righthanddriveno");
	
	//<select id="numberofseatsmotorcycle" name="Number of Seats Motorcycle">
	private By selectNumberOfSeatsMotorcycleBy = By.id("numberofseatsmotorcycle");
	
	//<select id="fuel" name="Fuel Type">
	private By selectFuelTypeBy = By.id("fuel");
	
	//<input id="payload" name="Payload" type="text">
	private By inputPayloadBy = By.id("payload");
	
	//<input id="totalweight" name="Total Weight" type="text">
	private By inputTotalWeightBy = By.id("totalweight");
	
	//<input id="listprice" name="List Price" type="text">
	private By inputListPriceBy = By.id("listprice");
	
	//<input id="licenseplatenumber" name="License Plate Number" type="text">
	private By inputLicensePlateNumberBy = By.id("licenseplatenumber");
	
	//<input id="annualmileage" name="Annual Mileage" type="text">
	private By inputAnnualMileageBy = By.id("annualmileage");
	
	//Button next
	//<button id="nextenterinsurantdata" name="Next (Enter Insurant Data)" type="button" class="next button">Next »</button>
	private By buttonNextInsurantDataBy = By.id("nextenterinsurantdata");
	
	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		SelectOption(selectMakeBy, 1);
		SelectOption(selectModelBy, 1);
		InsertRandomNumber(inputCylinderCapacityBy, 1, 2000);
		InsertRandomNumber(inputEnginePerformanceBy, 1, 2000);
		InsertText(inputDateOfManufactureBy, "01/01/2000");
		SelectOption(selectNumberOfSeatsBy, 4);
		CheckElement(inputRightHandDriveYesBy);
		SelectOption(selectNumberOfSeatsMotorcycleBy, 2);
		SelectOption(selectFuelTypeBy, 1);
		InsertRandomNumber(inputPayloadBy, 1, 1000);
		InsertRandomNumber(inputTotalWeightBy, 100, 50000);
		InsertRandomNumber(inputListPriceBy, 500, 100000);
		InsertText(inputLicensePlateNumberBy, "0101010");
		InsertRandomNumber(inputAnnualMileageBy, 100, 100000);
	}

	@Override
	public void ClickEndButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(buttonNextInsurantDataBy));
		ClickElement(buttonNextInsurantDataBy);	
	}
}
