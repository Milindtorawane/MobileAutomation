package com.mst.appium.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mst.appium.base.BaseTest;
import com.mst.appium.core.DeviceInfo;

public class seleniumUtilies{
	
	private WebDriver driver;
	seleniumUtilies(DeviceInfo deviceInfo){
		deviceInfo.getDriverName();
		
	}
	
	
	public void takScreenShot(String testCaseName) throws IOException{
		
		TakesScreenshot obj=(TakesScreenshot)driver;
		File src=obj.getScreenshotAs(OutputType.FILE);
		File dest=new File("filepath"+testCaseName+".png");
		FileUtils.copyFile(src, dest);
		
		
	}
	
	public void swipe(String testCaseName){
		
		
	}
	

}
