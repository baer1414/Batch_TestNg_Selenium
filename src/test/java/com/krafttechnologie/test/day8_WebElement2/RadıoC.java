package com.krafttechnologie.test.day8_WebElement2;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadıoC {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }



    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.krafttechexlab.com/forms/radio");


        WebElement radio= driver.findElement(By.cssSelector("#gridRadios1"));
        WebElement radio2= driver.findElement(By.cssSelector("#gridRadios2"));



        System.out.println("radio.isSelected() = " + radio.isSelected());
        System.out.println("radio2.isSelected() = " + radio2.isSelected());

       Assert.assertTrue(radio.isSelected(),"Fail");
       Assert.assertFalse(radio2.isSelected(),"Fail");

       radio2.click();

        Assert.assertFalse(radio.isSelected(),"Fail");
        Assert.assertTrue(radio2.isSelected(),"Fail");


    }
}
