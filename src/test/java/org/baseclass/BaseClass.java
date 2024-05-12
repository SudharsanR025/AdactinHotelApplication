package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	static WebElement element;
	
	public static void  browserLaunch(String browserName) {
		driver= new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void wait(int time) throws InterruptedException {
		Thread.sleep(time);
	}
		public static String rExcel(String location , String sName , int row , int cell) throws IOException {
		File f = new File(location);
		FileInputStream file = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(file);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sName);
		
		Row row2 = sheet.getRow(row);
		Cell cell2 = row2.getCell(cell);
		String scv = cell2.getStringCellValue();
		
		return scv;
		
	}
		
		public static void typeText(WebElement element , String value ) {
			element.sendKeys(value);
		}
		public static void btnClick(WebElement element) {
			element.click();
		}
		public static void select(WebElement element , int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		public static void closeBrowser() {
			driver.quit();
		}
		public static  String getPageTitle() {
			String title = driver.getTitle();
			return title;
		}
		public static boolean elementFound(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
		}
	  public void moveToElement(WebElement element) {
		  Actions action = new Actions(driver);
		  action.moveToElement(element).perform();
	  }
		public static void scrollDown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
		}
		public static void saveScreenshot(String value ) throws IOException {
			
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(value));
		}



}
