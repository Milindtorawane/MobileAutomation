package com.mst.appium.android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.mst.appium.common.CallerInterface;
import com.mst.appium.core.DeviceInfo;

public class AndroidDialer implements CallerInterface {

	private String driver;
	public AndroidDialer(DeviceInfo deviceinfo) {
		this.driver=deviceinfo.getDriverName();
		//PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath="")
		WebElement callbtn;

		@Override
		public void makeCall(String contactnum) {
			
			System.out.println("Device 2 contact number"+contactnum);
			//callbtn.click();
			
		
			
			
		}
		
		

	}
	


