package com.nadif.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.nadif.stepdefinition",
        features = "src/test/resources/features",
        plugin = {"pretty"}
)
public class RunTest {
}
