package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AsagiDüzeydekiElementeGiderekLocate {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");
        WebElement compenText=driver.findElement(By.cssSelector("div[class='row']>div[class='col-md-4']"));
        System.out.println(compenText.getText());
    }
}
