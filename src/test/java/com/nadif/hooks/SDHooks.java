package com.nadif.hooks;

import com.Base.SDBase;
import org.junit.After;
import org.junit.Before;

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
