package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Electronics");
        verifyTwoStrings("Electronics", By.xpath("//a[contains(.,'Electronics')]"));


    }
}
