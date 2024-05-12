package org.pom;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pom_LastPage extends BaseClass {
	public Pom_LastPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name = "logout") , @FindBy (xpath = "//input[@id='logout']")})
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(name = "order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}

}
