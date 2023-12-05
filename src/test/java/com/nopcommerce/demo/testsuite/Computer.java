package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Computer extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildPage buildPage = new BuildPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductArrangeInAlphaBeticalOrder() throws InterruptedException {
        homePage.selectMenu("Computers");
        computersPage.clickOnDesktop();
        List<WebElement> list = desktopsPage.getList();
        List<String> listBefore = new ArrayList<>();
        for (WebElement value : list) {
            listBefore.add(value.getText());
        }
        Thread.sleep(3000);
        desktopsPage.selectSortOption("6");
        Thread.sleep(3000);
        list = desktopsPage.getList();
        List<String> listAfter = new ArrayList<>();
        for (WebElement value : list) {
            listAfter.add(value.getText());
        }
        Collections.sort(listBefore, Collections.reverseOrder());
        Assert.assertEquals(listAfter, listBefore);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        homePage.selectMenu("Computers");
        computersPage.clickOnDesktop();
        desktopsPage.selectSortOption("5");
        Thread.sleep(3000);
        desktopsPage.clickOnAddToCart();
        verifyTwoStrings("Build your own computer", By.xpath("//h1[contains(text(),'Build your own computer')]"));
        buildPage.selectProcessor("1");
        buildPage.selectRAM("5");
        buildPage.clickOnHDD();
        buildPage.clickOnOS();
        buildPage.clickOnSoftware();
        verifyTwoStrings("$1,475.00", By.xpath("//span[normalize-space() = '$1,475.00']"));
        buildPage.clickOnAddToCart();
        verifyTwoStrings("The product has been added to your shopping cart", By.xpath("//p[@class = 'content']"));
        buildPage.clickOnClose();
        buildPage.mouseHoverToShoppingCart();
        Thread.sleep(3000);
        buildPage.mouseHoverToGoToCartAndClick();
        verifyTwoStrings("Shopping cart", By.xpath("//h1[contains(text(),'Shopping cart')]"));
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdateCart();
        verifyTwoStrings("$2,950.00", By.xpath("//span[text()='$2,950.00'][@class = 'product-subtotal']"));
        shoppingCartPage.clickOnTerms();
        shoppingCartPage.clickOnCheckout();
        verifyTwoStrings("Welcome, Please Sign In!", By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        signInPage.clickOnCheckoutAsGuest();
        checkoutPage.enterFirstName("Khushi");
        checkoutPage.enterLastName("Raval");
        checkoutPage.enterEmail("prime23@gmail.com");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.enterCity("London");
        checkoutPage.enterAddress("abc");
        checkoutPage.enterPostCode("Ec1 2Pq");
        checkoutPage.enterPhoneNumber("08128008080");
        checkoutPage.clickOnSave();
        checkoutPage.clickOnShippingMethod();
        checkoutPage.clickOnContinueShipping();
        checkoutPage.clickOnPaymentMethod();
        checkoutPage.clickOnContinuePayment();
        checkoutPage.selectCreditCard("MasterCard");
        checkoutPage.enterCardHolderName("Khushi Raval");
        checkoutPage.enterCardNumber("1111222233334444");
        checkoutPage.selectMonth("5");
        checkoutPage.selectYear("2030");
        checkoutPage.enterCardCode("123");
        checkoutPage.clickOnContinueCard();
        verifyTwoStrings("Payment Method: Credit Card", By.xpath("//li[@class='payment-method']"));
        verifyTwoStrings("Shipping Method: Next Day Air", By.xpath("//li[@class='shipping-method']"));
        verifyTwoStrings("$2,950.00", By.xpath("//span[text()='$2,950.00'][@class = 'product-subtotal']"));
        checkoutPage.clickOnConfirm();
        verifyTwoStrings("Thank you", By.xpath("//h1[contains(text(),'Thank you')]"));
        verifyTwoStrings("Your order has been successfully processed!", By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
        checkoutPage.clickOnConfirmOrder();
        verifyTwoStrings("Welcome to our store",By.xpath("//h2[contains(text(),'Welcome to our store')]"));

    }
}
