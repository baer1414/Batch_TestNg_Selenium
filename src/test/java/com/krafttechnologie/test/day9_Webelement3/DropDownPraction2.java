package com.krafttechnologie.test.day9_Webelement3;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownPraction2 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement checOp= driver.findElement(By.xpath("//input[@value='option-1']"));
        checOp.click();

        WebElement checOp1= driver.findElement(By.xpath("//input[@value='option-3']"));
        checOp1.click();

        WebElement checOp2= driver.findElement(By.xpath("//input[@value='option-4']"));
        checOp2.click();

    }





    }
