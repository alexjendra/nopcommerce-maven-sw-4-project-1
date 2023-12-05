package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

        By listView = By.xpath("//a[contains(text(),'List')]");
        By nokia = By.xpath("//a[@title = 'Show details for Nokia Lumia 1020']");
        public void clickOnListView(){
            clickOnElement(listView);
        }
        public void clickOnNokia(){
            clickOnElement(nokia);
        }
}
