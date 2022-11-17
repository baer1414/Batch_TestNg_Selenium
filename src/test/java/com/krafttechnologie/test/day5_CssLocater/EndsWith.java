package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EndsWith {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("https://www.amazon.com/");


        WebElement searBox=driver.findElement(By.cssSelector("input[id$='rchtextbox']"));

        searBox.sendKeys("API");

        WebElement searBtn=driver.findElement(By.cssSelector("input[id$='-button']"));

        searBtn.click();
        driver.close();



    }
}
