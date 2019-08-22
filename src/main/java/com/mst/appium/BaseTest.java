package com.mst.appium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.mst.appium.common.esInterface;
import com.mst.appium.core.DeviceInfo;
import com.mst.appium.core.InitDevice;

public class BaseTest {

	private WebDriver driver;
	private String manufacturer;
	public static String WebURL = "https://www.seleniumhq.org/";
	protected Ed edison;
	public esInterface edisonInterface;
	public InitDevice Device1;
	public InitDevice Device2;
	DeviceInfo cfg1;
	DeviceInfo cfg2;

	public BaseTest() {
		// setManufacturer("android");
		System.out.println("Inside constructo");

		ConfigDevices();

		// Device1.setDevicName(Device1);
		System.out.println("Value assigned object");

	}

	private void ConfigDevices() {

		cfg1 = new DeviceInfo();
		cfg1.setDeviceName("Samsung");
		cfg1.setDeviceName("Samsung");
		cfg1.setManufacturer("android");
		cfg1.setContactNumber("9028320176");
		Device1 = new InitDevice(cfg1);

		cfg2 = new DeviceInfo();
		cfg2.setDeviceName("apple");
		cfg2.setDeviceName("Samsung");
		cfg2.setManufacturer("apple");
		cfg2.setContactNumber("28320176");
		Device2 = new InitDevice(cfg2);

	}

	@BeforeSuite
	public void initBrowser() {

		System.out.println("Initializing in beforesuite");
		ConfigDevices();
		// System.setProperty("webdriver.gecko.driver",
		// "drivers/geckodriver.exe");
		// driver = new FirefoxDriver();
		// driver.get(WebURL);

	}

	@AfterSuite
	public void afterSuite() {
		if (null != driver) {
			driver.close();
			driver.quit();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
