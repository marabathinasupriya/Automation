package com.academybugs.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
 
@FindBy(xpath="//a[text()='ADD TO CART' and @id='ec_add_to_cart_5']")
private static WebElement clickoncart;

@FindBy(xpath="//a[text()='View Cart']")
private static WebElement viewcart;


public AddToCart(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//to click on add to cart
public void clickonaddtocart() throws InterruptedException
{
	clickoncart.click();
	Thread.sleep(4000);
	viewcart.click();
	
}
}

