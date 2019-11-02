package com.mst.appium.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {

	ExcelReader excelreader;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	XSSFRow row;
	
	public ExcelReader(String fileName) {

		System.out.println(fileName);
		File src = new File(fileName);
		try {
			workbook = new XSSFWorkbook(src);
			sheet = workbook.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not found on specified location");
		}

	}

	public int getRowCount() {
		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println("RowCount>>" + rowCount);
		return rowCount;
	}

	public int getColCount() {
		
		int colnum=sheet.getRow(0).getLastCellNum();
		System.out.println("colcount>>" + colnum);
		return colnum;
	}

	
//	@Test(dataProvider="ShortMessageVerification" )
//	public void verifyShortCode(String number,String Message){
//		
//		System.out.println("number>>"+number);
//		System.out.println("Message>>"+number);
//	}
	
	
	@DataProvider(name="ShortMessageVerification")
	public Object[] getDataWithDataProvider() {
		
		int Row = getRowCount();
		int col =getColCount();

		Object[][] data = new Object[Row][col];

		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < col; j++) {

				data[i][j] = excelreader.getData(i, j);

			}

		}
		return data;
	}

	public String getData(int RowNum, int ColNum) {

		XSSFCell celldata = sheet.getRow(RowNum).getCell(ColNum);
		DataFormatter formatter = new DataFormatter();
		String cellData1 = formatter.formatCellValue(celldata);
		System.out.println(celldata);
		return cellData1;
	}
}