package org.adactin;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.PageManager;
import org.pom.Pom_HotelBook;
import org.pom.Pom_HotelSelect;
import org.pom.Pom_LastPage;
import org.pom.Pom_LoginPage;
import org.pom.Pom_SearchHotel;

public class AdactinHotelApplication extends BaseClass {
	@BeforeClass
	public static void firstStep() {
		browserLaunch("Chrome");
		maxWindow();
	}
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void testMethod() throws InterruptedException, IOException {
		loadUrl("http://adactinhotelapp.com/");
		PageManager pm = new PageManager();
//		Pom_LoginPage p = new Pom_LoginPage();
		Pom_LoginPage p = pm.getP();
		WebElement userName = p.getUsername();
//		WebElement userName =  p.getUsername();
		String uValue = rExcel("D:\\Selenium\\Framework\\ExcelRead.xlsx","Sheet1" , 0, 0);
		typeText(userName, uValue);
		WebElement password =  p.getPassword();
		String pValue = rExcel("D:\\Selenium\\Framework\\ExcelRead.xlsx","Sheet1" , 0, 1);
		typeText(password, pValue);
		WebElement login =  p.getLogin();
		btnClick(login);

//		Pom_SearchHotel s = new Pom_SearchHotel();
		Pom_SearchHotel s = pm.getS();
		WebElement location =s.getLocation();
		select(location, 2);
		WebElement hotel =  s.getHotel();
		select(hotel, 1);
		WebElement roomType =  s.getRoomType();
		select(roomType, 1);
		WebElement noOfRoom =  s.getNoOfRoom();
		select(noOfRoom, 1);
		WebElement noOfAdult =  s.getNoOfAdult();
		select(noOfAdult, 1);
		WebElement noOfChild =  s.getNoOfChild();
		select(noOfChild, 1);
		WebElement getsubmit = s.getsubmit();
		btnClick(getsubmit);

//		Pom_HotelSelect h = new Pom_HotelSelect();
		Pom_HotelSelect h = pm.getH();
		WebElement radio =  h.getRadio();
		btnClick(radio);
		WebElement continueclick =  h.getContinueclick();
		btnClick(continueclick);

//		Pom_HotelBook b = new Pom_HotelBook();
		Pom_HotelBook b = pm.getB();
		WebElement firstName =  b.getFirstName();
		typeText(firstName, "Sudhar");
		WebElement lastName =  b.getLastName();
		typeText(lastName, "Ram");
		WebElement address =  b.getAddress();
		typeText(address,"this chennai perumbakkam omr navalur");
		WebElement getcNumber =  b.getcNumber();
		typeText(getcNumber, "1234567887654321");
		WebElement getcType =  b.getcType();
		select(getcType, 1);
		WebElement geteMonth =  b.geteMonth();
		select(geteMonth, 1);
		WebElement geteYear =  b.geteYear();
		select(geteYear, 10);
		WebElement cvvNumber =  b.getCvvNumber();
		typeText(cvvNumber, "124");
		WebElement getsButton =  b.getsButton();
		btnClick(getsButton);
		wait(5000);

//		Pom_LastPage l = new Pom_LastPage();
		Pom_LastPage l = pm.getL();
		WebElement logout = l.getLogout();
		wait(5000);
		btnClick(logout);
	}
		@AfterClass
		public static void lastStep() {
			closeBrowser();
		}
		
	}


