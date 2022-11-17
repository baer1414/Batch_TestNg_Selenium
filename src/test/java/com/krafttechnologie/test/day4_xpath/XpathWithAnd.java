package com.krafttechnologie.test.day4_xpath;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathWithAnd {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");

      //  WebElement searcbox=driver.findElement(By.xpath("//input[@type='text' and @class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
        WebElement searcbox=driver.findElement(By.xpath("//input[@type='ddtddext' or @class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
        searcbox.sendKeys("Java");
       
    }
}
