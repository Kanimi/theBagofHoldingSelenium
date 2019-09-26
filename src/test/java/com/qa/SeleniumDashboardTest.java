package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class SeleniumDashboardTest {

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
    public void addDice() throws InterruptedException, IOException {
        driver.get("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingFrontEnd\\FrontEnd\\dashboard.html");
        Thread.sleep(5000);
        WebElement addbutton = driver.findElementById("addButton");
        WebElement amount = driver.findElementById("amount");
        WebElement colour = driver.findElementById("colour");
        WebElement material = driver.findElementById("material");
        WebElement type = driver.findElementById("type");
        amount.click();
        amount.sendKeys(Keys.ARROW_DOWN, "-=+.e1234567890");
        colour.click();
        Thread.sleep(500);
        new Select(driver.findElementById("colour")).selectByIndex(5);
        material.click();
        Thread.sleep(500);
        new Select(driver.findElementById("material")).selectByIndex(5);
        type.click();
        Thread.sleep(500);
        new Select(driver.findElementById("type")).selectByIndex(9);
        Thread.sleep(2000);
        addbutton.click();
        Thread.sleep(500);
        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0,500)");
        File addss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(addss, new File("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingSelenium\\src\\test\\java\\screenshots\\addDiceTest.png"));
        Thread.sleep(2000);
    }

    @Test
    public void updateDice() throws InterruptedException, IOException {
        driver.get("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingFrontEnd\\FrontEnd\\dashboard.html");
        Thread.sleep(2000);
        WebElement updateById = driver.findElementById("updatebyID");
        WebElement updatebutton = driver.findElementById("updateButton");
        WebElement amount = driver.findElementById("updateAmount");
        WebElement colour = driver.findElementById("updateColour");
        WebElement material = driver.findElementById("updateMaterial");
        WebElement type = driver.findElementById("updateType");
        updateById.click();
        updateById.sendKeys("1");
        amount.click();
        amount.sendKeys(Keys.ARROW_DOWN, "-=+.e1234567890");
        colour.click();
        Thread.sleep(500);
        new Select(driver.findElementById("updateColour")).selectByIndex(6);
        material.click();
        Thread.sleep(500);
        new Select(driver.findElementById("updateMaterial")).selectByIndex(6);
        type.click();
        Thread.sleep(500);
        new Select(driver.findElementById("updateType")).selectByIndex(6);
        Thread.sleep(500);
        updatebutton.click();
        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0,500)");
        File updatess = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(updatess, new File("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingSelenium\\src\\test\\java\\screenshots\\updateDiceTest.png"));
        Thread.sleep(2000);
    }

    @Test
    public void deleteDice() throws InterruptedException, IOException {
        driver.get("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingFrontEnd\\FrontEnd\\dashboard.html");
        Thread.sleep(2000);
        WebElement deletebutton = driver.findElementByXPath("/html/body/div/div[2]/table[2]/tbody/tr/td[2]/input");
        WebElement id = driver.findElementByXPath("//*[@id=\"remove\"]");
        id.click();
        id.sendKeys("1");
        Thread.sleep(200);
        deletebutton.click();
        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0,500)");
        File deletess = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(deletess, new File("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingSelenium\\src\\test\\java\\screenshots\\deleteDiceTest.png"));
        Thread.sleep(2000);
    }
}
