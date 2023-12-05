package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NokiaPage extends Utility {
    By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By close = By.xpath("//span[@class = 'close']");

    public void changeQuantity(String text){
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity,text);
    }

    private WebElement getElement(By quantity) {
        return null;
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnClose(){
        clickOnElement(close);
    }
}
