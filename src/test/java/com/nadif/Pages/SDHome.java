package com.nadif.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SDHome {
    By productTitles = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    WebDriver driver;

    public  SDHome(WebDriver driver){
        this.driver = driver;
    }
    public void validateElement(){
        WebElement productElement = driver.findElement(productTitles);
        Assert.assertTrue(productElement.isDisplayed());
        Assert.assertEquals("Sauce Labs Backpack",productElement.getText());
    }
}
