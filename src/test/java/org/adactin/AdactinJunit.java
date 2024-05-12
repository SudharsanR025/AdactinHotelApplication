
package org.adactin;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pom.Pom_HotelBook;
import org.pom.Pom_HotelSelect;
import org.pom.Pom_LastPage;
import org.pom.Pom_LoginPage;
import org.pom.Pom_SearchHotel;

import junit.framework.Assert;

public class AdactinJunit  extends BaseClass {
	@BeforeClass
	public static void firstStep() {
		browserLaunch("Chrome");
		maxWindow();
	}
	@AfterClass
	public static void lastStep() throws IOException {
		saveScreenshot("D:\\Selenium\\Framework\\Adactin.png");
		closeBrowser();
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
	public void testMethod1() throws InterruptedException, IOException {
		loadUrl("http://adactinhotelapp.com/");
		String pageTitle = getPageTitle();
		String actualTitle="Adactin.com - Hotel Reservation System";
		Assert.assertEquals(pageTitle, actualTitle);
		Pom_LoginPage p = new Pom_LoginPage();
		WebElement userName = p.getUsername();
		boolean userNameF = elementFound(userName);
		Assert.assertTrue(userNameF);
		String uValue = rExcel("D:\\Selenium\\Framework\\ExcelRead.xlsx","Sheet1" , 0, 0);
		typeText(userName, uValue);
		WebElement password = p.getPassword();
	    boolean passwordF = elementFound(password);
	    Assert.assertTrue(passwordF);
		String pValue = rExcel("D:\\Selenium\\Framework\\ExcelRead.xlsx","Sheet1" , 0, 1);
		typeText(password, pValue);
		WebElement login = p.getLogin();
		boolean loginF = elementFound(login);
		Assert.assertTrue(loginF);
		btnClick(login);
	}
		@Test
		public void testMethod2() throws InterruptedException, IOException {
		Pom_SearchHotel s = new Pom_SearchHotel();
		String pageTitle2 = getPageTitle();
		String sPageTitle = "Adactin.com - Search Hotel";
		Assert.assertEquals(sPageTitle, pageTitle2);
		wait(2000);
		WebElement location = s.getLocation();
		boolean locationF = elementFound(location);
		Assert.assertTrue(locationF);
		select(location, 2);
		wait(2000);
		WebElement hotel = s.getHotel();
		boolean hotelF = elementFound(hotel);
		Assert.assertTrue(hotelF);
		select(hotel, 1);
		WebElement roomType = s.getRoomType();
		boolean roomTypeF = elementFound(roomType);
		Assert.assertTrue(roomTypeF);
		select(roomType, 1);
		WebElement noOfRoom = s.getNoOfRoom();
		boolean noOfRoomF = elementFound(noOfRoom);
		Assert.assertTrue(noOfRoomF);
		select(noOfRoom, 1);
		WebElement noOfAdult = s.getNoOfAdult();
		boolean noOfAdultF = elementFound(noOfAdult);
		Assert.assertTrue(noOfAdultF);
		select(noOfAdult, 1);
		WebElement noOfChild = s.getNoOfChild();
		boolean noOfChileF = elementFound(noOfChild);
		Assert.assertTrue(noOfChileF);
		select(noOfChild, 1);
		WebElement getsubmit = s.getsubmit();
		boolean getSubmitF = elementFound(getsubmit);
		Assert.assertTrue(getSubmitF);
		btnClick(getsubmit);
		wait(3000);
		}
		@Test
        public void testMethod3() {
		Pom_HotelSelect h = new Pom_HotelSelect();
		String pageTitle = getPageTitle();
		String title = "Adactin.com - Select Hotel";
		Assert.assertEquals(title, pageTitle);
		WebElement radio = h.getRadio();
		boolean radioF = elementFound(radio);
		Assert.assertTrue(radioF);
		btnClick(radio);
		WebElement continueclick = h.getContinueclick();
		boolean continueClickF = elementFound(continueclick);
		Assert.assertTrue(continueClickF);
		btnClick(continueclick);
}
		@Test
        public void testMethod4() throws InterruptedException {
        	String actual = getPageTitle();
        	String expected = "Adactin.com - Book A Hotel";
        	Assert.assertEquals(expected, actual);
		Pom_HotelBook b = new Pom_HotelBook();
		
		WebElement firstName = b.getFirstName();
		boolean elementFound = elementFound(firstName);
		Assert.assertTrue(elementFound);
		typeText(firstName, "Sudhar");
		WebElement lastName = b.getLastName();
		boolean elementFound2 = elementFound(lastName);
		Assert.assertTrue(elementFound2);
		typeText(lastName, "Ram");
		WebElement address = b.getAddress();
		boolean elementFound3 = elementFound(address);
		Assert.assertTrue(elementFound3);
		typeText(address,"this chennai perumbakkam omr navalur");
		WebElement getcNumber = b.getcNumber();
		boolean elementFound4 = elementFound(getcNumber);
		Assert.assertTrue(elementFound4);
		typeText(getcNumber, "1234567887654321");
		WebElement getcType = b.getcType();
		boolean elementFound5 = elementFound(getcType);
		Assert.assertTrue(elementFound5);
		select(getcType, 1);
		WebElement geteMonth = b.geteMonth();
		boolean elementFound6 = elementFound(geteMonth);
		Assert.assertTrue(elementFound6);
		select(geteMonth, 1);
		WebElement geteYear = b.geteYear();
		boolean elementFound7 = elementFound(geteYear);
		Assert.assertTrue(elementFound7);
		select(geteYear, 10);
		WebElement cvvNumber = b.getCvvNumber();
		boolean elementFound8 = elementFound(cvvNumber);
		Assert.assertTrue(elementFound8);
		typeText(cvvNumber, "124");
		WebElement getsButton = b.getsButton();
		boolean elementFound9 = elementFound(getsButton);
		Assert.assertTrue(elementFound9);
		btnClick(getsButton);
		wait(8000);
		}
		@Test
		public void testMethod5() {
	    String actual = getPageTitle();
	    String expected = "Adactin.com - Hotel Booking Confirmation";
		Pom_LastPage lp = new Pom_LastPage();
		WebElement orderNo = lp.getOrderNo();
		String actualOrderNo = orderNo.getAttribute("value");
		String expectedOrderNo = "J9C7LE159H";
//		Assert.assertNotEquals(expectedOrderNo, actualOrderNo);
		Assert.assertNotSame(expectedOrderNo, actualOrderNo);
		System.out.println(actualOrderNo);
		WebElement logout = lp.getLogout();
		logout.click();
        }
		
	
	}
		
		
	


