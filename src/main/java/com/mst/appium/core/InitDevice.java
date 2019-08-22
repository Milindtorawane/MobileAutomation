package com.mst.appium.core;

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
 	


