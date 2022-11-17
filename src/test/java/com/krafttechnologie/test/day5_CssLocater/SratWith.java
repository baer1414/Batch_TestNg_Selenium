package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SratWith {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");


        WebElement searBox=driver.findElement(By.cssSelector("input[id^='twotabse']"));

        searBox.sendKeys("Cucumber");

        WebElement searBtn=driver.findElement(By.cssSelector("input[id^='nav-search-submit-']"));

        searBtn.click();

        driver.close();




    }
}
