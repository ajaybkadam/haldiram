package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class loginTest extends BaseClass {
	
	@Test
	public void Test(){
	pu.readProperty("browser");	
	Assert.assertEquals(true, false);	
	}

}
