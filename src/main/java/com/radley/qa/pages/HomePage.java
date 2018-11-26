package com.radley.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radley.qa.base.TestBase;

public class HomePage extends TestBase{
	
	Actions act;
	
	private static final String NEW_IN="//ul[@id='nav']/li[3]/a";
	private static final String NEW_PURSES="New Purses";
	
	@FindBy(xpath="NEW_IN")
	private WebElement newIN;
	
	@FindBy(linkText="NEW_PURSES")
	private WebElement newPurses;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public NewPurses clickOnNewPurses(){
		
		act.moveToElement(newIN).build().perform();
		newPurses.click();
		return new NewPurses();
	}

}
