package com.tests.step_definitions;

import com.tests.pages.MainPage;
import com.tests.utilities.BrowserUtils;
import com.tests.utilities.ConfigurationReader;
import com.tests.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class MainPageShcemeDefs {

    MainPage mainPage = new MainPage();

    @Given("the user on the main page")
    public void the_user_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("verify page title {string}")
    public void verify_page_title(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify Page Title",expectedTitle,actualTitle);
    }

    @Then("verify page subtitle contains {string}")
    public void verify_page_subtitle_contains(String expectedSubTitle) {
        String actualSubTitle = mainPage.pageSubTitle.getText();
        Assert.assertEquals(expectedSubTitle,actualSubTitle);
    }

    @Then("verify page tabs")
    public void verify_page_tabs(List<String> expectedTabs) {
        List<String> actualTabs = mainPage.getTabs();

        Assert.assertEquals(expectedTabs,actualTabs);
    }

    @Given("verify category titles")
    public void verify_category_titles(List<String> expectedTitles) {
        BrowserUtils.waitForPageToLoad(5);
    List<String> actualTitles = mainPage.getCategories();

    Assert.assertEquals(expectedTitles,actualTitles);
    }

    @Given("verify product names")
    public void verify_product_names(List<String> expectedProducts) {
        BrowserUtils.waitFor(1);
        List<String> actualProducts = mainPage.getProductNames();

        Assert.assertEquals(expectedProducts,actualProducts);
    }

}
