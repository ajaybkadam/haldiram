package com.Utility;

import com.Base.BaseClass;

public class DriverUtility extends BaseClass {

	public void switchToFrameById(String id){
		
		driver.switchTo().frame(id);
	}
	
	public void switchToFrameByIndex(String index){
		driver.switchTo().frame(index);
		
	}

   public void switchToFrameByElement(String element){
	   
	   driver.switchTo().frame(element);
	   
   }
   public void switchToWindow(String id){
	  driver.switchTo().window(id); 
	   
	   
   }
   
   
}
