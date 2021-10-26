package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
//1.why= to apply waits 
//2.input= WebElement
//3.output=null
	
	
	
 public void waitForElement(WebElement element, WebDriver driver, long timeInSec){
	 
	WebDriverWait wait = new WebDriverWait(driver, timeInSec);//WebDriverWait it is a class in Selenium
	wait.until(ExpectedConditions.visibilityOf(element));     //method of class
	
	 
	 
 }
	

	
	
	
	
	
	
	
	
	
	
	
}
