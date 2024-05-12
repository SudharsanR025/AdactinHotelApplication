package org.pom;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class Pom_SearchHotel extends BaseClass {
	
	public Pom_SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy (name = "location") , @FindBy (xpath = "//select[@id='location']")})
	private WebElement location;
	@FindAll({@FindBy (name = "hotels")  , @FindBy(xpath = "//select[@id='hotels']")})
	private WebElement hotel;
	@FindAll({@FindBy(name = "room_type") , @FindBy (xpath = "//select[@id='room_type']") })
	private WebElement roomType;
	@FindAll({@FindBy(name = "room_nos") , @FindBy (xpath ="//select[@id='room_nos']") })
	private WebElement noOfRoom;
	@FindAll({@FindBy(name ="adult_room") , @FindBy (xpath = "//select[@id='adult_room']") })
	private WebElement noOfAdult;
	@FindAll({@FindBy(name ="child_room") , @FindBy(xpath ="//select[@id='child_room']")})    
	private WebElement noOfChild;
	@FindBys({@FindBy(name = "Submit") , @FindBy(xpath ="//input[@id='Submit']")})
	private WebElement submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	public WebElement getNoOfAdult() {
		return noOfAdult;
	}
	public WebElement getNoOfChild() {
		return noOfChild;
	}
	public WebElement getsubmit() {
		return submit;
	}
	
	

}
