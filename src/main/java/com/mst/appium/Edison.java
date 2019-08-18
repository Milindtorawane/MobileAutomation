package com.mst.appium;

import com.mst.appium.android.pages.AndroidE;
import com.mst.appium.common.edisonInterface;
import com.mst.appium.core.DeviceInfo;
import com.mst.appium.ios.pages.IOSE;

public class Edison implements edisonInterface {

	private edisonInterface eDison;
//	private BaseTest cfg;

	public Edison(DeviceInfo cfg) {
	
		System.out.println("Manufacture>>"+cfg.getManufacturer());
		switch (cfg.getManufacturer()) {

		
		case "apple":
			eDison = new IOSE(cfg);
		
			System.out.println("Edison:Apple device");
			break;

		case "android":
			eDison = new AndroidE(cfg);
			System.out.println("Edison: android device");
			break;
		default:
			eDison = new AndroidE(cfg);
			break;
		}
	}

	public void makecall() {

		System.out.println("Inside the main class");
		eDison.makecall();

	}

}
