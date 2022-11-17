package com.krafttechnologie.test.day10_Webelements4;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void twoWindows() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");

        String titleBeforClic=driver.getTitle();
        System.out.println("titleBeforClic = " + titleBeforClic);

        WebElement clic_here =driver.findElement(By.xpath("//a[text()='Click Here']"));
        clic_here.click();
        Thread.sleep(2000);


       // String titleAfterclick= driver.getTitle();
       // System.out.println("titleAfterclick = " + titleAfterclick);

        String currentTab = driver.getWindowHandle();
        System.out.println("currentTab = " + currentTab);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String tab : windowHandles) {
            if(!tab.equals(currentTab))
           driver.switchTo().window(tab);

        }
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }


    @Test
    public void multipleWindows(){
        driver.get("https://the-internet.herokuapp.com/windows");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        WebElement clic_here =driver.findElement(By.xpath("//a[text()='Click Here']"));
        clic_here.click();
        clic_here.click();
        clic_here.click();
        clic_here.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String tab : windowHandles) {

            driver.switchTo().window(tab);
//            if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows/new")){
//                break;
//            }
            if(driver.getTitle().equals("New Window")){
                break;
            }

        }
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
}
