package com.mst.appium.core;

public class DeviceInfo {

	private String DeviceName;
	private String ContactNumber;
	private String driverName;
	
	private DeviceInfo deviceInfo;
	private String manufacturer;
	

	public String getDeviceName() {
		return DeviceName;
	}

	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}



	public DeviceInfo getdeviceInfo() {
		return deviceInfo;
	}



	public void setdeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
}
