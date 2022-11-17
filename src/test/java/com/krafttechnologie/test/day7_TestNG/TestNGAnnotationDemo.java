package com.krafttechnologie.test.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
    }

    @Test
    public void test1(){
        System.out.println("First test First Assertion");
        Assert.assertEquals("title","title");

        System.out.println("First TestSecond Assertion");
        Assert.assertEquals("url","url");
    }

    @Test
    public  void test2(){
        System.out.println("Second Test Assertion");
        Assert.assertEquals("test2","test2");

    }

    @Test
    public void test3(){
        String expectedTitle="Kraft";
        String actualTitle="Krafttech";
        Assert.assertTrue(actualTitle.contains(expectedTitle),"verify that title starting Kraft");
    }

    @Test
    public void test4(){
        String email="krafttech@gmail.com";
//        if(email.contains(@)){
//            System.out.println("PASS");
//        }else{
//            System.out.println("FAİLD");
//        }

        Assert.assertTrue(email.contains("@"));
    }


    @Test
    public void test5(){
        Assert.assertFalse(0>1,"verify that = is not greater than 1");
    }

    @Test
    public void test6(){
        Assert.assertNotEquals("two","one");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Close Browser");
    }
}
