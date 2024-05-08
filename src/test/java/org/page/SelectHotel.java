package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement select;
	public WebElement getSelect() {
		return select;
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement contbutton;
	public WebElement getContbutton() {
		return contbutton;
	}
}
