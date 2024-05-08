package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardDetails extends BaseClass {
	public CardDetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Cart']")
	private WebElement viewcard;
	public WebElement getViewcard() {
		return viewcard;
	}
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}

}
