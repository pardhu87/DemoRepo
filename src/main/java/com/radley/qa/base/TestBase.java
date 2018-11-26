package com.radley.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		try{
			FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\workspace\\com.pom.radley\\src\\main\\java\\com\\radley\\qa\\config\\config.properties");
			prop=new Properties();
			prop.load(fis);
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void intialization(){
		String browser=prop.getProperty("browser");
		if(browser.contains("firefox")){
			driver=new FirefoxDriver();
			String url=prop.getProperty("url");
			driver.get(url);
		}else if(browser.contains("chrome")){
			String exePath = "C:\\Program Files (x86)\\Google\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			String url=prop.getProperty("url");
			driver.get(url);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
		
}
