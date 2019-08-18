package com.mst.appium.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.mst.appium.core.DeviceInfo;
import com.mst.appium.core.InitDevice;

public class BaseTest {

	public static String purl = "https://www.seleniumhq.org/";
	
	protected WebDriver driver;
	private String driverN;
	public InitDevice Device1;
	public InitDevice Device2;
	
	public DeviceInfo deviceInfo1;
	public DeviceInfo deviceInfo2;

	public BaseTest() {

		System.out.println("BaseTest:Configuring the devices");
		ConfigDevices();
		System.out.println("BaseTest:Devices configured successfully");

	}

	private void ConfigDevices() {

		deviceInfo1 = new DeviceInfo();
		deviceInfo1.setDeviceName("Samsung");
		deviceInfo1.setDeviceName("Samsung");
		deviceInfo1.setManufacturer("android");
		deviceInfo1.setContactNumber("9028320176");
		Device1 = new InitDevice(deviceInfo1);
		

		deviceInfo2 = new DeviceInfo();
		deviceInfo2.setDeviceName("apple");
		deviceInfo2.setDeviceName("Samsung");
		deviceInfo2.setManufacturer("apple");
		deviceInfo2.setContactNumber("28320176");
		Device2 = new InitDevice(deviceInfo2);
		
		
	}

	@BeforeSuite
	public void initBrowser() {

		System.out.println("Initializing in beforesuite");
	//	ConfigDevices();
		// System.setProperty("webdriver.gecko.driver",
		// "drivers/geckodriver.exe");
		// driver = new FirefoxDriver();
		// driver.get(WebURL);

	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println("####Closing driver :"+Device1.getCfg().getDriverName()+"####");
		System.out.println("####Closing driver :"+Device2.getCfg().getDriverName()+"####");
	
		if (null != driver) {
			driver.close();
			driver.quit();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	public String getDriverN() {
		return driverN;
	}


}
