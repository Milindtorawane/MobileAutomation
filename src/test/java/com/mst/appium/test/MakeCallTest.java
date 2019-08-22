package com.mst.appium.test;

import org.testng.annotations.Test;
import com.mst.appium.BaseTest;
import com.mst.appium.Ed;


public class MakeCallTest extends BaseTest{
	

	
	@Test
	public void makeCall(){
		
		Device1.edison.makecall();
		Device2.edison.makecall();
	
		
	}
	

}
