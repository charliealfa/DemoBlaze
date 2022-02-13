package com.tests.pages;

import com.tests.utilities.BrowserUtils;
import com.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

@FindBy(css = "a.navbar-brand")
public WebElement pageSubTitle;

@FindBy(xpath = "//div[@id='navbarExample']//li/a")
public List<WebElement> tabs;

@FindBy(css = "div.list-group>a")
public List<WebElement> categories;

@FindBy(xpath = "//div[@id='tbodyid']//h4/a")
public List<WebElement> productNames;

    public MainPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public List<String> getTabs() {
        List<String> shownTabs = new ArrayList<>();

        for (WebElement tab:tabs) {
            if(!tab.getText().isBlank()){
                if(tab.getText().contains("(")){
                    shownTabs.add(tab.getText().substring(0,tab.getText().indexOf("(")).trim());
                }else{
                shownTabs.add(tab.getText().trim());
            }}
        }
        return shownTabs;
    }

    public List<String> getCategories(){
        return BrowserUtils.getElementsText(categories);
    }

    public List<String> getProductNames(){

        return BrowserUtils.getElementsText(productNames);
    }
}