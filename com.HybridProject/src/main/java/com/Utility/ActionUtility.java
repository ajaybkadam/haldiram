package com.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.BaseClass;

public class ActionUtility extends BaseClass {

	
	public void typeIn(WebElement element,String text){
		element.sendKeys(text);
		
		
	}
	
	public void click(WebElement element){
		
		element.click();
		
	}
	
	public void DraAndDrop(WebElement target, WebElement source){
	 Actions act = new Actions(driver);
	 act.dragAndDrop(source, target);
		
	}
	public void moveAndClickElement(WebElement element){
	Actions act = new Actions(driver);
	
	act.moveToElement(element).click().build().perform();
	
	}
 
	public WebElement getElement(String loctype,String locValue){
		
	if(loctype.equals("xpath"))
	return driver.findElement(By.xpath(locValue));
	if(loctype.equals("id"))
	return driver.findElement(By.id(locValue));	
	
	return null;
	
	  
	  
  }

}


