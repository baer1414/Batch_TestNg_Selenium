package com.krafttechnologie.test.day_12Actions_FileUploat_Jsexector;

import com.krafttechnologie.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload1 {
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
    public void fileupload() throws InterruptedException {
        driver.get("https://demoqa.com/upload-download");

        WebElement fileup= driver.findElement(By.cssSelector("#uploadFile"));
        Thread.sleep(2000);

        fileup.sendKeys("C:\\Users\\RamizBahar\\Desktop\\Yeni Metin Belgesi.txt");

        WebElement test= driver.findElement(By.cssSelector("#uploadedFilePath"));

        System.out.println("test.getText() = " + test.getText());

        String actu=test.getText();

        String ex="Yeni Metin Belgesi.txt";

        Assert.assertTrue(actu.contains(ex));
    }

}
