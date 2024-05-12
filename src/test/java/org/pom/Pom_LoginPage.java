package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom_LoginPage extends BaseClass{
	
	public Pom_LoginPage() {
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBys ({@FindBy(name ="username") , @FindBy(xpath = "(//input[@class='login_input'])[1]")})
	private WebElement username ;
	@FindBys({  @FindBy (name = "password"), @FindBy  (xpath = "//input[@id='password']")})
	private WebElement password;
	@FindAll({    @FindBy (name = "login") , @FindBy (xpath = "//input[@id='login']") })
	
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

}
