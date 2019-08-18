package com.mst.appium.android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mst.appium.base.BasePage;
import com.mst.appium.common.DialerInterface;
import com.mst.appium.core.DeviceInfo;

public class AndroidDialer extends BasePage implements DialerInterface {

	public AndroidDialer(DeviceInfo deviceinfo) {
		super(deviceinfo);
		
	}
		
		@FindBy(xpath="")
		WebElement callbtn;

		@Override
		public void makeCall(String contactnum) {
			
			System.out.println("Device 2 contact number"+contactnum);
			//callbtn.click();
			
			
		}
		
		

	}
	


