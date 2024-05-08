package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	//constructor
	//will initialize all the variable from this class always 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	} 
	
}
