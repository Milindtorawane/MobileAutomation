package com.mst.appium.android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.mst.appium.common.ContactInterface;
import com.mst.appium.core.DeviceInfo;

public class AndroidContacts implements ContactInterface{

	private String driver;
	public AndroidContacts(DeviceInfo deviceInfo) {
		this.driver=deviceInfo.getDriverName();
		//PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	 WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	 String loginbtn1;

	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement registrationbtn;
	
	@Override
	public void addContact() {
		
		System.out.println("AndroidContacts:Create contact>>"+driver);
		System.out.println("AndroidContacts:contact added successfully");
		

		
		
	}

}
