package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {
    By select = By.xpath("//select[@id = 'products-orderby']");
    By elements = By.xpath("//div[@class = 'details']//a");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    public void selectSortOption(String optionValue){
        selectByValueFromDropDown(select,optionValue);
    }

    public List<WebElement> getList(){
        return getListOfElements(elements);
    }

    private List<WebElement> getListOfElements(By elements) {
        return null;
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
}
