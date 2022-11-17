package com.krafttechnologie.test.day9_Webelement3;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownPractice1 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. DropDowns Menusunden SQL,TestNG ve CSS sec

     */
    @Test
    public void test() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");


        WebElement dropDrown=driver.findElement(By.cssSelector("#dropdowm-menu-1"));
        Select selectMenu=new Select(dropDrown);
        selectMenu.selectByValue("sql");

       Thread.sleep(2000);

        WebElement dropDrown1=driver.findElement(By.cssSelector("#dropdowm-menu-2"));
        Select selectMenu1=new Select(dropDrown1);
        selectMenu1.selectByIndex(2);


        Thread.sleep(2000);
        WebElement dropDrown2=driver.findElement(By.cssSelector("#dropdowm-menu-3"));
        Select selectMenu2=new Select(dropDrown2);
        selectMenu2.selectByValue("css");

    }

}
