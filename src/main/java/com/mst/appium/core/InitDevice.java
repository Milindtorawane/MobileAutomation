package com.mst.appium.core;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.mst.appium.Ed;
import com.mst.appium.android.pages.AndroidContacts;
import com.mst.appium.android.pages.AndroidDialer;
import com.mst.appium.common.CntctInterface;
import com.mst.appium.common.CallerInterface;
import com.mst.appium.common.esInterface;
import com.mst.appium.ios.pages.IOSContacts;
import com.mst.appium.ios.pages.IOSDialer;

public class InitDevice {
	

	public esInterface edison;
	public CntctInterface contacts;
	public CallerInterface dialer;
	private DeviceInfo deviceInfo;
	private String manufacturer;


	
	public DeviceInfo getCfg() {
		return deviceInfo;
	}



	public void setCfg(DeviceInfo cfg) {
		this.deviceInfo = cfg;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	

 	public InitDevice (DeviceInfo deviceInfo){
 		this.deviceInfo=deviceInfo;
//		edison= new Edison(deviceInfo);
//		contacts= new Contacts(deviceInfo);
// 		dialer = new  Dialer(deviceInfo);
 		System.out.println("Manufacture>>"+deviceInfo.getManufacturer());
		switch (deviceInfo.getManufacturer()) {

		
		case "apple":
			
			
			
			
			deviceInfo.setDriverName("apppledriver");
			edison = new Ed(deviceInfo);
			contacts = new IOSContacts(deviceInfo);
			dialer = new  IOSDialer(deviceInfo);
			setCfg(deviceInfo);
			System.out.println("Init Devices:Apple device");
			break;

		case "android":
			
			
			deviceInfo.setDriverName("androidriver");
			/*
			DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANDROID);
			capabilities.setCapability("user",userInfo.getUsername());
			capabilities.setCapability("password",userInfo.getPassword());
			System.setProperty("myUser",userInfo.getUsername());
			System.setProperty("pass",userInfo.getPassword());
			capabilities.setCapability("deviceName", deviceName);
			capabilities.setCapability("host", host);
			capabilities.setCapability("automationName", "Appium");
			capabilities.setCapability("appPackage", this.props.getProperty("homeappPackage"));
			capabilities.setCapability("appActivity", this.props.getProperty("homeappActivity"));
			capabilities.setCapability("newCommandTimeout", "1200");
			capabilities.setCapability("autoAcceptAlerts", true);
			*/
			edison = new Ed(deviceInfo);
			contacts = new AndroidContacts(deviceInfo);
			dialer = new  AndroidDialer(deviceInfo);
			setCfg(deviceInfo);
			System.out.println("InitDevices:android device");
			break;
		default:
			edison = new Ed(deviceInfo);
			break;
		
		
	}
	
	
 	}
}
 	


