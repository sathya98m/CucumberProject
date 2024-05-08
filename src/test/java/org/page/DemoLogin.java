package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLogin extends BaseClass {
	
	
	public DemoLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='cursor-pointer relative text-right']")
	private WebElement loginbutton;
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	public WebElement getMobile() {
		return mobile;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sighinbutton;
	
	public WebElement getSighinbutton() {
		return sighinbutton;
	}
}
