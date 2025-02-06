package com.nadif.stepdefinition;

import com.Base.SDBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class SDHooks extends SDBase {
    @Before
    public void beforeTest(){
        driverGet();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
