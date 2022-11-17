package com.krafttechnologie.test.day9_Webelement3;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownWithSelect {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }


    @Test
public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

    WebElement dropDown= driver.findElement(By.cssSelector("#oldSelectMenu"));

    Select selectMenu=new Select(dropDown);

    String expectionOption="Red";
    String actual=selectMenu.getFirstSelectedOption().getText();

    System.out.println("actual = " + actual);

    Assert.assertEquals(actual,expectionOption,"FAİL");

    Thread.sleep(2000);
//selectByVisible
        selectMenu.selectByVisibleText("Black");

        expectionOption="Black";
        actual=selectMenu.getFirstSelectedOption().getText();
        System.out.println("actual = " + actual);

        Assert.assertEquals(actual,expectionOption,"FAIL");

        Thread.sleep(2000);
//index
        selectMenu.selectByIndex(6);

        expectionOption="White";
        actual=selectMenu.getFirstSelectedOption().getText();
        System.out.println("actual = " + actual);
        Assert.assertEquals(actual,expectionOption,"FAIL");

   //value
Thread.sleep(2000);
        selectMenu.selectByValue("3");
        expectionOption="Yellow";

        actual=selectMenu.getFirstSelectedOption().getText();


        Assert.assertEquals(actual,expectionOption,"FAIL");

    }
}
