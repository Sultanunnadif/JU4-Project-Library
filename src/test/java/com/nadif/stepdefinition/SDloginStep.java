package com.nadif.stepdefinition;

import com.Base.SDBase;
import com.nadif.Pages.SDLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.Base.SDBase.driver;

public class SDloginStep extends SDBase{

    //@Before                                     //cucumber hooks digunakan disini klo tidak ada CucumberHooks
    //public void beforeTest(){
    //driver = WebDriverManager.chromiumdriver().create();
    //}
    //@After
    //public void afterTest(){
    //driver.close();
    //}

    protected SDLogin loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        //driver.get("https://www.saucedemo.com"); //digunakan disini klo tidak ada BaseSauce
        loginPage = new SDLogin(driver);
        loginPage.loginHomepage();
    }

    @When("user input email text box with {string}")
    public void userInputEmailTextBoxWith(String username) {
        //By usernameInputTest = By.cssSelector("input#user-name");
        //driver.findElement(usernameInputTest).sendKeys(username); //digunakan disini klo tidak ada BaseSauce
    }

    @And("user input password on text box {string}")
    public void userInputPasswordOnTextBox(String password) {
        //By paswordInputTest = By.xpath("//*[@id=\"password\"]");
        //driver.findElement(paswordInputTest).sendKeys(password); //digunakan disini klo tidak ada BaseSauce
    }

    @And("user click Login button")
    public void userClickLoginButton() {
        //By loginButton = By.id("login-button");
        //driver.findElement(loginButton).click(); //digunakan disini klo tidak ada BaseSauce
    }

//    @Then("user will redirect to homepage") //Pindah ke homeStep
//    public void userWillRedirectToHomepage() {
//        By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
//        WebElement productElement = driver.findElement(productTitle);
//        assertTrue(productElement.isDisplayed());
//        assertEquals("Sauce Labs Backpack",productElement.getText());
//    }

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
    }

    @And("user see error message {string}")
    public void userSeeErrorMessage(String errorMessage) {
        //assertTrue(driver.getPageSource().contains(errorMessage)); //digunakan disini klo tidak ada BaseSauce
    }
}
