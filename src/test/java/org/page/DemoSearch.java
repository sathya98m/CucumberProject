package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSearch extends BaseClass{
	
	public DemoSearch() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='sc-hzDkRC ksImnc']")
	private WebElement searchbar;
	
	public WebElement getSearchbar() {
		return searchbar;
	}
	

	@FindBy(xpath="//button[text()='Face Wash']")
	private WebElement product;
	public WebElement getProduct() {
		return product;
	}
	
	

}
