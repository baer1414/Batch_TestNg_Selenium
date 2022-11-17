package com.krafttechnologie.test.day2_webDriversBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");

        Thread.sleep(2000);

        driver.close();

        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        driver.quit();//bütün tabları kapatır








    }
}
