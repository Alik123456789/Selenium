package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        By id =  By.id("my-options");
        WebElement webelementbyid = driver.findElement(id);
        System.out.println("element is displayed"+" "+webelementbyid.isDisplayed());
        By name = By.name("my-text");
        WebElement byname = driver.findElement(name);
        System.out.println("Element is enabled"+" "+byname.isEnabled());
        By classname = By.className("form-control");
        WebElement byclassname = driver.findElement(classname);
        byclassname.click();
        By tagname = By.tagName("input");
        WebElement bytag = driver.findElement(tagname);
        System.out.println(bytag.getSize());
        By olinktext = By.linkText("Return to index");
        WebElement linktextby = driver.findElement(olinktext);
        linktextby.click();
        By part = By.partialLinkText("Return");
        WebElement partial = driver.findElement(part);
        partial.click();




    }
}
