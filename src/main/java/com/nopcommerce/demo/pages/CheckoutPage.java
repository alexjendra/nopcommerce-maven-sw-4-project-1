package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By save = By.xpath("//button[@name = 'save']");
    By shippingMethod = By.id("shippingoption_1");
    By shippingMethod2 = By.id("shippingoption_2");
    By continueShipping = By.xpath("//button[text() = 'Continue'][@class = 'button-1 shipping-method-next-step-button']");
    By paymentMethod = By.id("paymentmethod_1");
    By continuePayment = By.xpath("//div[@id='payment-method-buttons-container']//button[text()='Continue']");
    By selectCreditCard = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueCard = By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']");
    By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By confirmOrder = By.xpath("//button[contains(text(),'Continue')]");
    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void enterEmail(String text) {
        sendTextToElement(email, text);
    }

    public void selectCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    public void enterCity(String text) {
        sendTextToElement(city, text);
    }

    public void enterAddress(String text) {
        sendTextToElement(address, text);
    }

    public void enterPostCode(String text) {
        sendTextToElement(postCode, text);
    }

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);
    }

    public void clickOnSave() {
        clickOnElement(save);
    }

    public void clickOnShippingMethod() {
        clickOnElement(shippingMethod);
    }
    public void clickOnShippingMethod2() {
        clickOnElement(shippingMethod2);
    }

    public void clickOnContinueShipping() {
        clickOnElement(continueShipping);
    }

    public void clickOnPaymentMethod() {
        clickOnElement(paymentMethod);
    }

    public void clickOnContinuePayment() {
        clickOnElement(continuePayment);
    }

    public void selectCreditCard(String text) {
        selectByValueFromDropDown(selectCreditCard, text);
    }

    public void enterCardHolderName(String text) {
        sendTextToElement(cardHolderName, text);
    }

    public void enterCardNumber(String text) {
        sendTextToElement(cardNumber, text);
    }
    public void selectMonth(String text) {
        selectByValueFromDropDown(expireMonth, text);
    }
    public void selectYear(String text) {
        selectByValueFromDropDown(expireYear, text);
    }
    public void enterCardCode(String text) {
        sendTextToElement(cardCode, text);
    }
    public void clickOnContinueCard(){
        clickOnElement(continueCard);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }
    public void clickOnConfirmOrder(){
        clickOnElement(confirmOrder);
    }
}
