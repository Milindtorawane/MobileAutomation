package com.mst.appium.android.pages;

import com.mst.appium.common.edisonInterface;
import com.mst.appium.core.DeviceInfo;

public class AndroidE implements edisonInterface {

	String driverName;
	public AndroidE(DeviceInfo cfg){
		driverName = cfg.getDriverName();
		System.out.println("DriverName>>"+driverName);
		
//		driver = cfg.getDriver();
//		props = new LoadUEConfigFile(cfg.getOS()).loadfromfile("androidedison");
	}
	
	
	
	public void makecall() {
		
		System.out.println("Inside the Android make call"+driverName);
	}

}
