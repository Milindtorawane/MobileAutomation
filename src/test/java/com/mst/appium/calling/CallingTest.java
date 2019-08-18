package com.mst.appium.calling;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mst.appium.base.BaseTest;
import com.mst.appium.utilities.ExcelReader;

public class CallingTest extends BaseTest {
	
	@Test
	public void verifyCalling(){
		Device1.dialer.makeCall(deviceInfo2.getContactNumber());
		Device2.dialer.makeCall(deviceInfo1.getContactNumber());
		
		
	}
	
	@Test(dataProvider="ShortMessageVerification" )
	public void verifyShortCode(String number,String Message){
		
		System.out.println("number>>"+number);
		System.out.println("Message>>"+number);
	}
	
	@DataProvider(name="ShortMessageVerification")
	public Object[] getDataWithDataProvider() {
		String filepath = System.getProperty("user.dir");
		String fileName = filepath + "\\TestData\\MyWorkbook.xlsx";
		ExcelReader obj= new ExcelReader(fileName);
		int Row =obj.getRowCount();
		int col =obj.getColCount();

		Object[][] data = new Object[Row][col];

		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < col; j++) {

				data[i][j] = obj.getData(i, j);

			}

		}
		return data;
	}

}
