package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom_HotelBook  extends BaseClass{
	public Pom_HotelBook() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy (name ="first_name") , @FindBy (xpath = "(//input[@class='reg_input'])[1]") })
	private WebElement firstName;
	@FindAll({@FindBy(name ="last_name") , @FindBy (xpath ="(//input[@class='reg_input'])[2]")})
	private WebElement lastName;
	@FindAll({@FindBy(name ="address") ,@FindBy(xpath ="//textarea[@class='txtarea']") })
	private WebElement address;
	@FindBys({@FindBy(name ="cc_type") , @FindBy (xpath ="//select[@id='cc_type']")})
	private WebElement cType;
	@FindAll({@FindBy(name ="cc_num") , @FindBy (xpath="(//input[@class='reg_input'])[3]") })
	private WebElement cNumber;
	@FindAll({@FindBy(name = "cc_exp_month") , @FindBy(xpath = "//select[@id='cc_exp_month']")})
	private WebElement eMonth;
	@FindAll({@FindBy(name ="cc_exp_year") , @FindBy (xpath = "//select[@id='cc_exp_year']") })
	private WebElement eYear;
	@FindAll({@FindBy(name ="cc_cvv") , @FindBy(xpath = "(//input[@class='reg_input'])[4]") })
	private WebElement cvvNumber;
	@FindBy(name ="book_now")
	private WebElement sButton;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getcType() {
		return cType;
	}
	public WebElement getcNumber() {
		return cNumber;
	}
	public WebElement geteMonth() {
		return eMonth;
	}
	public WebElement geteYear() {
		return eYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getsButton() {
		return sButton;
	}
	
	

}
