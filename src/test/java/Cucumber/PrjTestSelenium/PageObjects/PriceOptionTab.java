package Cucumber.PrjTestSelenium.PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionTab extends FormPageTab{
	
	//CONSTRUCTOR
	public PriceOptionTab(WebDriver driver) {
		super(driver);
	}
	
	//PROPERTIES		
	//<input id="selectsilver" name="Select Option" type="radio" value="Silver" style="position: absolute; left: -9999px;">
	private By inputSelectSilverBy = By.id("selectsilver");
	
	//<input id="selectgold" name="Select Option" type="radio" value="Gold" style="position: absolute; left: -9999px;">
	//private By inputSelectGoldBy = By.id("selectgold");
	
	//<input id="selectplatinum" name="Select Option" type="radio" value="Platinum" style="position: absolute; left: -9999px;">
	//private By inputSelectPlatinumBy = By.id("selectplatinum");
	
	//<input id="selectultimate" name="Select Option" type="radio" value="Ultimate" style="position: absolute; left: -9999px;">
	//private By inputSelectUltimateBy = By.id("selectultimate");
		
	//Button next
	//<button id="nextsendquote" name="Next (Send Quote)" type="button" class="next">Next »</button>
	private By buttonNextSendQuoteBy = By.id("nextsendquote");
	
	//METHODS	
	@Override
	public void FillRequiredFields() {
		CheckElement(inputSelectSilverBy);
	}

	@Override
	public void ClickEndButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(buttonNextSendQuoteBy));
		ClickElement(buttonNextSendQuoteBy);
	}
}
