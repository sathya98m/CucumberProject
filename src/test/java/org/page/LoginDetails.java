package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDetails extends BaseClass {
	public LoginDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement phonenum;
	public WebElement getPhonenum() {
		return phonenum;
	}
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement pincode;
	public WebElement getPincode() {
		return pincode;
	}
	
	@FindBy(xpath="//input[@name='street']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(xpath="//span[text()='Home']")
	private WebElement home;
	public WebElement getHome() {
		return home;
	}
	
	@FindBy(xpath="//span[text()='Cash on Delivery']")
	private WebElement paymentmethod;
	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

}
