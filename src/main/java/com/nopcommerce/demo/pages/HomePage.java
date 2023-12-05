package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space() = 'Electronics']");
    By cellPhones = By.xpath("//a[text() = 'Cell phones ']");
    By logOut = By.xpath("//a[contains(text(),'Log out')]");
    public void selectMenu(String menu){
        //click on menu
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space() = '" + menu + "']"));
    }
    public void mouseHoverOnElectronics(){
        mouseHoverToElement(electronics);
    }
    public void mouseHoverOnCellPhones(){
        mouseHoverToElementAndClick(cellPhones);
    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }
}
