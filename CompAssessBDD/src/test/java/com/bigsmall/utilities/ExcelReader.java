package com.bigsmall.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader{
	
	public static HashMap<String,String> getTestData(String sheetname) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/ExcelData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rows = sheet.getLastRowNum();
		HashMap<String,String> loginArray = new HashMap<String,String>();
		for(int i =0;i<=rows;i++) {
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			
			loginArray.put(username, password);
			
		}

		fis.close();
		return loginArray;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		Assignment a = new Assignment();
//		a.getTestData();
		System.out.println(getTestData("login_details").toString());
	}

}