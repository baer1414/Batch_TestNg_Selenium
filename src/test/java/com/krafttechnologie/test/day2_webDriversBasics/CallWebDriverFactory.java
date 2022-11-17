package com.krafttechnologie.test.day2_webDriversBasics;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechnologie.com/");
        Thread.sleep(3000);
        driver.close();

        driver =new ChromeDriver();
        /**
         * Task
         * go to http://www.krafttechexlab.com/  website
         * expected title = Dashboard- Kraft Techex Lab - aFm
         * get title and verify that expected title equal actual title
         */

        driver.get("http://www.krafttechexlab.com/");

        String expectedTitle="krafttechexlab | Dashboard-Kraft Techex Lab - aFm";

        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Dogrulama gecti");
        }else {
            System.out.println(" Dogrulama GECMEDI");
        }





    }
}
