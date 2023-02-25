package com.shein.pages;

import com.shein.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='onetrust-banner-options']//button[text()='Accept']")
    WebElement acceptcoockie;

    @FindBy(xpath = "//i[@class='iconfont icon-close she-close']")
    WebElement closeframe;

    public void clickonacceptcookie (){
        clickOnElement(acceptcoockie);
    }
    public void clickonCloseFrame(){
        clickOnElement(closeframe);
    }

}
