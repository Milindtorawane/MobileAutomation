package com.mst.appium.ios.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.mst.appium.common.CntctInterface;
import com.mst.appium.core.DeviceInfo;

public class IOSContacts  implements CntctInterface{

	private String driver;
	
	public IOSContacts(DeviceInfo deviceInfo) {
		
		this.driver=deviceInfo.getDriverName();
		//PageFactory.initElements(driver, this);
		
	}



	//String driverName;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	 WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	 String loginbtn1;

	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement registrationbtn;
	
	
	
	
	public void addContact() {
		
		System.out.println("IOSContacts:Create contact>>"+driver);
		System.out.println("IOS:contact added successfully");
		
		
		
	}
	
	
}
