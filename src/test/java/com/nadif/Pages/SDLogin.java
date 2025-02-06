package com.nadif.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

    public class SDLogin {
    WebDriver driver;

        By usernameInput = By.cssSelector("input#user-name");
        By passwordInput =By.xpath("//*[@id=\"password\"]");
        By loginButton = By.id("login-button");

    public SDLogin(WebDriver driver){
        this.driver = driver;
    }
    public void loginHomepage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void loginButton(){
        driver.findElement(loginButton).click();
    }
    public void validatedError(String errorMessage){
        Assert.assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
