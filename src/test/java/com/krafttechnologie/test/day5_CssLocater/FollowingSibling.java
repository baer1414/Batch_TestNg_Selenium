package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FollowingSibling {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");
        driver.manage().window().maximize();
        WebElement modul=driver.findElement(By.cssSelector("li[class='nav-item']~li[class='nav-item'] :nth-of-type(1)"));
        modul.click();
    }
}
