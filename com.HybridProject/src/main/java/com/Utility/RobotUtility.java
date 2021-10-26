package com.Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotUtility {
     Robot r=null;
	//CLICK Enter
	public void PressEnterKey(){
		
		try {
			 r= new Robot();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public void PressTabKey(){
		
		try {
		 r = new Robot ();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		
		r.keyPress(KeyEvent.VK_TAB);
		
		
		
	}
	
	
	
	
	
	
	
}
