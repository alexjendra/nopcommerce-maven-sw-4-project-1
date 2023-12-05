package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildPage extends Utility {
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hdd = By.id("product_attribute_3_7");
    By os = By.id("product_attribute_4_9");
    By software = By.id("product_attribute_5_12");
    By addToCart = By.id("add-to-cart-button-1");
    By close = By.xpath("//span[@class = 'close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    public void selectProcessor(String optionValue){
        selectByValueFromDropDown(processor,optionValue);
    }
    public void selectRAM(String optionValue){
        selectByValueFromDropDown(ram,optionValue);
    }
    public void clickOnHDD(){
        clickOnElement(hdd);
    }
    public void clickOnOS(){
        clickOnElement(os);
    }
    public void clickOnSoftware(){
        clickOnElement(software);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnClose(){
        clickOnElement(close);
    }
    public void mouseHoverToShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void mouseHoverToGoToCartAndClick(){
        mouseHoverToElementAndClick(goToCart);
    }
}
