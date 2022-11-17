package com.krafttechnologie.test.day2_webDriversBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        //go to google -google git
        //goto facebokk -facebook git
        //back to google google geri dön

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();//polly

        driver.get("https://www.google.com.tr/");

        Thread.sleep(3000);

//navigate to diğer bir selenium metodu web sitelerine erişim
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        //refresh to webpage
        driver.navigate().refresh();

    }
}
