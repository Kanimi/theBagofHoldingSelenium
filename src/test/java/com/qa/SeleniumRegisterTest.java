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

public class SeleniumRegisterTest {

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
    public void registerForm() throws InterruptedException, IOException {
        driver.get("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingFrontEnd\\FrontEnd\\register.html");
        Thread.sleep(2000);
        WebElement username = driver.findElementById("username");
        Thread.sleep(200);
        username.click();
        username.sendKeys("admin");
        WebElement password = driver.findElementById("password");
        Thread.sleep(200);
        password.click();
        password.sendKeys("password");
        Thread.sleep(200);
        WebElement password2 = driver.findElementById("repeatpassword");
        password2.click();
        password2.sendKeys("password");
        Thread.sleep(200);
        WebElement email = driver.findElementById("email");
        email.click();
        email.sendKeys("Karolina.Dudek@academytrainee.com");
        Thread.sleep(200);
        WebElement email2 = driver.findElementById("confirmemail");
        email2.click();
        email2.sendKeys("Karolina.Dudek@academytrainee.com");
        Thread.sleep(2000);
        File registerformss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(registerformss, new File("C:\\Users\\kanim\\Dropbox\\Programming\\theBagofHoldingSelenium\\src\\test\\java\\screenshots\\registrationFormTest.png"));
        WebElement registerbutton = driver.findElementById("registerButton");
        registerbutton.click();
        Thread.sleep(2000);
        //loop doesn't work here as it's mixed 50/50 fields of password and text type
    }
}
