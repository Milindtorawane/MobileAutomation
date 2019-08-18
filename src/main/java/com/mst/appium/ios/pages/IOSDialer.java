package com.mst.appium.ios.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mst.appium.base.BasePage;
import com.mst.appium.common.DialerInterface;
import com.mst.appium.core.DeviceInfo;



public class IOSDialer extends BasePage implements DialerInterface {

	public IOSDialer(DeviceInfo deviceinfo) {
		super(deviceinfo);
		
	}
		
		@FindBy(id="abc")
		WebElement callbtn;

		@Override
		public void makeCall(String contactnum) {
			
			System.out.println("IOS:Device 2 contact number"+contactnum);
			//callbtn.click();
			
			
		}
		
		

	}
	