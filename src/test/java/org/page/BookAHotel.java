package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {
public BookAHotel() {
	
	PageFactory.initElements(driver, this);
}
	@FindBy(id="first_name")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath="//textarea[@class='txtarea']")
	private WebElement billaddress;
	public WebElement getBilladdress() {
		return billaddress;
	}
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement CrediteCardNo;
	public WebElement getCrediteCardNo() {
		return CrediteCardNo;
	}
	
	@FindBy(id="cc_type")
	private WebElement CreditCardType;
	public WebElement getCreditCardType() {
		return CreditCardType;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement selectmonth;
	public WebElement getSelectmonth() {
		return selectmonth;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement selectyear;
	public WebElement getSelectyear() {
		return selectyear;
	}
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvno;
	public WebElement getCvvno() {
		return cvvno;
	}
	
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
}
