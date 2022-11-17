package com.krafttechnologie.test.day8_WebElement2;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class İsDisPlayed {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement inputBox= driver.findElement(By.cssSelector("#firstName"));

        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());

        Assert.assertTrue(inputBox.isDisplayed(),"verify is Failed");
    }
}
