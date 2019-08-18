package com.mst.appium.common;

import com.mst.appium.core.DeviceInfo;


	
	public class Dialer implements DialerInterface {
		private DialerInterface dialer;

		public Dialer(DeviceInfo deviceInfo) {
			
		
		}
		

		public void  makeCall(String contactnum) {
			dialer.makeCall(contactnum);

		}



}
