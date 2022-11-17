package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CsssWithClass {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");


        WebElement searBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        searBox.sendKeys("TestNg");
        WebElement searBtn=driver.findElement(By.cssSelector(".nav-search-submit-text.nav-sprite.nav-progressive-attribute"));

        searBtn.click();

        driver.close();

    }
}
