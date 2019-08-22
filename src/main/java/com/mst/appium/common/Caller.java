package com.mst.appium.common;

import com.mst.appium.core.DeviceInfo;


	
	public class Caller implements CallerInterface {
		private CallerInterface dialer;

		public Caller(DeviceInfo deviceInfo) {
			
		
		}
		

		public void  makeCall(String contactnum) {
			dialer.makeCall(contactnum);

		}



}
