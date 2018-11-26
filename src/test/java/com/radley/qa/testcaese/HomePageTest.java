package com.radley.qa.testcaese;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.radley.qa.base.TestBase;
import com.radley.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		homePage=new HomePage();
	}
	
	
	@Test
	public void testHomePage(){
		homePage.clickOnNewPurses();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
