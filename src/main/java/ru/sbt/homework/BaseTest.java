package ru.sbt.homework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by a1wen on 29.08.2017.
 */
public class BaseTest {
    private static WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        /*System.setProperty("webdriver.gecko.driver","C:\\Users\\a1wen\\Desktop\\example\\headpagetest\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();*/
        System.setProperty("webdriver.ie.driver","C:\\Users\\a1wen\\Desktop\\example\\headpagetest\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        baseUrl = "http://sberbank.ru/";
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().window().setSize(new Dimension(1300,900));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    public static WebDriver getInstance(){
        return driver;
    }
}
