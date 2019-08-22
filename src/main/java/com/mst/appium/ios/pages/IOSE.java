package com.mst.appium.ios.pages;


import com.mst.appium.common.esInterface;
import com.mst.appium.core.DeviceInfo;

public class IOSE implements esInterface{
	String driverName;
	
	public IOSE(DeviceInfo deviceInfo){
		driverName = deviceInfo.getDriverName();
		System.out.println("DriverName>>"+driverName);
		//Properties props = new LoadUEConfigFile(cfg.getOS()).loadfromfile("androidedison");
	}
	
	public void makecall() {
	
		System.out.println("Inside the IOS make call+ "+driverName);
		
		
	}

}
