package com.academybugs.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart1 {

	//Product added to my cart
	@FindBy(xpath="//div[@class='ec_details_add_to_cart']")
	private WebElement cart;

	public AddtoCart1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void Test3() {
		cart.click();
	}

}
