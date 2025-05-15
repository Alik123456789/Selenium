package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class TestingAlerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://training-support.net/webelements/alerts");
//        WebElement simplealertbutton  = driver.findElement(By.cssSelector("#simple"));
//        simplealertbutton.click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
        driver.get("https://training-support.net/webelements/selects");
        WebElement singleselectelement = driver.findElement(By.cssSelector("select.h-10"));
        Select singleselectdropdown =  new Select(singleselectelement);
        singleselectdropdown.selectByValue("three");
        singleselectdropdown.selectByVisibleText("Six");
        singleselectdropdown.selectByIndex(1);

        singleselectdropdown.getOptions().forEach(x-> System.out.println(x.getText()));

    }

}
