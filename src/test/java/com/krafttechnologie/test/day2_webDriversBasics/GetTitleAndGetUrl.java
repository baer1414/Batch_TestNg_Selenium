package com.krafttechnologie.test.day2_webDriversBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.krafttechnologie.com/");

       String title= driver.getTitle();
        System.out.println(title);

        String currenUrl=driver.getCurrentUrl();
        System.out.println(currenUrl);

        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
    }
}
