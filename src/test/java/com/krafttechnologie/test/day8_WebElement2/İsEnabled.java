package com.krafttechnologie.test.day8_WebElement2;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class İsEnabled {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }



    @Test
    public void test2(){
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox2= driver.findElement(By.cssSelector("#gridCheck3"));

        System.out.println("checkBox2.isEnabled() = " + checkBox2.isEnabled());

        Assert.assertFalse(checkBox2.isEnabled(),"verify is FAİL");
    }


    @Test
    public void test(){
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox= driver.findElement(By.cssSelector("#gridCheck2"));

        System.out.println("checkBox.isEnabled() = " + checkBox.isEnabled());

        Assert.assertTrue(checkBox.isEnabled(),"verify is FAİL");
    }
}
