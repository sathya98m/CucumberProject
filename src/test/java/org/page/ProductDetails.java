package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails extends BaseClass {
	public ProductDetails() {
		PageFactory.initElements(driver, this);	
}
	@FindBy(xpath="(//span[text()='Add To Cart'])[4]")
	private WebElement SelectProduct;
	public WebElement getSelectProduct() {
		return SelectProduct;
	}
	
	@FindBy(xpath="(//span[text()='Add To Cart'])[6]")
	private WebElement selectProcduct1;
	public WebElement getSelectProcduct1() {
		return selectProcduct1;
	}
}
