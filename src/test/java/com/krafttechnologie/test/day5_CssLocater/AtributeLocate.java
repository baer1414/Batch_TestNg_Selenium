package com.krafttechnologie.test.day5_CssLocater;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtributeLocate {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("https://www.hepsiburada.com/");


        WebElement searBox=driver.findElement(By.cssSelector("input[class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b'][type='text']"));

        searBox.sendKeys("database");

        WebElement searBtn=driver.findElement(By.cssSelector("div[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']"));

        searBtn.click();

        driver.close();
    }
}
