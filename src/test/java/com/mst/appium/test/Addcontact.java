package com.mst.appium.test;

import org.testng.annotations.Test;
import com.mst.appium.BaseTest;

public class Addcontact extends BaseTest{
	
	@Test
	public void verifyAddContact(){
		
		Device1.contacts.addContact();
		
	}
	

}
