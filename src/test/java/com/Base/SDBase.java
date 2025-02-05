package com.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class SDBase {
    public static WebDriver driver;

    public void driverGet(){
        driver = WebDriverManager.chromedriver().create();
    }
}
