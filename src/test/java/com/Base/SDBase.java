package com.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SDBase {
    public static WebDriver driver;

    public void driverGet(){
//        ChromeOptions options = new ChromeOptions(); //untuk headless atau tanpa eksekusi website
//        options.addArguments("--headless");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);

        driver = WebDriverManager.chromedriver().create();
    }
}
