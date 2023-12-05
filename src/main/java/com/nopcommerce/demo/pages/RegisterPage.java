package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By gender = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By continueRegister = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnGender() {
        clickOnElement(gender);
    }

    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }
    public void enterEmail(String text){
        sendTextToElement(email,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
        sendTextToElement(confirmPassword,text);
    }
    public void clickOnRegister(){
        clickOnElement(registerButton);
    }
    public void clickOnContinueRegister(){
        clickOnElement(continueRegister);
    }
}
