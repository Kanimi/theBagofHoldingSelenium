package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SeleniumLoginTest {

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
    public void loginForm() throws InterruptedException, IOException {
        driver.get("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingFrontEnd\\FrontEnd\\index.html");
        Thread.sleep(2000);
        WebElement username = driver.findElementById("username");
        WebElement password = driver.findElementById("password");
        username.click();
        username.sendKeys("admin");
        Thread.sleep(200);
        password.click();
        password.sendKeys("password");
        Thread.sleep(2000);
        File loginformss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(loginformss, new File("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingSelenium\\src\\test\\java\\screenshots\\loginFormTest.png"));
        WebElement loginbutton = driver.findElementById("login");
        loginbutton.click();
        Thread.sleep(2000);
    }
}
