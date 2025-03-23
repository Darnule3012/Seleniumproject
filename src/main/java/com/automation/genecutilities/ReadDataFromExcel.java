package com.automation.genecutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	
	public String [] [] readAllDataFromExcel(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\workspace\\POM\\src\\test\\resources\\TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet testdatasheet = workbook.getSheet(sheet);
		int totalrow = testdatasheet.getPhysicalNumberOfRows();
		int totalcol = testdatasheet.getRow(0).getPhysicalNumberOfCells();
		String arr[][]=new String [totalrow][totalcol];
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=testdatasheet.getRow(i).getCell(j).getStringCellValue();	
			}
		}
		return arr;
	}
	
	public String readDatafromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\workspace\\POM\\src\\test\\resources\\config.properties");
		Properties props = new Properties();
		props.load(fis);
		return props.getProperty(key);
		
	}
}


