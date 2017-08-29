package ru.sbt.homework;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

/**
 * Created by a1wen on 29.08.2017.
 */
public class BaseSteps extends ScenarioSteps {
    MainPage mainPage = new MainPage();

    @Step("Выбор региона")
    public void regionSelectorClick(){
        mainPage = new MainPage();
        mainPage.regionSelector.click();
    }

    @Step("Поиск Нижегородской области")
    public void setRegion(String region){
        mainPage.regionInput.sendKeys(region);
    }

    @Step("Проверка отображения Нижегородской области")
    public void assertRegion(String region){
        assertEquals(region, mainPage.getRegion());
    }

}
