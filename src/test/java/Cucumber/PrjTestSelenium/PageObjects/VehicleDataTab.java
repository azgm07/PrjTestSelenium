package Cucumber.PrjTestSelenium.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehicleDataTab extends FormPageTab{
	
	//CONSTRUCTOR
	public VehicleDataTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES	
	//<select id="make" name="Make">
	private By selectMakeBy = By.name("Make");
	//<select id="model" name="Model">
	private By selectModelBy = By.name("Model");
	//<input id="cylindercapacity" name="Cylinder Capacity" type="text">
	private By inputCylinderCapacityBy = By.name("Cylinder Capacity");
	//<input id="engineperformance" name="[kW]" type="text">
	private By inputEnginePerformanceBy = By.name("[kW]");
	//<input id="dateofmanufacture" name="Date of Manufacture" type="text" placeholder="MM/DD/YYYY" class="datepicker hasDatepicker">
	private By inputDateOfManufactureBy = By.name("Date of Manufacture");
	//<select id="numberofseats" name="Number of Seats">
	private By selectNumberOfSeatsBy = By.name("Number of Seats");
	//<select id="fuel" name="Fuel Type">
	private By selectFuelTypeBy = By.name("Fuel Type");
	//<input id="righthanddriveyes" name="Right Hand Drive" type="radio" value="Yes" style="position: absolute; left: -9999px;">
	private By inputRightHandDriveYesBy = By.id("righthanddriveyes");
	//<input id="righthanddriveno" name="Right Hand Drive" type="radio" value="No" style="position: absolute; left: -9999px;">
	private By inputRightHandDriveNoBy = By.id("righthanddriveno");
	//<input id="listprice" name="List Price" type="text">
	private By inputListPriceBy = By.name("List Price");
	//<input id="licenseplatenumber" name="License Plate Number" type="text">
	private By inputLicensePlateNumberBy = By.name("License Plate Number");
	//<input id="annualmileage" name="Annual Mileage" type="text">
	private By inputAnnualMileageBy = By.name("Annual Mileage");
	
	//Button next
	//<button id="nextenterinsurantdata" name="Next (Enter Insurant Data)" type="button" class="next button">Next »</button>
	private By buttonNextInsurantDataBy = By.name("Next (Enter Insurant Data)");
	
	
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
