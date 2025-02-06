package com.nadif.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.nadif.stepdefinition",
        features = "src/test/resources/features",
        plugin = {"pretty","html:reports/StepDefinitionReport.html","json:reports/StepDefinitionReport.json"}
        //"pretty" memperliatkan report hasil test by Line
        //"html" untuk membuat report dalam bentuk HTML
        //"json" untuk membuat report dalam bentuk Json
)
public class RunTestforStepDifinition {
}
