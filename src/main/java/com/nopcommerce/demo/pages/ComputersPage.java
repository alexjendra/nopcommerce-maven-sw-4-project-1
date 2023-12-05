package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By desktop = By.xpath("//div[@class = 'sub-category-item']/h2/a[normalize-space() = 'Desktops']");
    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
}
