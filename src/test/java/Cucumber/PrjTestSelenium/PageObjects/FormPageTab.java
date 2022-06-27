package Cucumber.PrjTestSelenium.PageObjects;

import org.openqa.selenium.WebDriver;

import Cucumber.PrjTestSelenium.PageInterfaces.IFormPageTab;

public abstract class FormPageTab implements IFormPageTab {
	
	//Variables
	WebDriver driver;
	
	public FormPageTab(WebDriver driver){
	    this.driver = driver;
	}
	
	public abstract void FillRequiredFields();
	public abstract void ClickFinishButton();
}
