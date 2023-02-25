package com.shein.steps;

import com.shein.pages.ClothesPage;
import com.shein.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageTest {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
         new Homepage().clickonacceptcookie();
         new Homepage().clickonCloseFrame();
    }

    @When("^I click on clothing$")
    public void iClickOnClothing() {
        new ClothesPage().clickonClothing();
    }

    @And("^I click on men section$")
    public void iClickOnMenSection() {
        new ClothesPage().clickonMen();
    }

    @And("^I click on sale$")
    public void iClickOnSale() {
        new ClothesPage().clickonSale();
    }

    @And("^I click on product$")
    public void iClickOnProduct() {
        new ClothesPage().clickOnProduct();
    }

    @Then("^I click on add to bag$")
    public void iClickOnAddToBag() {
        new ClothesPage().clickOnAddToBag();
    }

    @And("^I select size$")
    public void iSelectSize() {
        new ClothesPage().selectSize();
    }

    @And("^I click on view bag$")
    public void iClickOnViewBag() {
        new ClothesPage().clickonViewBag();
    }

    @Then("^I should verify product added to bag or not$")
    public void iShouldVerifyProductAddedToBagOrNot() {
        new ClothesPage().closeWindow();
        String actualMessage = new ClothesPage().verifyText();
        String expectedMessage = "Order Summary";
        Assert.assertEquals(actualMessage,expectedMessage,"order verfied");
    }
}
