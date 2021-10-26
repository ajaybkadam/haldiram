package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.Utility.PropertiesUtility;
import com.Utility.WaitUtility;

public class BaseClass {

	public PropertiesUtility pu=null;
	public WaitUtility wu=null; 
	public WebDriver driver;
	
	
	@BeforeSuite      //For WebDriver initialization
	public void setup(){
		pu=new PropertiesUtility();
		wu=new WaitUtility();
		
		if(pu.readProperty("browser").equals("chrome")){
		System.setProperty("webdriver.chrome.driver", pu.readProperty("chromeDriverpath"));	
		driver=new ChromeDriver();	
		}
		if(pu.readProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver", pu.readProperty("geckoDriverfilePath"));		
			driver=new FirefoxDriver();
			
		}
		driver.get(pu.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(pu.readProperty("pageload")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(pu.readProperty("pageload")), TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
