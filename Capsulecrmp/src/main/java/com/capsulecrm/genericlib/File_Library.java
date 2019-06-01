package com.capsulecrm.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author by Ranjeet Kumar on 5/29/2019
 *
 */
public class File_Library {
	/**
	 * it's used the property key value from Bank.properties
	 * 
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getpropertyKeyvalue(String key) throws Throwable {
		FileInputStream fips = new FileInputStream("./testData/capsulecrm.poperties");
		Properties pobj = new Properties();
		pobj.load(fips);
		String value = pobj.getProperty(key);
		return value;
	}

	/**
	 * it's used to read data from excel workbook,based on user argument
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param cellnum
	 * @return Data
	 * @throws Throwable
	 * @throws Throwable
	 */
	public String getExcellData(String sheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./testData/CapsulecrmData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;
}
	/**
	 * it's used to write data back to excel based on user..
	 * 
	 * @param SheetName
	 * @param rowName
	 * @param celNum
	 * @param data
	 * @throws Throwable
	 */
	public void setExcelData(String SheetName, int rowName, int celNum, String data) throws Throwable {
		FileInputStream fisi = new FileInputStream("./testData/CapsulecrmData.xlsx");
		Workbook wb = WorkbookFactory.create(fisi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowName);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./testData/CapsulecrmData.xlsx");
		wb.write(fos);
		wb.close();
	}}
