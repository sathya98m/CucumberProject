package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	
	
}
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
	}

