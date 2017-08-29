package ru.sbt.homework;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by a1wen on 29.08.2017.
 */
public class MainPage extends PageObject {

    private WebDriver driver;

    public MainPage(){
        PageFactory.initElements(BaseTest.getInstance(), this);
        this.driver = driver;

    }

    @FindBy(xpath = "//span[@class = 'region-list__name']", timeoutInSeconds="10")
    public WebElement regionSelector;


    @FindBy(xpath = "//input[@class='kit-input__control']")
    public WebElement regionInput;

    public String getRegion(){
        return regionSelector.getAttribute("value");
    }
}
