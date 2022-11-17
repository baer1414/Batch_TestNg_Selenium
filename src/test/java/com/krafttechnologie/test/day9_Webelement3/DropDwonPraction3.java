package com.krafttechnologie.test.day9_Webelement3;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropDwonPraction3 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");



        List<WebElement> buttons=driver.findElements(By.cssSelector("#radio-buttons"));
        System.out.println("buttons.size() = " + buttons.size());

        for (WebElement buton:buttons) {
            System.out.println("buton.getText() = " + buton.getText());

        }
        Thread.sleep(2000);

        WebElement blue=driver.findElement(By.cssSelector("input[value='blue']"));
        blue.click();


    }
}
