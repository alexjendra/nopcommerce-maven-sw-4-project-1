package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {
    By quantity = By.xpath("//input[@class = 'qty-input']");
    By updateCart = By.id("updatecart");
    By termsofservice = By.id("termsofservice");
    By checkout = By.id("checkout");
    By logIn = By.xpath("//a[contains(text(),'Log in')]");

    public void changeQuantity(){
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity,"2");
    }

    private WebElement getElement(By quantity) {
        return null;
    }

    public void clickOnUpdateCart(){
        clickOnElement(updateCart);
    }
    public void clickOnTerms(){
        clickOnElement(termsofservice);
    }
    public void clickOnCheckout(){
        clickOnElement(checkout);
    }
    public void clickOnLogIn(){
        clickOnElement(logIn);
    }
}
