package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Testingwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alerts");
        WebElement alertbutton = driver.findElement(By.id("timerAlertButton"));
        alertbutton.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

//        driver.get("https://www.pinterest.com/");
//        WebElement alertbb = driver.findElement(By.partialLinkText("About"));
//        alertbb.click();

    }
}
