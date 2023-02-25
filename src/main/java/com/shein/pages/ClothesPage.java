package com.shein.pages;

import com.shein.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage extends Utility {

    public ClothesPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[1]/header/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/nav/div[4]/a")
    WebElement clothing;

    @FindBy(xpath = "//a[@class=' j-nav-first-cate j-nav-first-cate-3  first-cate  ']")
    WebElement mensection;
    @FindBy(xpath = "//nav[@class='header-v2__nav2']/div[3]/a")
    WebElement sale;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/section/div[1]/section[1]/div[2]/div[1]/a")
    WebElement product;

    @FindBy(xpath = "//div[@class='product-intro__add-btn']/button")
    WebElement addToBag;

    @FindBy(xpath = "//div[@class='product-intro__size-radio-inner'][text()='M(38)']")
    WebElement size;

    @FindBy(xpath = "//a[@class='j-ipad-prevent-a j-sa-cart-1']")
    WebElement viewBag;

    @FindBy(xpath = "//h4[@class='cart-summary-title']")
    WebElement orderSummary;

    @FindBy(xpath = "//button[@class='sui-button-common sui-button-common__block sui-button-common__primary sui-button-common__H28PX ml-120']")
    WebElement closepopup;

    @FindBy(xpath = "//i[@class='sui-icons icons-Close-Alert']")
    WebElement closepopup2;


    public void clickonClothing(){
        clickOnElement(clothing);
    }
    public void clickonMen(){
        clickOnElement(mensection);
    }
    public void clickonSale(){
        clickOnElement(sale);
    }
    public void clickOnProduct(){
        clickOnElement(product);
    }
    public void clickOnAddToBag(){
        clickOnElement(addToBag);
    }
    public void selectSize(){
        clickOnElement(size);
    }
    public void clickonViewBag(){
        clickOnElement(viewBag);
    }
    public String verifyText(){
        return getTextFromElement(orderSummary);
    }
    public void closeWindow(){
        clickOnElement(closepopup);
        clickOnElement(closepopup2);
    }
}
