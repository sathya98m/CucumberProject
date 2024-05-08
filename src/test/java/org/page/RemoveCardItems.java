package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveCardItems extends BaseClass {
	public RemoveCardItems() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Cart']")
	private WebElement viewcard;
	public WebElement getViewcard() {
		return viewcard;
	}
	
	@FindBy(xpath="(//i[@class='minus-icon'])[3]")
	private WebElement removecarditems1;
	public WebElement getRemovecarditems1() {
		return removecarditems1;
	}
	
	@FindBy(xpath="(//i[@class='minus-icon'])[2]")
	private WebElement removecarditems2;
	public WebElement getRemovecarditems2() {
		return removecarditems2;
	}
	
	@FindBy(xpath="//button[text()='SHOP NOW']")
	private WebElement shopnow;
	public WebElement getShopnow() {
		return shopnow;
	}
	

}
