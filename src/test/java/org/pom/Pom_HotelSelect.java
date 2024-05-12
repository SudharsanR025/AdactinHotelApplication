package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_HotelSelect extends BaseClass {
	public Pom_HotelSelect() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name = "radiobutton_0") , @FindBy (xpath = "//input[@type='radio']")})
	private WebElement radio;
	@FindBy(name ="continue")
	private WebElement continueclick;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinueclick() {
		return continueclick;
	}

	
	

}
