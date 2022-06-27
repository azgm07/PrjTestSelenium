package Cucumber.PrjTestSelenium.PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertOverlay extends FormPageTab{
	
	//CONSTRUCTOR
	public AlertOverlay(WebDriver driver) {
		super(driver);
	}
	
	//Icons
	//<div class="sa-icon sa-error" style="display: none;">
	//private By divErrorIcon = By.className("sa-error");
	
	//<div class="sa-icon sa-warning" style="display: none;">
	//private By divWarningIcon = By.className("sa-warning");
	
	//<div class="sa-icon sa-info" style="display: none;">
	//private By divInfoIcon = By.className("sa-info");
	
	//<div class="sa-icon sa-success animate" style="display: block;">
	private By divSuccessIcon = By.className("sa-success");
	
	//<div class="sa-icon sa-custom" style="display: none;"></div>
	//private By divCustomIcon = By.className("sa-custom");
	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void ClickEndButton() {
		// TODO Auto-generated method stub		
	}
	
	public boolean CheckIfSuccess()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		wait.until(ExpectedConditions.presenceOfElementLocated(divSuccessIcon));
		boolean result = driver.findElement(divSuccessIcon).isDisplayed();
		return result;
	}
}
