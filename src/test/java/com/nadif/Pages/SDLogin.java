package com.nadif.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
