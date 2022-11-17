package com.krafttechnologie.test.day8_WebElement2;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class listOfElements {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }



    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/javascript/clicks");

        List<WebElement> buttons=driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(),4);

        for (WebElement buton:buttons) {
            System.out.println("buton.getText() = " + buton.getText());
            System.out.println("buton.isDisplayed() = " + buton.isDisplayed());

        }
        Thread.sleep(2000);
        buttons.get(2).click();


    }



}
