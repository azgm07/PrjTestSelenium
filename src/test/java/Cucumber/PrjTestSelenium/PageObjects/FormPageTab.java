package Cucumber.PrjTestSelenium.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Cucumber.PrjTestSelenium.PageInterfaces.IFormPageTab;

public abstract class FormPageTab implements IFormPageTab {
	
	//Variables
	WebDriver driver;
	
	public FormPageTab(WebDriver driver){
	    this.driver = driver;
	}
	
	public abstract void FillRequiredFields();
	public abstract void ClickEndButton();
	
	protected void SelectOption(By by, int index)
	{
		Select objSelect = new Select(driver.findElement(by));
		objSelect.selectByIndex(index);
	}
	
	protected void InsertRandomNumber(By by, int min, int max)
	{
		int number = (int)(Math.random() * (max - min)) + min;
		driver.findElement(by).sendKeys(Integer.toString(number));
	}
	
	protected void InsertText(By by, String text)
	{
		driver.findElement(by).sendKeys(text);
	}
	
	protected void ClickElement(By by)
	{
		driver.findElement(by).click();
	}
	
	protected void CheckElement(By by)
	{
		driver.findElement(by).sendKeys(Keys.SPACE);
	}
}
