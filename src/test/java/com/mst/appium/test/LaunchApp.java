package com.mst.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchApp {
	
	/*
	 * {
    "platformName": "iOS",
    "platformVersion": "11.0",
    "deviceName": "iPhone 7",
    "automationName": "XCUITest",
    "app": "/path/to/my.app"
}
	 */
	
	static AndroidDriver driver =null ;
	
	public static void main (String[]args) throws MalformedURLException{
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("deviceName","Lenovo k5 note");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","6.0.1");
		cap.setCapability("appPackage", "");
		cap.setCapability("appActivity", "");
		cap.setCapability("app", "/path/to/my.app");
	
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		
		
	}

}
