package com.mst.appium.calling;

import org.testng.annotations.Test;

import com.mst.appium.base.BaseTest;

public class ContactTest extends BaseTest {
	
	
	@Test
	public void verifyDeletContact(){
		
		Device1.contacts.addContact();
		System.out.println("Device1 :Contact added successfully");
		Device2.contacts.addContact();
		System.out.println("Device2 :Contact delted successfully");
		
	}

}
