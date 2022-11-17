package com.krafttechnologie.test.day8_WebElement2;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class getAttribute {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
@Test
    public void test(){
        driver.get("https://demoqa.com/radio-button");

    WebElement yesButton=driver.findElement(By.cssSelector("#yesRadio"));

    System.out.println("yesButton.getAttribute = " + yesButton.getAttribute("type"));

    System.out.println("yesButton.getAttribute(\"name\") = " + yesButton.getAttribute("name"));
}
}
