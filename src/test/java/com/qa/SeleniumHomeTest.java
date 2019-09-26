package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHomeTest {

    private ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanim\\Dropbox\\Programming\\Selenium\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void homeTest() throws InterruptedException {
        driver.get("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingFrontEnd\\FrontEnd\\home.html");
        Thread.sleep(2000);
        WebElement nav = driver.findElementById("dashboard");
        nav.click();
        Thread.sleep(2000);
        WebElement nav2 = driver.findElementById("home");
        nav2.click();
        Thread.sleep(2000);
        WebElement button = driver.findElementById("learnMore");
        button.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement profile = driver.findElementById("profile");
        profile.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
}
