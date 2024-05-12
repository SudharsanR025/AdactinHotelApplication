package org.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Selenium\\Framework\\Sample.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(file);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		System.out.println(cellType);
		String scv = cell.getStringCellValue();
		System.out.println(scv);
		/*Row row2 = sheet.createRow(11);
		Cell cell2 = row2.createCell(11);
		cell2.setCellValue("Webdriver");*/
		FileOutputStream file2 = new FileOutputStream(f);
		wb.write(file2);
		Row row2 = sheet.getRow(11);
		Cell cell2 = row2.getCell(11);
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		
	}

}
