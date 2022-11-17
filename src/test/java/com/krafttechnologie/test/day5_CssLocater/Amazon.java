package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        //WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        WebElement searBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        WebElement searchButton=driver.findElement(By.cssSelector("#nav-search-submit-button"));
        searchButton.click();

        driver.close();


    }
}
