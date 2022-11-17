package com.krafttechnologie.test.day8_WebElement2;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class isSelected_Checkbox {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }



    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/forms/checkbox");

        WebElement checkBox= driver.findElement(By.cssSelector("#gridCheck1"));
        WebElement checkBox1= driver.findElement(By.cssSelector("#gridCheck2"));

        System.out.println("checkBox.isSelected() = " + checkBox.isSelected());
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        Assert.assertFalse(checkBox.isSelected(),"FAİL");
        Assert.assertTrue(checkBox1.isSelected(),"FAİL");

        Thread.sleep(2000);

        checkBox.click();
        Assert.assertTrue(checkBox.isSelected(),"FAİL");


    }
}
