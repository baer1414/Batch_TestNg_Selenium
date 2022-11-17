package com.krafttechnologie.test.day4_xpath;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathWithContains {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/");

        String text= driver.findElement(By.xpath("//li[contains(text(),'Users')]")).getText();
        System.out.println(text);
    }
}
